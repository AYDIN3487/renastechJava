package day22;

public class Animals {

    String type; //instance variable
    double age;
    String color;
    String name;

    public void setAnimalInfo(String type, double age, String color , String name){
        this.type=type;
        // if your method has sama name with instance variable
        // use this keyword to point your instance variable
        this.age=age;
        //color=color; we need to tell java which one is the instance variable
        this.color=color;
        this.name=name;

    }

    public void eating(String food){
        System.out.println(name + " is eating " + food);
    }

    public void getType(){
        System.out.println(name + " is a "+type);
    }


}