// file for taking input of code file

import gui.GUI;
import impl.implemented;

public class mainclass {

    public static void main(String[] Args) {
        GUI credential = new GUI();
        credential.frame1();
        implemented.call_all("gui\\gui_output\\file.txt");
    }

}
