import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class AddMaterials extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//AddMaterials frame = new AddMaterials();
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
	public AddMaterials(Library l) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookId = new JLabel("Book ID :");
		lblBookId.setBounds(10, 28, 66, 14);
		contentPane.add(lblBookId);
		
		JLabel lblBookName = new JLabel("Book Author :");
		lblBookName.setBounds(10, 63, 86, 14);
		contentPane.add(lblBookName);
		
		JLabel lblBookName_1 = new JLabel("Book Name :");
		lblBookName_1.setBounds(10, 101, 86, 14);
		contentPane.add(lblBookName_1);
		
		JLabel lblRackNo = new JLabel("Rack No :");
		lblRackNo.setBounds(10, 141, 66, 14);
		contentPane.add(lblRackNo);
		
		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setBounds(10, 180, 66, 14);
		contentPane.add(lblQuantity);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(10, 220, 86, 14);
		contentPane.add(lblDepartment);
		
		textField = new JTextField();
		textField.setBounds(95, 25, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(95, 60, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(95, 98, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(95, 138, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(95, 177, 86, 20);
		contentPane.add(textField_4);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnAddBook.setBackground(SystemColor.inactiveCaption);
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				l.materials[Library.libcount]=new ReferenceBook(textField.getText(),textField_1.getText(),textField_2.getText(),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()),textField_10.getText());
				JOptionPane.showMessageDialog(null, "Reference Book Added");
				}
				catch(ArrayIndexOutOfBoundsException aioob)
				{
					JOptionPane.showMessageDialog(null, "Library is full!");
				}
			}
		});
		btnAddBook.setBounds(54, 263, 127, 23);
		contentPane.add(btnAddBook);
		
		JLabel lblJournalId = new JLabel("Journal ID :");
		lblJournalId.setBounds(226, 28, 76, 14);
		contentPane.add(lblJournalId);
		
		JLabel lblJournalAuthor = new JLabel("Journal Author :");
		lblJournalAuthor.setBounds(226, 63, 101, 14);
		contentPane.add(lblJournalAuthor);
		
		JLabel lblJournalName = new JLabel("Journal Name :");
		lblJournalName.setBounds(226, 101, 101, 14);
		contentPane.add(lblJournalName);
		
		JLabel label_3 = new JLabel("Rack No :");
		label_3.setBounds(226, 141, 76, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Quantity :");
		label_4.setBounds(226, 180, 76, 14);
		contentPane.add(label_4);
		
		JLabel lblPublisher = new JLabel("Publisher :");
		lblPublisher.setBounds(226, 220, 76, 14);
		contentPane.add(lblPublisher);
		
		textField_5 = new JTextField();
		textField_5.setBounds(323, 25, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(323, 60, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(323, 98, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(323, 138, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(323, 177, 86, 20);
		contentPane.add(textField_9);
		
		JButton btnAddJournal = new JButton("Add Journal");
		btnAddJournal.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnAddJournal.setBackground(SystemColor.inactiveCaption);
		btnAddJournal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				l.materials[Library.libcount]=new Journal(textField_5.getText(),textField_6.getText(),textField_7.getText(),Integer.parseInt(textField_8.getText()),Integer.parseInt(textField_9.getText()),textField_11.getText());
				JOptionPane.showMessageDialog(null, "Journal Added");
				}
				catch(ArrayIndexOutOfBoundsException aioob)
				{
					JOptionPane.showMessageDialog(null, "Library is full!");
				}
			}
		});
		btnAddJournal.setBounds(290, 263, 119, 23);
		contentPane.add(btnAddJournal);
		
		textField_10 = new JTextField();
		textField_10.setBounds(95, 217, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(323, 217, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFont(new Font("Rockwell", Font.BOLD, 12));
		button.setBackground(new Color(240, 128, 128));
		button.setBounds(323, 327, 89, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\polygonal-abstract-background-design_23-2147493966.jpg"));
		label.setBounds(0, 3, 454, 358);
		contentPane.add(label);
	}
}
