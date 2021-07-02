package day26;


class test{

    //constroctor of test
    public test(){
        System.out.println("test");
    }
}


public class c3_Constructor extends test {
    //since we extend test class
    //everything inside test will be inherited
    //public test() inherited
    public c3_Constructor(){

        System.out.println("hello");
    }

    public c3_Constructor(String str){
        this();
        System.out.println("hello string");
    }

    public static void main(String[] args) {
        test obj=new test();  //test

        c3_Constructor obj2=new c3_Constructor(); //test and hello will be printed
        //since c3 class take test class as parent
        //constroctor of test also will be inherited

    }
}



  /*
    Within same class: It can be done using this() keyword for constructors in same class
    From base class: by using super() keyword to call constructor from the base class.-- we will see this later
    Why do we need constructor chaining ?
    This process is used when we want to perform multiple tasks in a single constructor
    rather than creating a code for each task in a single constructor we create a separate constructor for each task
    and make their chain which makes the program more readable.
     */