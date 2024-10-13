package oct.ex_10102024.Encapsulation.AccessModifier.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(15);
        jrCop.canShoot();
        System.out.println(jrCop.gun);
    }
}
