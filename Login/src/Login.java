
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Munzhedzi Munyadziwa Petrus
 */
public class Login extends JFrame implements ActionListener{
    
    //Declare all panels
    private JPanel headerPanel;
    
    private JPanel logInDetailsPanel;
    private JPanel userNamPanel;
    private JPanel passwordPanel;
    
    private JPanel buttonsPanel;
    
    private JPanel collectivePanel2;
    
    private JPanel mainPanlPanel; 
    
    //Declare labels
    private JLabel headerLabel;
    private JLabel usernameLabel;
    private JLabel PasswordLabel;
    
    //Declare buttons
    private JButton submitButton;
    private JButton ClearButton;
    private JButton ExitButton;
    
    //Declare TextField and PasswordField
    private JPasswordField passwordField;
    private JTextField useranameTextField;
    
    
    //Declare all the buttons

    
          
    
    
    public Login() {
        
        setSize(800, 400);
        setTitle("Login page");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        logInDetailsPanel = new JPanel(new GridLayout(3, 1, 30, 35));
        logInDetailsPanel.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Login details"));
        
        userNamPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        collectivePanel2 = new JPanel(new BorderLayout(2, 2));
        mainPanlPanel = new JPanel(new BorderLayout(2, 2));
        
        
        //Intitalize all the labels
        
        headerLabel = new JLabel("Login");
        headerLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
        headerLabel.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 35));
        headerLabel.setForeground(Color.red);
        
        usernameLabel = new JLabel("Username:");
        PasswordLabel = new JLabel("Password:");
        
        
        
        //Intialize all the text and password Fields
        useranameTextField = new JTextField(15);
        passwordField = new JPasswordField(15);
        
        //Initialize all the working buttons
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        ClearButton = new JButton("Clear");
        ClearButton.addActionListener(this);
        ExitButton = new JButton("Exit");
        ExitButton.addActionListener(this);
        
        //Now put everything together 
        headerPanel.add(headerLabel);
        userNamPanel.add(usernameLabel);
        userNamPanel.add(useranameTextField);
        
        passwordPanel.add(PasswordLabel);
        passwordPanel.add(passwordField);
        
        logInDetailsPanel.add(userNamPanel);
        logInDetailsPanel.add(passwordPanel);
        
        buttonsPanel.add(submitButton);
        buttonsPanel.add(ClearButton);
        buttonsPanel.add(ExitButton);
        
        collectivePanel2.add(headerPanel,BorderLayout.NORTH);
        collectivePanel2.add(logInDetailsPanel,BorderLayout.SOUTH);
        
        mainPanlPanel.add(collectivePanel2,BorderLayout.NORTH);
        mainPanlPanel.add(buttonsPanel,BorderLayout.SOUTH);
        
        
        add(mainPanlPanel);
        pack();
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        if(e.getSource() == ExitButton){
            
            System.exit(0);
        }
        if(e.getSource() == ClearButton){
            
            useranameTextField.setText(null);
            passwordField.setText(null);
        }
        if(e.getSource() == submitButton){
            
            if("Munyadziwa".equals(useranameTextField.getText())){
                
                JOptionPane.showMessageDialog(null, "Yey you managed to login");
                
            }
            
            else JOptionPane.showMessageDialog(null, "WrongPassword try again");
        }
        
        
    }
    
    public static void main(String[] args) {
        
        new Login();
    }
    
}
