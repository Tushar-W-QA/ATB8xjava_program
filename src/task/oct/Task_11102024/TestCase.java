package task.oct.Task_11102024;


public class TestCase extends BaseClass{

    public TestCase() {
        super();
        super.setName("HTTP", true);
        }

    @Override
    void performGET() {
        System.out.println(" get method overriding the parent class ");
    }

    @Override
    void performPOST() {
        System.out.println(" post method overriding the parent class ");
    }

    @Override
    void performPATCH(String name) {
        System.out.println(" get method overriding the parent class --> " + name);
    }

    @Override
    void performPUT(int i) {
        System.out.println(" get method overriding the parent class --> " + i);
    }

    @Override
    void performDELETE() {
        System.out.println(" Delete method overriding the parent class");
    }
}

