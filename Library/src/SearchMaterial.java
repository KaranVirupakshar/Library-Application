import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class SearchMaterial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JButton btnSearch;
	private JLabel lblId;
	private JLabel lblBookName;
	private JLabel lblAuthor;
	private JLabel lblQuantity;
	private JLabel lblRackNo;
	private JButton button;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//SearchMaterial frame = new SearchMaterial();
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
	public SearchMaterial(Library l) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaterialName = new JLabel("Material Name :");
		lblMaterialName.setBounds(24, 30, 102, 14);
		contentPane.add(lblMaterialName);
		
		textField = new JTextField();
		textField.setBounds(136, 27, 203, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(24, 98, 563, 118);
		contentPane.add(textArea);
		
		btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Monospaced", Font.PLAIN, 11));
		btnSearch.setBackground(new Color(211, 211, 211));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i,flag=0;
				for(i=0;i<Library.libcount;i++)
				{
					if(l.materials[i].materialName.equalsIgnoreCase(textField.getText()))
					{
					flag=1;
					textArea.append(l.materials[i].materialId+"\t"+l.materials[i].materialName+"\t\t"+l.materials[i].author+"\t\t"+l.materials[i].quantity+"\t"+l.materials[i].rackNo);
					textArea.append("\n");
					}
				}
				if(flag!=1)
				{
					textArea.setText("Book not Found");
				}
			}
		});
		btnSearch.setBounds(498, 26, 89, 23);
		contentPane.add(btnSearch);
		
		lblId = new JLabel("ID");
		lblId.setBounds(35, 78, 46, 14);
		contentPane.add(lblId);
		
		lblBookName = new JLabel("Book Name");
		lblBookName.setBounds(107, 78, 78, 14);
		contentPane.add(lblBookName);
		
		lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(283, 78, 66, 14);
		contentPane.add(lblAuthor);
		
		lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(423, 78, 66, 14);
		contentPane.add(lblQuantity);
		
		lblRackNo = new JLabel("Rack No");
		lblRackNo.setBounds(532, 78, 55, 14);
		contentPane.add(lblRackNo);
		
		button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFont(new Font("Rockwell", Font.BOLD, 12));
		button.setBackground(new Color(240, 128, 128));
		button.setBounds(498, 237, 89, 23);
		contentPane.add(button);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\polygonal-abstract-background-design_23-2147493966.jpg"));
		label.setBounds(0, 0, 614, 271);
		contentPane.add(label);
	
	
		
	}
}
