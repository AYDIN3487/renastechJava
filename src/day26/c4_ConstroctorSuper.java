package day26;


class  test2{
    public test2(String str){
        System.out.println("test2");
    }

    public test2(int a){
        System.out.println("test2 int");
    }
}
public class c4_ConstroctorSuper extends test2{

    public c4_ConstroctorSuper(){
        //super(); java will always try to get parent default constructor if you have extended
        //if there is no default constructor it will give you error
        //you need use super keyword to navigate super class of constroctor
        super(34);
        System.out.println("c4_cons");
    }

    public static void main(String[] args) {
        //test2 obj=new test2("hello");//test2

        c4_ConstroctorSuper obj2=new c4_ConstroctorSuper();//test2 c4_cons
    }
}
