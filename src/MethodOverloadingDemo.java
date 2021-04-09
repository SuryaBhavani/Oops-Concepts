import java.util.Scanner;
public class MethodOverloadingDemo {
    public int add(){
        return 5+6;
    }
    public int add(int a,int b){
        return a+b;
    }
    public String add(String a){
        return a;
    }
    public static void main(String [] args){
        MethodOverloadingDemo obj=new MethodOverloadingDemo();
        System.out.println(obj.add());
        System.out.println(obj.add(100,1000));
        System.out.println(obj.add("Surya"));

    }
}
