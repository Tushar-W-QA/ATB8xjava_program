package oct.ex_10102024.Encapsulation.SuperKeyword;

public class TestCase1 extends BaseClass{

    public TestCase1() {
        super(); // DC of super
        this.setBrowser("Edge", true);
        System.out.println(this.getBrowser());
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser("safari", isAuth);
    }

}
