package day23;

import day23.RenastechStudent; // no need to import becues they are in same package
import MyLibrary.Library;//since library is in different package you need import to be able use

public class StudentObject {

    public static void main(String[] args) {
        //in static methods
        //to be able to call instance variable , instance method you would need to create an object

        //but for static members you dont need it

        //lets assign school name
        RenastechStudent.setSchoolName("RenasTech");


        RenastechStudent s1=new RenastechStudent();
        s1.setStudentInfo("Heshu");

        RenastechStudent s2=new RenastechStudent();
        s2.setStudentInfo("Serhat");

        s1.getStudentInfo();
        s2.getStudentInfo();

        RenastechStudent s3=new RenastechStudent();
        s3.setStudentInfo("Vahap");

        s3.getStudentInfo();


        Library.stars();
        //this stars method was createad a static method i didnt need to create an object from Library class
        //i can just call static method by using class name

        System.out.println(s1);//to string


        StudentObject so1=new StudentObject();
        //objects they are comming from specific custom classes

        //int,string ....


        //biggest one we have  object library
        //this will be apply for any custom classe

        //object
        //student car renas shoe



    }
}
