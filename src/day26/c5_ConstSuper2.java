package day26;

class test3{

    int number=100;

    public test3(int i1){
        System.out.println(this.number); //100
    }
}

public class c5_ConstSuper2 extends test3 {

    int number=50;

    public c5_ConstSuper2(){
        super(10); //100
        System.out.println(super.number);//super will call your super class instance variable //100
        System.out.println(this.number); // this will call your current class instance variable //50
    }

    public static void main(String[] args) {
        c5_ConstSuper2 obj=new c5_ConstSuper2();
    }

}