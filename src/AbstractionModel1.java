import java.util.Scanner;
abstract class AbstractionModel1 {
    abstract double sum();
    abstract double difference();
    abstract double multiplication();
    abstract double division();
    float modulus(){
        int a=13;
        int b=6;
        return a%b;
    }
}
abstract class SemiCalculator extends AbstractionModel1{
    Scanner s=new Scanner(System.in);
    double a=s.nextDouble();
    double b=s.nextDouble();
    public double sum(){
        return a+b;
    }
    public double difference(){
        return a-b;
    }
    public double multiplication(){
        return a*b;
    }
}
class calculator extends SemiCalculator{

    public double division(){
        return a/b;
    }
    public static void main(String[]args){
        calculator obj=new calculator();
        double a=obj.a;
        double b=obj.b;
        System.out.println("sum ="+obj.sum());
        System.out.println("difference="+obj.difference());
        System.out.println("multiplication="+obj.multiplication());
        System.out.printf("division= %.2f",obj.division());
        System.out.println("\ndivision= "+String.format("%.1f",obj.division()));
        System.out.println(obj.modulus());
    }
}

