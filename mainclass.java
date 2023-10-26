// file for taking input of code file

import indents.indents;
import misc.regex;

public class mainclass {

    public static void main(String[] Args) {

        regex cam = new regex();
        cam.variable_name("file.txt");

        indents indent = new indents();
        indent.indent("File.txt");

    }

}
