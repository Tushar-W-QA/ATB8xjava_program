package oct.ex_10102024.Encapsulation.Example;

public class Lab119 {
    public static void main(String[] args) {
        ICICI_Bank pooja = new ICICI_Bank("Tushar", 10000);
        pooja.setName("Suryakant");
        System.out.println(pooja.getName());


//        pooja.setBal(100000);
//        System.out.println(pooja.bal);

        // the account bal should set by admin.

        // write a code to connect with mySQL
        // admin

        boolean are_you_admin = true;

        pooja.setBal(50000, are_you_admin);
        // After set the value if we want the print the update value we have to use getter method

        System.out.println(pooja.getBal());
    }
}
