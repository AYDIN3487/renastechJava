package day26;
class test5{
    int number;
    public void method2(){
        System.out.println("method2");
    }
}
public class c6_methodOverriding extends test5 {

    public void method1(){

    }

    //    @Override
    public void method1(int i1){ // this is overloading method1()

    }

    @Override
    public void method2(){
        System.out.println("owerrite method");
    }


    //since we extends test5 all method and variables will be inherited from test5
    public static void main(String[] args) {
        c6_methodOverriding obj=new c6_methodOverriding();
        obj.method2();

    }

}

//why we need overriding: to implement different functions to the same method
//				reusable
//				flexible
//				less memory
//				easy to memorize
