package task.oct.Task_11102024;

public class APIAutomation {

    public static void main(String[] args) {
        BaseClass T = new TestCase();
        T.setId(16);
        System.out.println(T.getId());

        T.setName("Dhanraj", false);
        System.out.println(T.getName());

        T.performGET();
        T.performPOST();
        T.performPATCH("Tushar");
        T.performPUT(10);
        T.performDELETE();
    }
}
