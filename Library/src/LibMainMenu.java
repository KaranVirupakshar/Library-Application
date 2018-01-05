import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class LibMainMenu extends JFrame {

	private JPanel contentPane;
	Library lib=new Library(1234,687987);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibMainMenu frame = new LibMainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LibMainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("LIBRARIAN");
		btnNewButton.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibLogin frame = new LibLogin(lib);
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(147, 87, 123, 33);
		contentPane.add(btnNewButton);
		
		JButton btnMember = new JButton("MEMBER");
		btnMember.setBackground(SystemColor.inactiveCaption);
		btnMember.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
		btnMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MemberOptions frame = new MemberOptions(lib);
				frame.setVisible(true);
			}
		});
		btnMember.setBounds(147, 146, 123, 33);
		contentPane.add(btnMember);
		
		JLabel lblAbcLibraryXyz = new JLabel("ABC Library");
		lblAbcLibraryXyz.setForeground(Color.BLACK);
		lblAbcLibraryXyz.setBackground(Color.WHITE);
		lblAbcLibraryXyz.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblAbcLibraryXyz.setBounds(158, 25, 180, 23);
		contentPane.add(lblAbcLibraryXyz);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\506283369.jpg"));
		label.setBounds(0, 0, 434, 261);
		contentPane.add(label);
	}
}
