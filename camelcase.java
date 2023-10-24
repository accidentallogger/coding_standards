import java.io.File;
import java.io.FileNotFoundException;
//import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class camelcase implements rules {

    public void indent(String Filename) {

    }

    public void speed() {

    }

    public void no_of_nests() {

    }

    public void function_name() {

    }

    public void variable_name(String Filename) {
        File file = new File(Filename);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list_1 = new ArrayList<String>();
        ArrayList<String> correct_list = new ArrayList<String>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }

            String camelCase = "([a-z]+[A-Z]+\\w+)+";
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i)).contains("int") || (list.get(i)).contains("String")
                        || (list.get(i)).contains("Boolean") || (list.get(i)).contains("float")) {
                    ArrayList<String> list_m = new ArrayList<String>(Arrays.asList((list.get(i)).split(" ")));
                    list_1.add(list_m.get(((list_m.indexOf("int"))) + 1));
                    list_1.add(list_m.get(((list_m.indexOf("String"))) + 1));
                    list_1.add(list_m.get(((list_m.indexOf("float"))) + 1));
                    list_1.add(list_m.get(((list_m.indexOf("Boolean"))) + 1));

                }

            }

            list_1.remove(" ");
            for (int i = 0; i < list_1.size(); i++) {
                if ((list_1.get(i)).matches(camelCase)) {
                    correct_list.add(list_1.get(i));
                }

            }
            System.out.println(correct_list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}