import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class LibLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//LibLogin frame = new LibLogin();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LibLogin(Library l) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setBounds(133, 55, 66, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(133, 96, 66, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(209, 52, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 93, 86, 20);
		contentPane.add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnLogin.setBackground(SystemColor.inactiveCaption);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("admin") && passwordField.getText().equals("admin"))
				{
					JOptionPane.showMessageDialog(null, "Logged In!");
					LibrarianOptions frame = new LibrarianOptions(l);
					frame.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
				}
			}
		});
		btnLogin.setBounds(168, 152, 89, 23);
		contentPane.add(btnLogin);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\506283369.jpg"));
		label.setBounds(0, 0, 434, 261);
		contentPane.add(label);
	}
}
