package impl;

import rules.rules;
import indents.indents;
import no_nests.no_nests;
import var_name.regex_variables;
import func_name.regex_func;
import java.util.ArrayList;

public class implemented implements rules {

    public static void call_all(String Filename) {
        implemented imp = new implemented();
        // get custom input from user gui
        imp.indent(Filename, 4);
        imp.function_name(Filename, "([a-z]+[A-Z]+\\w+)+");
        imp.variable_name(Filename, "([a-z]+[A-Z]+\\w+)+");
        imp.no_of_nests(Filename, 3);
    }

    public Boolean indent(String Filename, int indspaces) {
        indents ind = new indents();
        return ind.indent(Filename, indspaces);
    }

    public Boolean no_of_nests(String Filename, int endp) {
        no_nests nes = new no_nests();
        return nes.no_of_nests(Filename, endp);
    }

    public ArrayList<String> function_name(String Filename, String regxw) {
        regex_func rf = new regex_func();
        return rf.function_name(Filename, regxw);
    }

    public ArrayList<String> variable_name(String Filename, String regxw) {
        regex_variables vn = new regex_variables();
        return vn.variable_name(Filename, regxw);
    }
}
