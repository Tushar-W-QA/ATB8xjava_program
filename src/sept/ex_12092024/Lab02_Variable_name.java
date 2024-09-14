package sept.ex_12092024;

public class Lab02_Variable_name {
    public static void main(String[] args) {
        // variable name (Identifier) --> Need to follow some rules
        // Identifier can contain Alphabets, Digits, and two special symbol i.e. Dollar ($) & Underscore (_).
        // First character of an identifier should be an Alphabet or Dollar ($) or Underscore (_).
        // Keywords or Reserved words can't be used as Identifiers.

    //  boolean 1233 = true; // not correct format
        boolean t = false;
        boolean $ = true;
        boolean _123 = true;

        boolean tushar$warad = true;
        boolean tushar_warad = true;
        boolean $rj = false;
    //  boolean public = true;  // public  is keyword so, we can't keep it as varibale name

        System.out.println(t);
        System.out.println($);
        System.out.println(_123);
        System.out.println($rj);

    }
}
