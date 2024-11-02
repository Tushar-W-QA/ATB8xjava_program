//package oct.ex_14102024_Abstraction;
//
//public class Lab124 {
//    public static void main(String[] args) {
//
//        ABC abc = new ABC();
//        abc.f1();
//
//       // XYZ xyz = new XYZ();
//       // xyz.displays();
//
//
//    }
//}
//
//
//class XYZ {
//    void displays() {
//        new ABC().f4();
//    }
//}
//
//
//class ABC implements I, I1 {
//
//    @Override
//    public void f1() {
//        System.out.println("f1");
//    }
//
//    @Override
//    public void f2() {
//        System.out.println("f2");
//    }
//
//    @Override
//    public void f3() {
//        System.out.println("f3");
//    }
//
//    @Override
//    public void f4() {
//        System.out.println("f4");
//    }
//
//    @Override
//    public void f20() {
//        System.out.println("f20");
//    }
//
//    @Override
//    public void f10() {
//        System.out.println("f10");
//    }
//}
//
//interface I {
//    void f1();
//
//    void f2();
//
//    void f3();
//
//    void f4();
//}
//
//interface I1 {
//    void f20();
//
//    void f10();
//}