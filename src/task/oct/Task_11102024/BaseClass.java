package task.oct.Task_11102024;

public class BaseClass {
    private String name;
    private int id;
    // Constructor
    public BaseClass(){
        System.out.println("DC --> BaseClass");
    }

    public BaseClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

     // Getter and Setter


    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAuth) {
        if(isAuth) {
            this.name = name;
        }else{
            System.out.println("Note Allowed");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0) {
            this.id = id;
        }else {
            System.out.println("id should be greater than 0");
        }
    }



    void performGET() {
        System.out.println("Performing get");
    }

    void performPOST(){
        System.out.println("Performing post");
    }

    void performPATCH(String name) {
        System.out.println("Performing patch");
    }

    void performPUT(int i) {
        System.out.println("Performing put");
    }

    void performDELETE(){
        System.out.println("Performing delete");
    }
}
