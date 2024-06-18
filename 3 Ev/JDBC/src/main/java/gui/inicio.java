package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

public class inicio {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;
	private JLabel profilePic;
	private JButton inicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio window = new inicio();
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
	public inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login");
		frame.setBounds(100, 100, 644, 249);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel login = new JPanel();
		login.setBackground(new Color(30, 30, 30));
		login.setBounds(0, 6, 630, 206);
		frame.getContentPane().add(login);
		login.setLayout(null);

		JLabel usuario = new JLabel("Usuario");
		usuario.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		usuario.setForeground(Color.WHITE);
		usuario.setBounds(295, 54, 58, 17);
		login.add(usuario);

		JLabel contraseña = new JLabel("Contraseña");
		contraseña.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		contraseña.setForeground(Color.WHITE);
		contraseña.setBounds(275, 100, 78, 17);
		login.add(contraseña);

		username = new JTextField();
		username.setBounds(365, 49, 180, 29);
		login.add(username);
		username.setColumns(10);

		password = new JPasswordField();
		password.setBounds(365, 95, 180, 29);
		login.add(password);

		inicio = new JButton("Iniciar Sesión");
		inicio.setFont(new Font("Segoe UI", Font.BOLD, 14));
		inicio.setBackground(new Color(233, 150, 122));
		inicio.setForeground(Color.WHITE);
		inicio.setBounds(365, 147, 150, 40);
		login.add(inicio);

		// Agrega la foto de perfil desde una URL
		profilePic = new JLabel();
		profilePic.setBounds(49, 21, 172, 166);
		login.add(profilePic);

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

		frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
	}
}