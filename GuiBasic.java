package guibasic;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiBasic {


    public static void main(String[] args) {
        
       GUI credential= new GUI();
        
    }
    
}

class GUI implements ActionListener{
  public static JFrame frame1,frame2;
  public static JPanel panel1,panel2;
  public static JLabel userLabel,passwordLabel,headerLabel,projectLabel,welcomeLabel;
  public static JTextField userText,projectText;
  public static JTextArea input;
  public static JButton button;
  public static JPasswordField passwordText;
  public static Font header, fields;
  
  public GUI(){
     //Creates Frame
        frame1= new JFrame();
        frame1.setSize(350,250);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //creates Panel
        panel1= new JPanel();
        frame1.add(panel1);
        panel1.setBackground(Color.white);
        panel1.setLayout(null);
        
        //Font of Header
        header= new Font("Lucida Calligraphy",Font.ITALIC, 16 );
        
        //Creates Header label
        headerLabel= new JLabel("Clean Coding");
        headerLabel.setBounds(120, 10, 200,30);
        headerLabel.setFont(header);
        panel1.add(headerLabel);
         
       
        //Creates Username label
        userLabel= new JLabel("Username: ");
        userLabel.setBounds(50,50,100,20);
        panel1.add(userLabel);
        
        //Creates username textBox field
        userText= new JTextField(20);
        userText.setBounds(120, 50, 100, 20);
        panel1.add(userText);
        
        //Creates Password label
        passwordLabel =new JLabel("Password: ");
        passwordLabel.setBounds(50, 80, 100, 20);
        panel1.add(passwordLabel);
        
        //Creates password textBox HIDDEN CHARACTERS field
        passwordText= new JPasswordField(20);
        passwordText.setBounds(120,80,100,20);
        panel1.add(passwordText);
        
        //Creates Project label
        projectLabel = new JLabel("Project: ");
        projectLabel.setBounds(50,110,100,20);
        panel1.add(projectLabel);
        
        //Creates project textBox Feild
        projectText= new JTextField(20);
        projectText.setBounds(120,110,100,20);
        panel1.add(projectText);
        
        //Creates the Button label
        button= new JButton("Create");
        button.setBounds(70,150,100,20);
        panel1.add(button);
        
        //Assigns Button a Task
        button.addActionListener(this);
        
         frame1.setVisible(true);
        
}
// button task
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //2nd frame is set up
        frame2 =new JFrame();
        frame2.setSize(600,600);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //2nd panel is set up
        panel2= new JPanel();
        panel2.setVisible(true);
        frame2.add(panel2);
        panel2.setLayout(null);
        panel2.setBackground(Color.green);
        
        
       welcomeLabel= new JLabel("Welcome to the Clean Code Checker");
       welcomeLabel.setBounds(200,10,300,30);
       panel2.add(welcomeLabel);
      
       input= new JTextArea("public class"+" main"+"{\n"+"    "
               + "public static void main(String args[]){\n"
               +"    "+"\n}"
               + "\n}");
       input.setBounds(20,50,500,500);
       panel2.add(input);
       
       frame2.setVisible(true);
       
    }
}