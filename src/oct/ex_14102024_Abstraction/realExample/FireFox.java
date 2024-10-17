package oct.ex_14102024_Abstraction.realExample;

public class FireFox extends BaseClass{
    @Override
    void openBrowser(String browser) {
        System.out.println("Open the FireFox");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Close the FireFox");
    }
}
