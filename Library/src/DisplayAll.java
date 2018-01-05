import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class DisplayAll extends JFrame {
	public final JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane();
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//DisplayAll frame = new DisplayAll();
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
	public DisplayAll(Library l) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.add(textArea);
		
		
		scrollPane.setBounds(20, 45, 573, 186);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
			
		//textArea.append("BookID\t"+"Book Name\t\t"+"Author\t"+"Quantity\t"+"Rack No");
		//textArea.append("\n");
		//textArea.append("------------------------------------------------------------------------------------------------------------------------------");
		textArea.append("\n");
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(27, 26, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(113, 26, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(283, 26, 46, 14);
		contentPane.add(lblAuthor);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(400, 26, 65, 14);
		contentPane.add(lblQuantity);
		
		JLabel lblRackNo = new JLabel("Rack No");
		lblRackNo.setBounds(528, 26, 65, 14);
		contentPane.add(lblRackNo);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFont(new Font("Rockwell", Font.BOLD, 12));
		button.setBackground(new Color(240, 128, 128));
		button.setBounds(504, 256, 89, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Sighorzki\\Desktop\\polygonal-abstract-background-design_23-2147493966.jpg"));
		label.setBounds(0, 0, 614, 291);
		contentPane.add(label);
			int i;
			for(i=0;i<Library.libcount;i++)
			{
				textArea.append(l.materials[i].materialId+"\t"+l.materials[i].materialName+"\t\t"+l.materials[i].author+"\t\t"+l.materials[i].quantity+"\t"+l.materials[i].rackNo);
				textArea.append("\n");
			}
		
	
		}
}
