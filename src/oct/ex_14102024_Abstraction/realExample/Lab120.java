package oct.ex_14102024_Abstraction.realExample;

public class Lab120 {
    public static void main(String[] args) {
        ChromeTC c = new ChromeTC();
        c.openBrowser("Chrome");
        c.closeBrowser("Chrome");
        c.takeScreenShot();
        c.IamPresentHere();


        FireFox ff = new FireFox();
        ff.openBrowser("FireFox");
        ff.closeBrowser("FireFox");

    }
}
