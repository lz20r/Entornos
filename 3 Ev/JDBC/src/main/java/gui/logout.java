package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class logout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logout window = new logout();
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
	public logout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Logout");
		frame.setBounds(100, 100, 946, 696);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
