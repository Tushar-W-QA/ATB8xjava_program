package oct.ex_10102024.Encapsulation.SuperKeyword;

public class BaseClass {
    // instance variable
    private String browser;

    // Constructor
    public BaseClass(){
        System.out.println("DC --> BaseClass");
    }
    public BaseClass(String b){
        System.out.println(("PC --> BaseClass"));
    }

    // Getter and Setter
    public String getBrowser(){
        return browser;
    }
    public void setBrowser(String browser, boolean isAuth){
        if(isAuth) {
            this.browser = browser;
        } else {
            System.out.println(" Not Allowed!!! ");
        }
    }

    // polymorphism (1. Method overloading)

    void openBrowser(){
        System.out.println( "Chrome browser");
    }

    void openBrowser(String browser){
        System.out.println("Opening a browser --> " + browser);
    }

    void closeBrowser(){
        System.out.println("close browser");
    }

}
