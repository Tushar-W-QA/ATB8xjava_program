package oct.ex_10102024.Encapsulation.SuperKeyword;

public class Lab119 {
//    Super id keyword in java
//    which act as reference variable that allows subclass
//    (child class to reference parent class)

    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with Constructors

    public static void main(String[] args) {
        car c = new car();

    }

}

class car extends vehicle {
    private int max_speed = 100;

    void licence(){
        System.out.println("Licence no -->" + 4400);
    }

    car(){
        super(15);
        System.out.println(super.max_speed); // Parent max speed
        System.out.println(this.max_speed);  // child / my max speed
        System.out.println("Default constructor car");
        this.licence();  // child or my licence
        super.licence(); // parent licence

    }

}

class vehicle {
    public int max_speed = 180;

    void licence(){
        System.out.println("Licence no -->" + 1111);
    }

    public vehicle(){
        System.out.println("default constructor vehicle");
    }

    public vehicle( int a){
        System.out.println("parameterise constructor");
    }

    void message() {
        System.out.println("Hello vehicle");
    }
    void message(int a){
        System.out.println("Hello Tushar");
    }
}
