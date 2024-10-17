package oct.ex_14102024_Abstraction.realExample;

public class BaseClass extends GrandBaseClass{
    // WebAutomation
    // single
    // we want to hide the functionality of Start and Close browser.

    void openBrowser(String browser){};
    void closeBrowser(String browser){};

    @Override
    void takeScreenShot() {
        System.out.println("Taking ScreenShot");
    }


}
