public class MethodOverridingDemo extends Greetings1 {
    public void greet(){
        System.out.println("hello from greetings2 class");
    }
    public static void main(String[]args){
        MethodOverridingDemo obj=new MethodOverridingDemo();
        obj.greet();
    }
}
class Greetings1{
    public void greet(){
        System.out.println("hai from greetings1 class");
    }
}

