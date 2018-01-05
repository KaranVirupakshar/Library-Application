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

public class IssueMaterial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//IssueMaterial frame = new IssueMaterial();
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
	public IssueMaterial(Library l) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMemberId = new JLabel("Member ID :");
		lblMemberId.setBounds(62, 24, 83, 14);
		contentPane.add(lblMemberId);
		
		JLabel lblMaterilaId = new JLabel("Material ID :");
		lblMaterilaId.setBounds(62, 60, 83, 14);
		contentPane.add(lblMaterilaId);
		
		textField = new JTextField();
		textField.setBounds(155, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 57, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Issue Material");
		btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i,j;
				for(i=0;i<Library.memcount;i++)
				{
					if(l.members[i].memID.equalsIgnoreCase(textField.getText()))
					{
						for(j=0;j<Library.libcount;j++)
						{
							if(l.materials[j].materialId.equalsIgnoreCase(textField_1.getText()))
							{
								l.materials[j].quantity=l.materials[j].quantity-1;
								l.members[i].material=l.materials[j];
								l.members[i].material.returncheck="Issued";
								l.members[i].issuedDay=Integer.parseInt(textField_2.getText());
								l.members[i].issuedMonth=Integer.parseInt(textField_3.getText());
								break;
							}
						}
						break;
					}
				}
				JOptionPane.showMessageDialog(null, "Material Issued!");
				dispose();
			}
		});
		btnNewButton.setBounds(92, 145, 132, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblIssuedDay = new JLabel("Issued Day :");
		lblIssuedDay.setBounds(62, 96, 83, 14);
		contentPane.add(lblIssuedDay);
		
		textField_2 = new JTextField();
		textField_2.setBounds(155, 93, 21, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("/");
		label.setBounds(179, 96, 46, 14);
		contentPane.add(label);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(186, 93, 21, 20);
		contentPane.add(textField_3);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFont(new Font("Rockwell", Font.BOLD, 12));
		button.setBackground(new Color(240, 128, 128));
		button.setBounds(215, 227, 89, 23);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\polygonal-abstract-background-design_23-2147493966.jpg"));
		label_1.setBounds(0, 0, 334, 261);
		contentPane.add(label_1);
	}
}
