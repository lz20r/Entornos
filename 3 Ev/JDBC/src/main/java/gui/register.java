package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class register {

	private JFrame frame; 
	private JLabel name;
	private JLabel firstname;
	private JLabel lastname;
	private JLabel phone;
	private JLabel course;
	private JLabel mail;
	private JLabel username;
	private JLabel password;
	private JLabel profilePic; 
	private JTextField Nombre;
	private JTextField Apellido;
	private JTextField Apellido_2;
	private JTextField Telefono; 
	private JTextField Correo;
	private JTextField Usuario; 
	private JPasswordField Contraseña;
	private JButton registro; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
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
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Register");
		frame.setBounds(100, 100, 589, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel register = new JPanel();
		register.setBackground(new Color(30, 30, 30));
		register.setBounds(0, 6, 575, 484);
		frame.getContentPane().add(register);
		register.setLayout(null);
		
		JLabel Registro = new JLabel("Registro");
		Registro.setBounds(234, 18, 147, 54);
		Registro.setVerticalAlignment(SwingConstants.TOP);
		register.add(Registro);
		Registro.setFont(new Font("Segoe UI", Font.PLAIN, 40));
		Registro.setForeground(Color.WHITE);

		// Agrega la foto de perfil desde una URL
		profilePic = new JLabel();
		profilePic.setBounds(26, 122, 243, 242);
		register.add(profilePic);

		try {
			// URL de la imagen de perfil
			URL url = new URL("https://i.ibb.co/9rMM2WB/cinammon-logo.png");
			// Carga la imagen desde la URL
			BufferedImage image = ImageIO.read(url);
			// Escala la imagen al tamaño deseado
			Image scaledImage = image.getScaledInstance(profilePic.getWidth(), profilePic.getHeight(),
					Image.SCALE_SMOOTH);
			// Asigna la imagen al JLabel de la foto de perfil
			profilePic.setIcon(new ImageIcon(scaledImage));

		} catch (Exception e) {
			e.printStackTrace();
		}

		name = new JLabel("Nombre");
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		name.setBounds(292, 107, 56, 17);
		register.add(name);

		Nombre = new JTextField();
		Nombre.setBounds(365, 102, 180, 29);
		register.add(Nombre);


		firstname = new JLabel("1ª Apellido");
		firstname.setForeground(Color.WHITE);
		firstname.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		firstname.setBounds(275, 148, 78, 17);
		register.add(firstname);

		Apellido = new JTextField();
		Apellido.setBounds(365, 143, 180, 29);
		register.add(Apellido);

		lastname = new JLabel("2º Apellido");
		lastname.setForeground(Color.WHITE);
		lastname.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lastname.setBounds(275, 189, 78, 17);
		register.add(lastname);

		Apellido_2 = new JTextField();
		Apellido_2.setBounds(365, 184, 180, 29);
		register.add(Apellido_2);

		phone = new JLabel("Teléfono");
		phone.setForeground(Color.WHITE);
		phone.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		phone.setBounds(292, 230, 56, 17);
		register.add(phone);

		Telefono = new JPasswordField();
		Telefono.setBounds(365, 225, 180, 29);
		register.add(Telefono);

		course = new JLabel("course");
		course.setForeground(Color.WHITE);
		course.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		course.setBounds(305, 271, 43, 17);
		register.add(course);

		final JComboBox<?> Curso = new JComboBox();
		Curso.setBounds(365, 267, 180, 26);
		Curso.setBackground(new Color(255, 255, 255));
		register.add(Curso);
		Curso.setModel(new DefaultComboBoxModel(new String[] { "Elegir", "DAW 1º", "DAW 2º", "DAM 1º", "DAM 2º" }));

		mail = new JLabel("Correo");
		mail.setForeground(Color.WHITE);
		mail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mail.setBounds(305, 311, 43, 17);
		register.add(mail);

		Correo = new JPasswordField();
		Correo.setBounds(365, 306, 180, 29);
		register.add(Correo);

		username = new JLabel("Usuario");
		username.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		username.setForeground(Color.WHITE);
		username.setBounds(292, 347, 56, 17);
		register.add(username);
		
		Usuario = new JTextField();
		Usuario.setBounds(365, 342, 180, 29);
		register.add(Usuario); 

		password = new JLabel("Contraseña");
		password.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		password.setForeground(Color.WHITE);
		password.setBounds(275, 388, 78, 17);
		register.add(password);
		
		Contraseña = new JPasswordField();
		Contraseña.setBounds(365, 383, 180, 29);
		register.add(Contraseña);
		
		registro = new JButton("Registrarse");
		registro.setFont(new Font("Segoe UI", Font.BOLD, 14));
		registro.setBackground(new Color(255, 218, 185));
		registro.setForeground(Color.BLACK);
		registro.setBounds(365, 434, 180, 29);
		register.add(registro);
				
		frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
	}
}
