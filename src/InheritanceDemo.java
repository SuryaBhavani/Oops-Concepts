import java.util.*;
public class InheritanceDemo extends Car {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        Car obj=new Car();
        System.out.println("The name of the vehicle is "+obj.name()+" which is a "+obj.noOfSeats() +" seater and has "+obj.noOfWheels()+" wheels");

    }
}



abstract class Bus{
    String  names=" ";
    abstract  int noOfSeats();
    abstract int noOfWheels();
    protected String name(){
        System.out.println("Enter the name of the vehicle");
        Scanner s=new Scanner(System.in);
        names=s.nextLine();
        return names;
    }
}
class Car extends Bus{

    int num1;
    int num2;
    Scanner s=new Scanner(System.in);
    int noOfSeats(){
        System.out.println("Enter the total number of seats");

        int num1=s.nextInt();s.nextLine();
        return num1;
    }int noOfWheels(){
        System.out.println("Enter the number of wheels");
        int num2=s.nextInt();s.nextLine();
        return num2;
    }


}