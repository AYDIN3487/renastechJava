package Exercises;

public class Ex1 {
    public static void main(String[] args) {


        int num1=25;
        double num2=10.55;
        byte num3=2;

        method(num2); // 10..55
        method(num3); //2
        method(num1); //25
        method("hello world");
    }


    public static void method(int a){
        System.out.println(a +"is integer");

      }

    public static void method(double a){
        System.out.println(a + " is double");

    }

    public static void method(byte a){
        System.out.println(a + " is byte");
    }

    public static void method(String str){
        System.out.println(str + "is string");
    }
}
