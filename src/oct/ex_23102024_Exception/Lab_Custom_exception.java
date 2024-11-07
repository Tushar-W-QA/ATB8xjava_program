package oct.ex_23102024_Exception;

public class Lab_Custom_exception {
    public static void main(String[] args) throws Exception {
        Lab150_bank sbi = new Lab150_bank("INR", 100);
        Lab150_bank bob = new Lab150_bank("INR", 250);
        Lab150_bank amercian_b = new Lab150_bank("Dollar", 300);
        System.out.println(sbi.add(bob));
    }
}
