package day25;

public class Fox extends Animal{

    public void smileFox(){
        System.out.println(name + " is laughing ");
    }

    public static void main(String[] args) {
        Fox fox1=new Fox();
        // fox1.eat("chicken"); // so if we dont extand parent class we cannot call any function from parent
        //
        fox1.name="fox1";
        fox1.age=5;
        fox1.weight=10.5;

        fox1.eat("chicken");

        fox1.move();
        fox1.grow();

        fox1.smileFox();

    }
}
