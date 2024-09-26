package sept.ex_20092024;

public class Lab052_real_scenario {
    public static void main(String[] args) {
        // web Automation
        // I'll ask them which browser you wanted to run the application.
        String browser = "safari";

        switch(browser)
        {
            case "chrome":
                System.out.println("app staring on the chrome browser");
                break;
            case "edge":
                System.out.println("app staring on the edge browser");
                break;
            case "safari":
                System.out.println("app staring on the safari browser");
                break;
            default:
                System.out.println("Not able to understood which browser you wanted to use!!");
        }
    }
}
