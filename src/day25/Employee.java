package day25;

public class Employee {

    //the goal of this task to create SDET,Developers,ScrumMaster

    //name
    //jobId
    //jobTitle
    //age
    //salary

    public String name;
    public long jobID;
    public String jobTitle;
    public int age;
    public double salary;

    public String toString(){
        return "Name : " + name + " JobTitle " + jobTitle + " Age : " +age +" ID : " +jobID;
    }
}
