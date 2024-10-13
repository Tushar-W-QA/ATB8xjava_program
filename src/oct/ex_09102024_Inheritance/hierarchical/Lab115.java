package oct.ex_09102024_Inheritance.hierarchical;

public class Lab115 {
    public static void main(String[] args) {
        Tushar t = new Tushar();
        t.coaching_class();
        System.out.println(t.father_gold);

        Pooja p = new Pooja();
        System.out.println(p.store);
        p.car();
        p.bhk4();
    }
}
