package day26;

public class c2_AccesTest {

    public static void main(String[] args) {
        //since variables and methods that we created are static
        //i will be able to call them with class name

        System.out.println("c1_AccessModifier.publicVrb = " + c1_AccessModifier.publicVrb);
        System.out.println("c1_AccessModifier.defaultVrb = " + c1_AccessModifier.defaultVrb);
        System.out.println("c1_AccessModifier.protectedVrb = " + c1_AccessModifier.protectedVrb);
        //i dont have acces to priavate vrble

        c1_AccessModifier.deffaultMethod();
        c1_AccessModifier.publicMethod();
        c1_AccessModifier.protectedMethod();

        //cant call priavate
    }
}
