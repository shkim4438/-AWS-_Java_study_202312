package usermanagement.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.JsonObject;

import usermanagement.entity.User;
import usermanagement.service.UserService;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.smartcardio.Card;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserMagementFrame extends JFrame {
	
	private List<JTextField> loginFields;
	private List<JTextField> registerFields;
	
	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField registerNameField;
	private JTextField registerUsernameField;
	private JPasswordField registerpasswordField;
	private JTextField registerEmailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMagementFrame frame = new UserMagementFrame();
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
	public UserMagementFrame() {
		loginFields = new ArrayList<>();
		registerFields = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(null);
		
		mainPanel.add(loginPanel, "loginPanel");
		
		JLabel UserMangerment = new JLabel("UserMangement");
		UserMangerment.setFont(new Font("D2Coding", Font.BOLD, 25));
		UserMangerment.setHorizontalAlignment(SwingConstants.CENTER);
		UserMangerment.setBounds(67, 37, 262, 66);
		loginPanel.add(UserMangerment);
		
		JLabel loginText = new JLabel("Login");
		loginText.setHorizontalAlignment(SwingConstants.CENTER);
		loginText.setFont(new Font("HY엽서L", Font.BOLD, 25));
		loginText.setBounds(113, 112, 163, 43);
		loginPanel.add(loginText);
		
		usernameField = new JTextField();
		usernameField.setHorizontalAlignment(SwingConstants.CENTER);
		usernameField.setBounds(12, 229, 362, 33);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(12, 300, 362, 33);
		loginPanel.add(passwordField);
		
		JLabel usernameLabel = new JLabel("Username or email");
		usernameLabel.setFont(new Font("HY엽서M", Font.PLAIN, 15));
		usernameLabel.setBounds(12, 195, 174, 24);
		loginPanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		passwordLabel.setBounds(12, 277, 163, 24);
		loginPanel.add(passwordLabel);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginButton.setFont(new Font("HY엽서L", Font.PLAIN, 18));
		loginButton.setBounds(12, 362, 362, 33);
		loginPanel.add(loginButton);
		
		JLabel signupDesc = new JLabel("Don't have an account?");
		signupDesc.setHorizontalAlignment(SwingConstants.CENTER);
		signupDesc.setFont(new Font("HY엽서L", Font.PLAIN, 14));
		signupDesc.setBounds(39, 405, 174, 24);
		loginPanel.add(signupDesc);
		
		JLabel signupLink = new JLabel("Sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel");
				clearFeilds(loginFields);
			}
		});
		signupLink.setHorizontalAlignment(SwingConstants.CENTER);
		signupLink.setFont(new Font("HY엽서L", Font.BOLD, 15));
		signupLink.setForeground(new Color(0, 128, 255));
		signupLink.setBounds(221, 408, 95, 19);
		loginPanel.add(signupLink);
		
		JLabel forgotpasswordLink = new JLabel("Forgot your password?");
		forgotpasswordLink.setForeground(new Color(0, 128, 255));
		forgotpasswordLink.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		forgotpasswordLink.setHorizontalAlignment(SwingConstants.CENTER);
		forgotpasswordLink.setBounds(95, 439, 196, 17);
		loginPanel.add(forgotpasswordLink);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(new Color(255, 255, 255));
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel Signinlink = new JLabel("Sign in");
		Signinlink.setForeground(new Color(0, 128, 255));
		Signinlink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
				clearFeilds(registerFields);
			}
		});
		Signinlink.setBounds(278, 421, 96, 32);
		Signinlink.setHorizontalAlignment(SwingConstants.CENTER);
		registerPanel.add(Signinlink);
		
		JLabel registerUserMangerment_1 = new JLabel("UserMangement");
		registerUserMangerment_1.setHorizontalAlignment(SwingConstants.CENTER);
		registerUserMangerment_1.setFont(new Font("D2Coding", Font.BOLD, 25));
		registerUserMangerment_1.setBounds(60, 10, 262, 66);
		registerPanel.add(registerUserMangerment_1);
		
		JLabel registerLoginText2 = new JLabel("Register");
		registerLoginText2.setHorizontalAlignment(SwingConstants.CENTER);
		registerLoginText2.setFont(new Font("HY엽서L", Font.BOLD, 25));
		registerLoginText2.setBounds(106, 73, 163, 43);
		registerPanel.add(registerLoginText2);
		
		registerNameField = new JTextField();
		registerNameField.setHorizontalAlignment(SwingConstants.CENTER);
		registerNameField.setColumns(10);
		registerNameField.setBounds(12, 281, 362, 33);
		registerPanel.add(registerNameField);
		
		registerEmailField = new JTextField();
		registerEmailField.setHorizontalAlignment(SwingConstants.CENTER);
		registerEmailField.setColumns(10);
		registerEmailField.setBounds(12, 345, 362, 33);
		registerPanel.add(registerEmailField);
		
		JLabel registerName = new JLabel("name");
		registerName.setFont(new Font("HY엽서M", Font.PLAIN, 15));
		registerName.setBounds(12, 254, 174, 24);
		registerPanel.add(registerName);
		
		JLabel registerEmail = new JLabel("email");
		registerEmail.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		registerEmail.setBounds(12, 324, 163, 24);
		registerPanel.add(registerEmail);
		
		registerUsernameField = new JTextField();
		registerUsernameField.setHorizontalAlignment(SwingConstants.CENTER);
		registerUsernameField.setColumns(10);
		registerUsernameField.setBounds(12, 140, 362, 33);
		registerPanel.add(registerUsernameField);
		
		registerpasswordField = new JPasswordField();
		registerpasswordField.setHorizontalAlignment(SwingConstants.CENTER);
		registerpasswordField.setBounds(12, 211, 362, 33);
		registerPanel.add(registerpasswordField);
		
		JLabel registerUsername = new JLabel("Username");
		registerUsername.setFont(new Font("HY엽서M", Font.PLAIN, 15));
		registerUsername.setBounds(12, 106, 174, 24);
		registerPanel.add(registerUsername);
		
		JLabel registerPasswordLabel_2 = new JLabel("Password");
		registerPasswordLabel_2.setFont(new Font("HY엽서L", Font.PLAIN, 15));
		registerPasswordLabel_2.setBounds(12, 188, 163, 24);
		registerPanel.add(registerPasswordLabel_2);
		
		JButton registerButton = new JButton("register");
		registerButton.setForeground(new Color(0, 0, 0));
		
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JsonObject userJson = new JsonObject();
				userJson.addProperty("username", registerUsernameField.getText());
				userJson.addProperty("password", registerpasswordField.getText());
				userJson.addProperty("email", registerEmailField.getText());
				userJson.addProperty("name", registerNameField.getText());
				
				UserService userService = UserService.getInstance();
				
				
				Map<String, String> response = userService.register(userJson.toString());
				
				if(response.containsKey("error")) {
				JOptionPane.showMessageDialog(null, response.get("error"), "error", JOptionPane.ERROR_MESSAGE);
				return;
				}
				
				JOptionPane.showMessageDialog(null, response.get("ok"), "ok", JOptionPane.INFORMATION_MESSAGE);
				mainCard.show(mainPanel, "loginPanel");
				clearFeilds(registerFields);
			}
		});

		registerButton.setFont(new Font("HY엽서L", Font.PLAIN, 18));
		registerButton.setBounds(12, 390, 362, 29);
		registerPanel.add(registerButton);
		
		loginFields.add(usernameField);
		loginFields.add(passwordField);
		
		registerFields.add(registerUsernameField);
		registerFields.add(registerpasswordField);
		registerFields.add(registerNameField);
		registerFields.add(registerEmailField);
		
	}
	
	private void clearFeilds(List<JTextField> textFields) {
		for(JTextField field : textFields) {
			if(field.getText().isEmpty()) {//공백을 텍스트로 보겠다로 isBlank와 반대의 의미.
				continue;
			}
			field.setText("");
		}
	}
	
}
