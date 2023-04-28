package attendance_04_28;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Librarian extends JFrame {

	private JPanel contentPane;
	private JTextField authorTextField, availCopies, copyTextField;
	private JButton btnNewButton;
	private JButton btnBorrow;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	

	
	public Librarian() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("List of Books");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel.setBounds(31, 82, 91, 64);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gulliver's Travel ", "The Alchemist", "Lord of the Rings", "Man’s Search For Meaning"}));
		comboBox.setBounds(165, 105, 147, 22);
		contentPane.add(comboBox);
		
		JLabel authorLbl = new JLabel("Book Author");
		authorLbl.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		authorLbl.setBounds(31, 132, 81, 29);
		contentPane.add(authorLbl);
		
		authorTextField = new JTextField();
		authorTextField.setEditable(false);
		authorTextField.setBounds(165, 138, 147, 20);
		contentPane.add(authorTextField);
		authorTextField.setColumns(10);
		
		JLabel quantityBook = new JLabel("Book Quantity ");
		quantityBook.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		quantityBook.setBounds(31, 157, 100, 51);
		contentPane.add(quantityBook);
		
		availCopies = new JTextField();
		availCopies.setEditable(false);
		availCopies.setBounds(166, 169, 146, 20);
		contentPane.add(availCopies);
		availCopies.setColumns(10);
		
		copyTextField = new JTextField();
		copyTextField.setBounds(165, 197, 147, 29);
		contentPane.add(copyTextField);
		copyTextField.setColumns(10);

		// add borrow button	

		btnBorrow = new JButton("Rent");
		btnBorrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int quantity = Integer.parseInt(availCopies.getText());

			}
		});
		btnBorrow.setBounds(132, 282, 89, 23);
		contentPane.add(btnBorrow);
		
		lblNewLabel_1 = new JLabel("Borrow Book");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(132, 25, 191, 69);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(32, 194, 123, 35);
		contentPane.add(lblNewLabel_2);

		// add action listener for combo box
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedBook = (String)comboBox.getSelectedItem();
				if (selectedBook.equals("Gulliver's Travel")) {
					authorTextField.setText("Jonathan Swift");
					availCopies.setText("10");
				} else if (selectedBook.equals("The Alchemist")) {
					authorTextField.setText("Paulo Coelho");
					availCopies.setText("20");
				} else if (selectedBook.equals("Lord of the Rings")) {
					authorTextField.setText("J.R.R. Tolkien");
					availCopies.setText("15");
				} else if (selectedBook.equals("Man’s Search For Meaning")) {
					authorTextField.setText("Viktor Frankl");
					availCopies.setText("30");
				}
			}
		});
	}
		

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Librarian frame = new Librarian();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}


