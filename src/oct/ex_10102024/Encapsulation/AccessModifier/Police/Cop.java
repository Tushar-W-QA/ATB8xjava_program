package oct.ex_10102024.Encapsulation.AccessModifier.Police;

public class Cop {
    public int gun;
    public String IdCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canShoot() {
        System.out.println("Yes, You can shoot!!");
    }
}
