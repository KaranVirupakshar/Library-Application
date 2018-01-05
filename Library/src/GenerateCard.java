import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class GenerateCard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//GenerateCard frame = new GenerateCard();
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
	public GenerateCard(Library l) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMemberId = new JLabel("Member ID :");
		lblMemberId.setBounds(20, 24, 97, 14);
		contentPane.add(lblMemberId);
		
		textField = new JTextField();
		textField.setBounds(93, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		
		JButton btnGenerateCard = new JButton("Library Card");
		btnGenerateCard.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnGenerateCard.setBackground(SystemColor.inactiveCaption);
		btnGenerateCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i=0;i<Library.memcount;i++)
				{
					if(l.members[i].memID.equalsIgnoreCase(textField.getText()))
					{
						if(l.members[i].material.returncheck==null)
							JOptionPane.showMessageDialog(null, "Material not issued!");
						else
							textArea.append("Member Details"+"\n"+"ID    :  "+l.members[i].memID+"\n"+"Name  : "+l.members[i].memName+"\n\n"+"Issued Material"+"\n"+"ID    : "+l.members[i].material.materialId+"\n"+"Name  : "+l.members[i].material.materialName+"\n"+"Author :"+l.members[i].material.author);
					}
				}
			}
		});
		btnGenerateCard.setBounds(198, 20, 121, 23);
		contentPane.add(btnGenerateCard);
		
	
		textArea.setBounds(20, 60, 299, 145);
		contentPane.add(textArea);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFont(new Font("Rockwell", Font.BOLD, 12));
		button.setBackground(new Color(240, 128, 128));
		button.setBounds(230, 227, 89, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\polygonal-abstract-background-design_23-2147493966.jpg"));
		label.setBounds(0, -1, 354, 262);
		contentPane.add(label);
	}
}
