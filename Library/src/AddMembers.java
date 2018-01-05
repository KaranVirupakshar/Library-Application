import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class AddMembers extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//AddMembers frame = new AddMembers();
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
	public AddMembers(Library l) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mem ID :");
		lblNewLabel.setBounds(69, 27, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMemName = new JLabel("Mem Name :");
		lblMemName.setBounds(69, 58, 105, 14);
		contentPane.add(lblMemName);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setBounds(69, 93, 86, 14);
		contentPane.add(lblDepartment);
		
		textField = new JTextField();
		textField.setBounds(172, 24, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 55, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(172, 90, 86, 20);
		contentPane.add(textField_2);
		
		JButton btnAddMember = new JButton("Add Member");
		btnAddMember.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnAddMember.setBackground(SystemColor.inactiveCaption);
		btnAddMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l.members[Library.memcount]=new Member(textField.getText(),textField_1.getText(),textField_2.getText());
				JOptionPane.showMessageDialog(null, "Member Added!");
			}
		});
		btnAddMember.setBounds(103, 134, 117, 23);
		contentPane.add(btnAddMember);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFont(new Font("Rockwell", Font.BOLD, 12));
		button.setBackground(new Color(240, 128, 128));
		button.setBounds(235, 227, 89, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\polygonal-abstract-background-design_23-2147493966.jpg"));
		label.setBounds(0, 0, 334, 261);
		contentPane.add(label);
	}
}
