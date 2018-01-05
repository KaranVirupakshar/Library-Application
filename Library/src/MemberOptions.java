import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class MemberOptions extends JFrame{

	private JPanel contentPane;
	//Library lib1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//MemberOptions frame = new MemberOptions();
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
	public MemberOptions(Library l) {
		Member m=new Member();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnsearchMaterial = new JButton("Search Material");
		btnsearchMaterial.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnsearchMaterial.setBackground(SystemColor.inactiveCaption);
		btnsearchMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchMaterial frame = new SearchMaterial(l);
				frame.setVisible(true);
			}
		});
		btnsearchMaterial.setBounds(10, 52, 147, 23);
		contentPane.add(btnsearchMaterial);
		
		JButton btncheckDueDate = new JButton("Display All");
		btncheckDueDate.setFont(new Font("Monospaced", Font.BOLD, 11));
		btncheckDueDate.setBackground(SystemColor.inactiveCaption);
		btncheckDueDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				DisplayAll frame = new DisplayAll(l);
				frame.setVisible(true);
			}
		});
		btncheckDueDate.setBounds(10, 105, 147, 23);
		contentPane.add(btncheckDueDate);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(240, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Search for book/journal with the material name");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel.setBounds(165, 55, 269, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Display all the books/journals existing in library");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(165, 108, 269, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\506283369.jpg"));
		lblNewLabel_2.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_2);
	}
}
