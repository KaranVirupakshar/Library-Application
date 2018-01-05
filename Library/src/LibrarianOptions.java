import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class LibrarianOptions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//LibrarianOptions frame = new LibrarianOptions();
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
	public LibrarianOptions(Library l) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddMaterial = new JButton("Add Material");
		btnAddMaterial.setBackground(SystemColor.inactiveCaption);
		btnAddMaterial.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnAddMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMaterials frame = new AddMaterials(l);
				frame.setVisible(true);
			}
		});
		btnAddMaterial.setBounds(10, 30, 150, 23);
		contentPane.add(btnAddMaterial);
		
		JButton btnAddMember = new JButton("Add Member");
		btnAddMember.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnAddMember.setBackground(SystemColor.inactiveCaption);
		btnAddMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddMembers frame = new AddMembers(l);
				frame.setVisible(true);
			}
		});
		btnAddMember.setBounds(10, 64, 150, 23);
		contentPane.add(btnAddMember);
		
		JButton btnIssueMaterial = new JButton("Issue Material");
		btnIssueMaterial.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnIssueMaterial.setBackground(SystemColor.inactiveCaption);
		btnIssueMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueMaterial frame = new IssueMaterial(l);
				frame.setVisible(true);
			}
		});
		btnIssueMaterial.setBounds(10, 142, 150, 23);
		contentPane.add(btnIssueMaterial);
		
		JButton btnGenerateCard = new JButton("Generate Card");
		btnGenerateCard.setBackground(SystemColor.inactiveCaption);
		btnGenerateCard.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnGenerateCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GenerateCard frame = new GenerateCard(l);
				frame.setVisible(true);
			}
		});
		btnGenerateCard.setBounds(10, 176, 150, 23);
		contentPane.add(btnGenerateCard);
		
		JButton btnReturnMaterial = new JButton("Material Return");
		btnReturnMaterial.setBackground(SystemColor.inactiveCaption);
		btnReturnMaterial.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnReturnMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MaterialReturn frame = new MaterialReturn(l);
				frame.setVisible(true);
			}
		});
		btnReturnMaterial.setBounds(10, 216, 150, 23);
		contentPane.add(btnReturnMaterial);
		
		JLabel lblAddBooksjournalsTo = new JLabel("Add Books/Journals to the library database");
		lblAddBooksjournalsTo.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblAddBooksjournalsTo.setBounds(182, 34, 252, 14);
		contentPane.add(lblAddBooksjournalsTo);
		
		JLabel lblAddAndValidate = new JLabel("Add and validate the members for the library");
		lblAddAndValidate.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblAddAndValidate.setBounds(180, 68, 254, 14);
		contentPane.add(lblAddAndValidate);
		
		JLabel lblIssueBooksjournalsTo = new JLabel("Issue Books/Journals to the validated members");
		lblIssueBooksjournalsTo.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblIssueBooksjournalsTo.setBounds(182, 146, 272, 14);
		contentPane.add(lblIssueBooksjournalsTo);
		
		JLabel lblGenerateLibraryCard = new JLabel("Generate library card of a validated member");
		lblGenerateLibraryCard.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblGenerateLibraryCard.setBounds(180, 180, 254, 14);
		contentPane.add(lblGenerateLibraryCard);
		
		JLabel lblMaterialsReturnedBy = new JLabel("Materials returned by the validated members");
		lblMaterialsReturnedBy.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblMaterialsReturnedBy.setBounds(182, 220, 264, 14);
		contentPane.add(lblMaterialsReturnedBy);
		
		JButton btnDisplayMembers = new JButton("Display Members");
		btnDisplayMembers.setBackground(SystemColor.inactiveCaption);
		btnDisplayMembers.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnDisplayMembers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisplayAllMembers frame = new DisplayAllMembers(l);
				frame.setVisible(true);
			}
		});
		btnDisplayMembers.setBounds(10, 104, 150, 23);
		contentPane.add(btnDisplayMembers);
		
		JLabel lblDisplayAllThe = new JLabel("Display all the validated members");
		lblDisplayAllThe.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblDisplayAllThe.setBounds(182, 108, 252, 14);
		contentPane.add(lblDisplayAllThe);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnLogOut.setFont(new Font("Rockwell", Font.BOLD, 12));
		btnLogOut.setBackground(new Color(240, 128, 128));
		btnLogOut.setBounds(322, 277, 112, 23);
		contentPane.add(btnLogOut);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\506283369.jpg"));
		lblNewLabel.setBounds(0, 0, 464, 311);
		contentPane.add(lblNewLabel);
	}
}
