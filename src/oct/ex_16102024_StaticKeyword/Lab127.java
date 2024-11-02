package oct.ex_16102024_StaticKeyword;

public class Lab127 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        new A();
        A a2;
    }
}

class A {
    {
        System.out.println("IIB");
    }

    static {
        System.out.println("SIB");
    }
}

