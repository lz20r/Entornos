package students;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import connection.GetConnection;

public class student {
    JFrame frame;
    private JTextField Id; 
    private JTextField Nombre;
    private JTextField Apellido;
    private JTextField Apellido_2;
    private JTextField Telefono;
    private JTextField Correo;
    private JTextField Calificacion;
    private JTextField Usuario;
    private JPasswordField Contraseña;

    private JLabel id;
    private JLabel name;
    private JLabel firstName;
    private JLabel lastName;
    private JLabel phone;
    private JLabel course;
    private JLabel mail;
    private JLabel grade;
    private JLabel username; 
    private JLabel password; 

    private JTextField generalId;
    private JTextField generalNombre;
    private JTextField generalCalificacion;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    student window = new student();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public student() {
        initialize();
    }

    /**
     * Database functions
     */
    public void databaseConnection() {
        try {
            GetConnection conexion = new GetConnection();
            Connection miConexion = conexion.obtenerConexion();

            if (miConexion != null) {
                JOptionPane.showMessageDialog(null, "Conexión exitosa", "DATABASE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo establecer conexión.", "DATABASE",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Conexión Fallida" + ex.getMessage(), "DATABASE",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ejecutarSentenciaSQL(String consultaSQL) {
        try {
            GetConnection conexion = new GetConnection();
            Connection miConexion = conexion.obtenerConexion();
            if (miConexion != null) {
                try (PreparedStatement statement = miConexion.prepareStatement(consultaSQL)) {
                    statement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Ejecución exitosa", "Sentencia SQL",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ejecución Fallida" + ex.getMessage(), "Sentencia SQL",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo establecer conexión.", "DATABASE",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Conexión Fallida" + ex.getMessage(), "DATABASE",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarDatosGenerales() {
        try {
            GetConnection conexion = new GetConnection();
            Connection miConexion = conexion.obtenerConexion();
            if (miConexion != null) {
                String consultaSQL = "SELECT id, nombre, calificacion FROM students ORDER BY id DESC LIMIT 1";
                try (PreparedStatement statement = miConexion.prepareStatement(consultaSQL)) {
                    ResultSet resultSet = statement.executeQuery();
                    if (resultSet.next()) {
                        generalId.setText(String.valueOf(resultSet.getInt("id")));
                        generalNombre.setText(resultSet.getString("nombre"));
                        generalCalificacion.setText(String.valueOf(resultSet.getFloat("calificacion")));
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontraron datos.", "Datos generales",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al cargar datos" + ex.getMessage(), "Datos generales",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo establecer conexión.", "DATABASE",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Conexión Fallida" + ex.getMessage(), "DATABASE",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Initialize the contents of the frame.
     */ 
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void initialize() {

        frame = new JFrame("Students");
        frame.getContentPane().setBackground(new Color(30, 30, 30));
        frame.setBounds(100, 100, 1235, 921);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel student = new JPanel();
        student.setBackground(new Color(30, 30, 30));
        student.setBounds(31, 23, 581, 409);
        frame.getContentPane().add(student);
        student.setLayout(null);

        JLabel LName = new JLabel("Alumno");
        LName.setBounds(264, 6, 166, 54);
        student.add(LName);
        LName.setFont(new Font("Segoe UI", Font.PLAIN, 40));
        LName.setForeground(Color.WHITE);


        name = new JLabel("Nombre");
        name.setBounds(60, 77, 78, 25);
        student.add(name);
        name.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        name.setForeground(Color.WHITE);

        Nombre = new JTextField();
        Nombre.setBounds(161, 76, 414, 26);
        student.add(Nombre);
        Nombre.setColumns(10);

        firstName = new JLabel("1º Apellido");
        firstName.setBounds(40, 114, 109, 25);
        student.add(firstName);
        firstName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        firstName.setForeground(Color.WHITE);

        Apellido = new JTextField();
        Apellido.setBounds(161, 113, 414, 26);
        student.add(Apellido);
        Apellido.setColumns(10);

        lastName = new JLabel("2º Apellido");
        lastName.setBounds(40, 151, 109, 25);
        student.add(lastName);
        lastName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lastName.setForeground(Color.WHITE);

        Apellido_2 = new JTextField();
        Apellido_2.setBounds(161, 150, 414, 26);
        student.add(Apellido_2);
        Apellido_2.setColumns(10);

        phone = new JLabel("Telefono");
        phone.setBounds(65, 189, 84, 25);
        student.add(phone);
        phone.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        phone.setForeground(Color.WHITE);

        Telefono = new JTextField();
        Telefono.setBounds(161, 188, 414, 26);
        student.add(Telefono);
        Telefono.setColumns(10);

        course = new JLabel("Curso");
        course.setBounds(82, 224, 56, 25);
        student.add(course);
        course.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        course.setForeground(Color.WHITE);

        final JComboBox<?> Curso = new JComboBox();
        Curso.setBounds(161, 223, 414, 26);
        Curso.setBackground(new Color(255, 255, 255));
        student.add(Curso);
        Curso.setModel(new DefaultComboBoxModel(new String[] { "Elegir", "DAW 1º", "DAW 2º", "DAM 1º", "DAM 2º" }));

        mail = new JLabel("Email");
        mail.setBounds(82, 261, 56, 25);
        student.add(mail);
        mail.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        mail.setForeground(Color.WHITE);

        Correo = new JTextField();
        Correo.setBounds(161, 260, 414, 26);
        student.add(Correo);
        Correo.setColumns(10);
        
        username = new JLabel("Usuario");
        username.setForeground(Color.WHITE);
        username.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        username.setBounds(70, 298, 68, 25);
        student.add(username);
        
        Usuario = new JTextField();
        Usuario.setColumns(10);
        Usuario.setBounds(161, 297, 414, 26);
        student.add(Usuario);
        
        password = new JLabel("Contraseña");
        password.setForeground(Color.WHITE);
        password.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        password.setBounds(45, 335, 104, 25);
        student.add(password);
        
        Contraseña = new JPasswordField();
        Contraseña.setColumns(10);
        Contraseña.setBounds(161, 334, 414, 26);
        student.add(Contraseña);

     // Inicializar el botón Enviar
        final JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setForeground(Color.BLACK);
        btnEnviar.setBounds(296, 377, 78, 26);
        btnEnviar.setBackground(new Color(233, 150, 122));
        btnEnviar.setEnabled(false); // Inicialmente deshabilitado
        student.add(btnEnviar);

        // Añadir ActionListener para el botón Enviar
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los campos de texto 
                String nombre = Nombre.getText();
                String apellido = Apellido.getText();
                String apellido2 = Apellido_2.getText();
                String telefono = Telefono.getText();
                String curso = (String) Curso.getSelectedItem(); // Obtener el curso seleccionado del ComboBox
                String correo = Correo.getText();
                String usuario = Usuario.getText();
                String contraseña = new String(Contraseña.getPassword());
                
                // Construir la sentencia SQL para insertar los datos en la tabla de registros
                String query = "INSERT INTO students (nombre, primer_apellido, segundo_apellido, telefono, curso, correo, usuario, contraseña) "
                             + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                
                // Ejecutar la sentencia SQL utilizando la función existente
                try {
                    GetConnection conexion = new GetConnection();
                    Connection miConexion = conexion.obtenerConexion();
                    if (miConexion != null) {
                        try (PreparedStatement statement = miConexion.prepareStatement(query)) {
                            statement.setString(1, nombre);
                            statement.setString(2, apellido);
                            statement.setString(3, apellido2);
                            statement.setString(4, telefono);
                            statement.setString(5, curso);
                            statement.setString(6, correo);
                            statement.setString(7, usuario);
                            statement.setString(8, contraseña);
                            statement.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Ejecución exitosa", "Sentencia SQL",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Ejecución Fallida: " + ex.getMessage(), "Sentencia SQL",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo establecer conexión.", "DATABASE",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Conexión Fallida: " + ex.getMessage(), "DATABASE",
                            JOptionPane.ERROR_MESSAGE);
                }
                
                // Limpiar los campos de texto después de enviar los datos 
                Nombre.setText("");
                Apellido.setText("");
                Apellido_2.setText("");
                Telefono.setText("");
                Curso.setSelectedIndex(0); // Establecer el ComboBox de curso en el primer elemento
                Correo.setText("");
                Usuario.setText("");
                Contraseña.setText("");

                // Deshabilitar el botón de enviar
                btnEnviar.setEnabled(false);
            }
        });

        // DocumentListener para habilitar el botón Enviar solo cuando todos los campos estén llenos
        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {
                checkFields();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                checkFields();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkFields();
            } 
             
            private void checkFields() {
                boolean allFieldsFilled =  
                        !Nombre.getText().isEmpty() && 
                        !Apellido.getText().isEmpty() && 
                        !Apellido_2.getText().isEmpty() && 
                        !Telefono.getText().isEmpty() &&  
                        !Correo.getText().isEmpty() && 
                        !Usuario.getText().isEmpty() && 
                        Contraseña.getPassword().length > 0 &&
                        !Curso.getSelectedItem().equals("Elegir"); 
                btnEnviar.setEnabled(allFieldsFilled);
            }  
        }; 

        Nombre.getDocument().addDocumentListener(documentListener);
        Apellido.getDocument().addDocumentListener(documentListener);
        Apellido_2.getDocument().addDocumentListener(documentListener);
        Telefono.getDocument().addDocumentListener(documentListener);
        Correo.getDocument().addDocumentListener(documentListener);
        Usuario.getDocument().addDocumentListener(documentListener);
        Contraseña.getDocument().addDocumentListener(documentListener);

        // Añadir ItemListener al ComboBox para verificar si se ha seleccionado un curso
        Curso.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                checkFields();
            }

            private void checkFields() {
                boolean allFieldsFilled =  
                        !Nombre.getText().isEmpty() && 
                        !Apellido.getText().isEmpty() && 
                        !Apellido_2.getText().isEmpty() && 
                        !Telefono.getText().isEmpty() &&  
                        !Correo.getText().isEmpty() && 
                        !Usuario.getText().isEmpty() && 
                        Contraseña.getPassword().length > 0 &&
                        !Curso.getSelectedItem().equals("Elegir"); 
                btnEnviar.setEnabled(allFieldsFilled);
            }
        });


        // Panel 2 start here
        JPanel updatestudent = new JPanel();
        updatestudent.setLayout(null);
        updatestudent.setBackground(new Color(30, 30, 30));
        updatestudent.setBounds(31, 438, 581, 416);
        frame.getContentPane().add(updatestudent);

        JLabel Datos = new JLabel("Dato alumno Actualizar");
        Datos.setFont(new Font("Segoe UI", Font.BOLD, 35));
        Datos.setBounds(85, 5, 405, 48);
        updatestudent.add(Datos);
        Datos.setForeground(Color.WHITE);

        id = new JLabel("ID");
        id.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        id.setBounds(43, 61, 21, 25);
        updatestudent.add(id);
        id.setForeground(Color.WHITE);

        Id = new JTextField();
        Id.setFont(new Font("Segoe UI", Font.PLAIN, 9));
        Id.setColumns(10);
        Id.setBounds(163, 63, 327, 26);
        updatestudent.add(Id);

        name = new JLabel("Nombre");
        name.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        name.setBounds(43, 98, 78, 25);
        updatestudent.add(name);
        name.setForeground(Color.WHITE);

        Nombre = new JTextField();
        Nombre.setColumns(10);
        Nombre.setBounds(163, 100, 327, 26);
        updatestudent.add(Nombre);

        firstName = new JLabel("1º Apellido");
        firstName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        firstName.setBounds(43, 135, 109, 25);
        updatestudent.add(firstName);
        firstName.setForeground(Color.WHITE);

        Apellido = new JTextField();
        Apellido.setColumns(10);
        Apellido.setBounds(163, 137, 327, 26);
        updatestudent.add(Apellido);

        lastName = new JLabel("2º Apellido");
        lastName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lastName.setBounds(43, 174, 109, 25);
        updatestudent.add(lastName);
        lastName.setForeground(Color.WHITE);

        Apellido = new JTextField();
        Apellido.setColumns(10);
        Apellido.setBounds(163, 173, 327, 26);
        updatestudent.add(Apellido);

        phone = new JLabel("Telefono");
        phone.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        phone.setBounds(43, 209, 84, 25);
        updatestudent.add(phone);
        phone.setForeground(Color.WHITE);

        Telefono = new JTextField();
        Telefono.setColumns(10);
        Telefono.setBounds(163, 213, 327, 26);
        updatestudent.add(Telefono);

        course = new JLabel("Curso");
        course.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        course.setBounds(43, 246, 56, 25);
        updatestudent.add(course);
        course.setForeground(Color.WHITE);

        mail = new JLabel("Email");
        mail.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        mail.setBounds(43, 285, 56, 25);
        updatestudent.add(mail);
        mail.setForeground(Color.WHITE);

        Correo = new JTextField();
        Correo.setColumns(10);
        Correo.setBounds(163, 285, 327, 25);
        updatestudent.add(Correo);

        JButton BuscarId = new JButton("Buscar");
        BuscarId.setForeground(Color.BLACK);
        BuscarId.setBounds(493, 63, 78, 28);
        updatestudent.add(BuscarId);

        JButton btnBuscarTelefono = new JButton("Buscar");
        btnBuscarTelefono.setForeground(Color.BLACK);
        btnBuscarTelefono.setBounds(493, 212, 78, 26);
        updatestudent.add(btnBuscarTelefono);

        JButton btnModificarEmail = new JButton("Modificar");
        btnModificarEmail.setForeground(Color.BLACK);
        btnModificarEmail.setBounds(256, 320, 96, 29);
        updatestudent.add(btnModificarEmail);

        JButton btnBuscarEmail = new JButton("Buscar");
        btnBuscarEmail.setForeground(Color.BLACK);
        btnBuscarEmail.setBounds(163, 320, 84, 29);
        updatestudent.add(btnBuscarEmail);

        JButton btnNext = new JButton("Next >");
        btnNext.setBackground(new Color(233, 150, 122));
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNext.setForeground(Color.BLACK);
        btnNext.setBounds(43, 376, 118, 29);
        updatestudent.add(btnNext);

        JButton btnEliminarAlumno = new JButton("Eliminar Alumno");
        btnEliminarAlumno.setForeground(Color.RED);
        btnEliminarAlumno.setBounds(362, 320, 128, 29);
        updatestudent.add(btnEliminarAlumno);

        JComboBox course = new JComboBox();
        course.setModel(new DefaultComboBoxModel(new String[] { "Elegir", "DAW 1º", "DAW 2º", "DAM 1º", "DAM 2º" }));
        course.setBackground(Color.WHITE);
        course.setBounds(163, 249, 327, 27);
        updatestudent.add(course);

        JButton conexion = new JButton("Conexión");
        conexion.setBackground(new Color(233, 150, 122));
        conexion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                databaseConnection();
            }
        });
        conexion.setForeground(Color.BLACK);
        conexion.setBounds(471, 378, 100, 25);
        updatestudent.add(conexion);
        

        Correo = new JTextField();
        Correo.setColumns(10);
        Correo.setBounds(163, 285, 327, 26);
        updatestudent.add(Correo);

        JPanel generaldata = new JPanel();
        generaldata.setLayout(null);
        generaldata.setBackground(new Color(30, 30, 30));
        generaldata.setBounds(624, 23, 566, 831);
        frame.getContentPane().add(generaldata);

        JLabel DatosGeneral = new JLabel("Datos general");
        DatosGeneral.setFont(new Font("Segoe UI", Font.BOLD, 40));
        DatosGeneral.setBounds(131, 12, 296, 48);
        generaldata.add(DatosGeneral);
        DatosGeneral.setForeground(Color.WHITE);

        id = new JLabel("ID");
        id.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        id.setBounds(59, 70, 21, 25);
        generaldata.add(id);
        id.setForeground(Color.WHITE);

        generalId = new JTextField(); 
        generalId.setColumns(10);
        generalId.setBounds(38, 101, 69, 724);
        generaldata.add(generalId);
        
        name = new JLabel("Nombre");
        name.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        name.setBounds(226, 70, 78, 25);
        generaldata.add(name);
        name.setForeground(Color.WHITE);

        generalNombre = new JTextField();
        generalNombre.setColumns(10);
        generalNombre.setBounds(160, 101, 207, 724);
        generaldata.add(generalNombre);

        grade = new JLabel("Calificacion");
        grade.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        grade.setBounds(410, 70, 118, 25);
        generaldata.add(grade);
        grade.setForeground(Color.WHITE);

        generalCalificacion = new JTextField();
        generalCalificacion.setColumns(10);
        generalCalificacion.setBounds(410, 101, 118, 724);
        generaldata.add(generalCalificacion);
    }

    protected void setEnabled(boolean allFieldsFilled) {
        // TODO Auto-generated method stub
        
    }
}