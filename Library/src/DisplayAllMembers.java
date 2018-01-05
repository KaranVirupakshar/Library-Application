import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class DisplayAllMembers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//DisplayAllMembers frame = new DisplayAllMembers();
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
	public DisplayAllMembers(Library l) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 50, 302, 161);
		contentPane.add(textArea);
		
		JLabel lblMemId = new JLabel("Mem ID");
		lblMemId.setBackground(new Color(240, 128, 128));
		lblMemId.setBounds(12, 34, 65, 14);
		contentPane.add(lblMemId);
		
		JLabel lblMemName = new JLabel("Mem Name");
		lblMemName.setBounds(99, 34, 89, 14);
		contentPane.add(lblMemName);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(245, 34, 94, 14);
		contentPane.add(lblDepartment);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFont(new Font("Rockwell", Font.BOLD, 12));
		button.setBackground(new Color(240, 128, 128));
		button.setBounds(223, 227, 89, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\polygonal-abstract-background-design_23-2147493966.jpg"));
		lblNewLabel.setBounds(0, 0, 329, 261);
		contentPane.add(lblNewLabel);
		
		int i;
		for(i=0;i<Library.memcount;i++)
		{
			textArea.append(l.members[i].memID+"\t"+l.members[i].memName+"\t\t"+l.members[i].department);
			textArea.append("\n");
		}
	}
}
