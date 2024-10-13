package oct.ex_10102024.Encapsulation.Example;

public class ICICI_Bank {
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    public ICICI_Bank (String name, long bal) {
        this.name =name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }
    public void setBal(long bal, boolean isAdmin) {
        if (isAdmin) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed set a balance");
        }
    }
}
