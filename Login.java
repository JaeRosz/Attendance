package attendance_04_28;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JPasswordField passwordField;
	private JLabel PasswordLbl;
	private JRadioButton rdbtn_Admin;
	private JRadioButton rdbtn_Librarian;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Title = new JLabel("LIBRARIAN SYSTEM LOGIN");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Title.setBounds(87, 21, 225, 68);
		contentPane.add(Title);
		
		JLabel UsernameLbl = new JLabel("Username");
		UsernameLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		UsernameLbl.setBounds(87, 86, 82, 30);
		contentPane.add(UsernameLbl);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(87, 116, 225, 30);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(87, 187, 225, 30);
		contentPane.add(passwordField);
		
		PasswordLbl = new JLabel("Password");
		PasswordLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PasswordLbl.setBounds(87, 167, 82, 19);
		contentPane.add(PasswordLbl);
		
		rdbtn_Admin = new JRadioButton("Admin");
		rdbtn_Admin.setBounds(141, 245, 109, 23);
		contentPane.add(rdbtn_Admin);
		
		rdbtn_Librarian = new JRadioButton("Librarian");
		rdbtn_Librarian.setBounds(141, 271, 109, 23);
		contentPane.add(rdbtn_Librarian);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usernameText = usernameTextField.getText();
				String passwordText = new String(passwordField.getPassword());
				
				if(usernameText.isEmpty() && passwordText.isEmpty())
					JOptionPane.showMessageDialog(contentPane,"Please enter both user username and password");

		        if (rdbtn_Admin.isSelected()) {
		            if ((usernameText.equals("Admin_01") && passwordText.equals("AdminOne")) || 
		                (usernameText.equals("Admin_02") && passwordText.equals("AdminTwo")) ||
		                (usernameText.equals("Admin_03") && passwordText.equals("AdminThree"))) {
		                JOptionPane.showMessageDialog(contentPane, "Admin Successfully Login");
		                
		                Admin AdminFrame = new Admin();
		                AdminFrame.setVisible(true);
		              
		            } else {
		                JOptionPane.showMessageDialog(contentPane, "Invalid Login Credentials for Admin");
		            }
		        } else if (rdbtn_Librarian.isSelected()) {
		            if ((usernameText.equals("Librarian_01") && passwordText.equals("LibOne")) ||
		                (usernameText.equals("Librarian_02") && passwordText.equals("LibTwo")) ||
		                (usernameText.equals("Librarian_03") && passwordText.equals("LibThree"))) {
		                JOptionPane.showMessageDialog(contentPane, "Librarian Successfully Login");		             

		                Librarian LibrarianFrame = new Librarian();
		                LibrarianFrame.setVisible(true);
		                
		            } else {
		                JOptionPane.showMessageDialog(contentPane, "Invalid Login Credentials for Librarian");
		            }
		        } else {
		            JOptionPane.showMessageDialog(contentPane, "Please select a user type");
		        }
		    }
		});
					
		btnLogin.setBounds(128, 311, 116, 40);
		contentPane.add(btnLogin);
		    		
	}
	
}

