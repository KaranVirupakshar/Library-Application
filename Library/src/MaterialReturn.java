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

public class MaterialReturn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//MaterialReturn frame = new MaterialReturn();
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
	public MaterialReturn(Library l) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMemberId = new JLabel("Member ID :");
		lblMemberId.setBounds(66, 31, 91, 14);
		contentPane.add(lblMemberId);
		
		textField = new JTextField();
		textField.setBounds(156, 28, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBackground(SystemColor.inactiveCaption);
		btnReturn.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i,j,check=0;;
				for(i=0;i<Library.memcount;i++)
				{
					if(l.members[i].memID.equalsIgnoreCase(textField.getText()))
					{
						for(j=0;j<Library.libcount;j++)
						{
							if(l.materials[j].materialId.equalsIgnoreCase(textField_1.getText())&&l.members[i].material.returncheck!=null)
							{
								l.materials[j].quantity=l.materials[j].quantity+1;
								l.members[i].material.returncheck=null;
								check=1;
								break;
							}
						}
						break;
					}
				}
				if(check==0)
				{
					JOptionPane.showMessageDialog(null, "No Materials to Return!");
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Material Returned!");
					dispose();
				}
			}
		});
		btnReturn.setBounds(176, 197, 100, 23);
		contentPane.add(btnReturn);
		
		JLabel lblMaterialId = new JLabel("Material ID :");
		lblMaterialId.setBounds(66, 72, 91, 14);
		contentPane.add(lblMaterialId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 69, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnGetFine = new JButton("Get Fine");
		btnGetFine.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnGetFine.setBackground(SystemColor.inactiveCaption);
		btnGetFine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int isd=0,ism=0,red=0,rem=0,fine=0;
				int i;
				for(i=0;i<Library.memcount;i++)
				{
					if(l.members[i].memID.equalsIgnoreCase(textField.getText()))
					{
						isd=l.members[i].issuedDay;
						ism=l.members[i].issuedMonth;
					}
				}
				red=Integer.parseInt(textField_2.getText());
				rem=Integer.parseInt(textField_3.getText());
				
				if((red-isd)>10)
					fine=10;
				if((red-isd)>15)
					fine=20;
				if((red-isd)>20)
					fine=40;
				
				textField_4.setText(fine+"");
			}
		});
		btnGetFine.setBounds(50, 197, 107, 23);
		contentPane.add(btnGetFine);
		
		JLabel lblReturnDay = new JLabel("Return Day :");
		lblReturnDay.setBounds(66, 111, 91, 14);
		contentPane.add(lblReturnDay);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 108, 22, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("/");
		label.setBounds(185, 111, 46, 14);
		contentPane.add(label);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(195, 108, 22, 20);
		contentPane.add(textField_3);
		
		JLabel lblFine = new JLabel("Fine :");
		lblFine.setBounds(66, 147, 46, 14);
		contentPane.add(lblFine);
		
		textField_4 = new JTextField();
		textField_4.setBounds(156, 149, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFont(new Font("Rockwell", Font.BOLD, 12));
		button.setBackground(new Color(240, 128, 128));
		button.setBounds(235, 267, 89, 23);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\polygonal-abstract-background-design_23-2147493966.jpg"));
		label_1.setBounds(0, 0, 334, 301);
		contentPane.add(label_1);
	}
}
