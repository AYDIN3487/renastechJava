package day25;

public class Bird extends Animal {


     /*
     since we extend animal class we will have access to all below
    name
    age
    weight
    eat()
    move()
    grow()
     */

    public void fly(){
        System.out.println(name + " is fliying");
    }

    public static void main(String[] args) {
        Bird bird1=new Bird();
        bird1.name="bird1";
        bird1.age=12;
        System.out.println(bird1.age + bird1.name);
        bird1.move();

        bird1.eat("lettuce");

        bird1.fly();

    }

}
