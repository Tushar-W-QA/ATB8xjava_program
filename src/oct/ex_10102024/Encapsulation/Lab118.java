package oct.ex_10102024.Encapsulation;

public class Lab118 {
    public static void main(String[] args) {
        VWOlogin v = new VWOlogin("UserName", "password1234");
        System.out.println(v.password);
        v.password = "Hackers";
        System.out.println(v.password);



        GoodVWO g = new GoodVWO("Deepak", "password");
        //System.out.println(g.setUsername("Tushar"));
        System.out.println(g.getUsername());


        // checking the admin
        boolean isadmin = false;

        g.setPassword("Nirmala", isadmin );
        System.out.println(g.getPassword());



    }
}
