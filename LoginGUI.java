import javax.swing.*;
import java.awt.*; //abstract window toolkit 
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
	Container container = getContentPane();
	JLabel userLabel = new JLabel("Username: ");
	JLabel passwordLabel = new JLabel("Password: ");
	JButton LoginButton = new JButton("LOGIN");
	JButton ResetButton = new JButton("RESET");
	JTextField userTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JCheckBox showPassword = new JCheckBox("Show Password");
	
//CONSTRUCTOR calling all the required methods

	LoginFrame(){
		setLayoutManager(); //type of layout - grid/card/border,etc
		setLocationAndSize();  //set size foe the various components
		addComponentsToContainer();
		addActionEvent();
	}
 
	public void setLayoutManager(){
		container.setLayout(null);	
	}
	
	public void setLocationAndSize(){
		userLabel.setBounds(50,150,100,80);
		passwordLabel.setBounds(50,220,100,30);
		userTextField.setBounds(150,150,150,30);
		passwordField.setBounds(150,220,150,30);	
		LoginButton.setBounds(50,300,100,30);
		ResetButton.setBounds(200,300,100,30);
		showPassword.setBounds(150,250,150,30);
	}

	public void addComponentsToContainer(){
		container.add(userLabel);
		container.add(passwordLabel);
		container.add(userTextField);
		container.add(passwordField);		
		container.add(showPassword);
		container.add(LoginButton);
		container.add(ResetButton);
	}

	public void addActionEvent(){
		LoginButton.addActionListener(this);
		ResetButton.addActionListener(this);
		showPassword.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==LoginButton){
			String userText = userTextField.getText();
			String pwdText = passwordField.getText();

			if(userText.equalsIgnoreCase("shiiv") && pwdText.equalsIgnoreCase("shiiv123"))
				JOptionPane.showMessageDialog(this,"Login Successfull");
			else
				JOptionPane.showMessageDialog(this,"Invalid Username/password");
		}
		else if(e.getSource()==ResetButton){
			userTextField.setText("");
			passwordField.setText("");
		}
		else if(e.getSource()==showPassword){								if(showPassword.isSelected())
				passwordField.setEchoChar((char)0);
			else
				passwordField.setEchoChar('*');
		}
		
	}
	
	public static void main(String[] args){
		LoginFrame frame = new LoginFrame();
		frame.setTitle("Login Page");
		frame.setVisible(true);
		frame.setBounds(10,10,370,600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
