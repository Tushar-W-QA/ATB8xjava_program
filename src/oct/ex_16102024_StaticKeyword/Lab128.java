package oct.ex_16102024_StaticKeyword;

public class Lab128 {
    public static void main(String[] args) {
        //TW tw = new TW();
    }
}

class TW{
    {
        System.out.println("IIB");
        // WHat is purpose?
        // Here we can write code related to the
        // Start the browser before starting
        // web automation or API automation
        System.out.println("read the excelfile");
    }
    static {
        System.out.println("Load the class, I'll be execute");
    }


    // instance dependent means it depends upon which object
    private String name;
    private String mobile_number;
    public String course = "ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // parametrise constructor

    public TW(String name) {
        this.name =name;
    }

    // Non-static method
    void readDocument(){
        System.out.println("Non static method");
    }

    // Static method
    // if anything which is common for everyone then we should use the static keyword

    void doAssignment(){
        System.out.println("Static Method");
    }
}
