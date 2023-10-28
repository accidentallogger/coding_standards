package gui;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI implements ActionListener {
    public static JFrame frame1;
    public static JPanel panel1;
    public static JLabel userLabel, passwordLabel, headerLabel, projectLabel;
    public static JTextField userText, projectText;
    public static JButton button;
    public static JPasswordField passwordText;
    public static Font header, fields;

    String user, pass;

    public void frame1() {
        // Creates Frame
        frame1 = new JFrame();
        frame1.setSize(350, 250);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creates Panel
        panel1 = new JPanel();
        frame1.add(panel1);
        panel1.setBackground(Color.white);
        panel1.setLayout(null);

        // Font of Header
        header = new Font("Lucida Calligraphy", Font.ITALIC, 16);

        // Creates Header label
        headerLabel = new JLabel("Clean Coding");
        headerLabel.setBounds(120, 10, 200, 30);
        headerLabel.setFont(header);
        panel1.add(headerLabel);

        // Creates Username label
        userLabel = new JLabel("Username: ");
        userLabel.setBounds(50, 50, 100, 20);
        panel1.add(userLabel);

        // Creates username textBox field
        userText = new JTextField(20);
        userText.setBounds(120, 50, 100, 20);
        panel1.add(userText);

        // Creates Password label
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(50, 80, 100, 20);
        panel1.add(passwordLabel);

        // Creates password textBox HIDDEN CHARACTERS field
        passwordText = new JPasswordField(20);
        passwordText.setBounds(120, 80, 100, 20);
        panel1.add(passwordText);

        // Creates Project label
        projectLabel = new JLabel("Project: ");
        projectLabel.setBounds(50, 110, 100, 20);
        panel1.add(projectLabel);

        // Creates project textBox Feild
        projectText = new JTextField(20);
        projectText.setBounds(120, 110, 100, 20);
        panel1.add(projectText);

        // Creates the Button label
        button = new JButton("Create");
        button.setBounds(70, 150, 100, 20);
        panel1.add(button);

        // Assigns Button a Task

        button.addActionListener(this);

        frame1.setVisible(true);

    }

    // button task
    @Override
    public void actionPerformed(ActionEvent e1) {

        // checking validity of input paramaters
        user = userText.getText();
        pass = passwordText.getText();

        if ((user.contains("tan") || user.contains("yug")) || user.contains("admin")) {
            if (pass.contains("may") || pass.contains("aank") || pass.contains("gs")) {

                GUI2 instruction = new GUI2();
                instruction.frame2();
            } else {

                JOptionPane.showMessageDialog(null, "Wrong Password");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Username");
        }

    }

}

class GUI2 implements ActionListener {
    public static JFrame frame2;
    public static JPanel panel2;
    public static JLabel instructionLabel, varN, metN, indN, nestN;
    public static JTextField varT, metT, indT, nestT;
    public static JButton OK;
    public static Font ins;

    public void frame2() {

        // 2nd frame is set up
        frame2 = new JFrame();
        frame2.setSize(500, 600);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2nd panel is set up
        panel2 = new JPanel();
        panel2.setVisible(true);
        frame2.add(panel2);
        panel2.setLayout(null);
        panel2.setBackground(Color.orange);

        // InstructionLabel
        ins = new Font("Times New Roman", Font.BOLD, 14);
        instructionLabel = new JLabel("Instructions(Parameters):");
        instructionLabel.setFont(ins);
        instructionLabel.setBounds(20, 50, 1000, 20);
        panel2.add(instructionLabel);

        varN = new JLabel("1: Enter your standard for variable naming");
        varN.setBounds(20, 80, 1000, 20);
        panel2.add(varN);

        metN = new JLabel("2: Enter your standard for function naming");
        metN.setBounds(20, 120, 1000, 20);
        panel2.add(metN);

        indN = new JLabel("3: Enter total number of indent spacing");
        indN.setBounds(20, 160, 1000, 20);
        panel2.add(indN);

        nestN = new JLabel("4.Enter highest number of nests allowed");
        nestN.setBounds(20, 200, 1000, 20);
        panel2.add(nestN);

        varT = new JTextField();
        varT.setBounds(300, 80, 100, 20);
        panel2.add(varT);

        metT = new JTextField();
        metT.setBounds(300, 120, 100, 20);
        panel2.add(metT);

        indT = new JTextField();
        indT.setBounds(300, 160, 100, 20);
        panel2.add(indT);

        nestT = new JTextField();
        nestT.setBounds(300, 200, 100, 20);
        panel2.add(nestT);

        OK = new JButton("OK");
        OK.setBounds(300, 400, 100, 20);
        panel2.add(OK);

        OK.addActionListener(this);

        frame2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e2) {

        String varS = varT.getText();
        String metS = metT.getText();
        String indS = indT.getText();
        String nestS = nestT.getText();

        Path path1 = Paths.get("gui\\gui_output\\VariableName.txt");
        Path path2 = Paths.get("gui\\gui_output\\MethodName.txt");
        Path path3 = Paths.get("gui\\gui_output\\Indent.txt");
        Path path4 = Paths.get("gui\\gui_output\\Nest.txt");

        byte[] arr1 = varS.getBytes();
        byte[] arr2 = metS.getBytes();
        byte[] arr3 = indS.getBytes();
        byte[] arr4 = nestS.getBytes();

        // Try block to check for exceptions
        try {
            // Now calling Files.write() method using path
            // and byte array
            Files.write(path1, arr1);
            Files.write(path2, arr2);
            Files.write(path3, arr3);
            Files.write(path4, arr4);

        }

        // Catch block to handle the exceptions
        catch (IOException ex) {
            // Print message as exception occurred when
            // invalid path of local machine is passed
            System.out.print("Invalid Path");
        }

        GUI3 UI = new GUI3();
        UI.frame3();
    }
}

class GUI3 implements ActionListener {

    public static JFrame frame3;
    public static JPanel panel3;
    public static JLabel welcomeLabel;
    public static JTextArea input;
    public static JButton check;
    public static Font h2;

    public void frame3() {

        frame3 = new JFrame();
        frame3.setSize(800, 900);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel3 = new JPanel();
        panel3.setVisible(true);
        frame3.add(panel3);
        panel3.setLayout(null);
        panel3.setBackground(Color.YELLOW);

        // Header2
        h2 = new Font("Times New Roman", Font.BOLD, 20);
        welcomeLabel = new JLabel("Welcome to the Clean Code Checker");
        welcomeLabel.setBounds(200, 10, 500, 30);
        welcomeLabel.setFont(h2);
        panel3.add(welcomeLabel);

        input = new JTextArea("""
                public class main{
                    public static void main(String args[]){

                }
                }""");
        input.setBounds(100, 50, 500, 500);
        panel3.add(input);

        check = new JButton("Check");
        check.setBounds(200, 600, 100, 25);
        panel3.add(check);

        check.addActionListener(this);

        frame3.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e3) {

        String inputS = input.getText();

        // passing file instance in filewriter
        String pp = "gui\\gui_output\\file.txt";
        // Creating an instance of file
        Path path = Paths.get(pp);
        impl.implemented.call_all(pp);
        // Converting string to byte array
        // using getBytes() method
        byte[] arr = inputS.getBytes();

        // Try block to check for exceptions
        try {
            // Now calling Files.write() method using path
            // and byte array
            Files.write(path, arr);
        }

        // Catch block to handle the exceptions
        catch (IOException ex) {
            // Print message as exception occurred when
            // invalid path of local machine is passed
            System.out.print("Invalid Path");
        }

        GUI4 result = new GUI4();
        result.frame4();
    }

}

class GUI4 implements ActionListener {
    public static JFrame frame4;
    public static JPanel panel4;
    public static JButton finish;

    public void frame4() {

        frame4 = new JFrame();
        frame4.setSize(400, 400);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel4 = new JPanel();
        panel4.setVisible(true);
        panel4.setLayout(null);
        panel4.setBackground(Color.ORANGE);
        frame4.add(panel4);

        finish = new JButton("Finish");
        finish.setBounds(100, 300, 100, 20);
        panel4.add(finish);

        finish.addActionListener(this);

        frame4.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e4) {
        GUI3 UI = new GUI3();
        UI.frame3();
    }
}
