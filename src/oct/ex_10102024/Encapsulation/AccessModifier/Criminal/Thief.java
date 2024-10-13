package oct.ex_10102024.Encapsulation.AccessModifier.Criminal;

import oct.ex_10102024.Encapsulation.AccessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c = new Cop(10);
        System.out.println(c.gun);
     //   c.canShoot(); can't access because this function is from another package.
    }
}
