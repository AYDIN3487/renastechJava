package day25;

public class Developer  extends Employee{

    //task says have DEveloper name,jobid,jobtitle,age,salary
    //function developing() , fixingBug()

    //name (inherited)
    //jobId (inherited)
    //jobTitle (inherited)
    //age (inherited)
    //salary (inherited)

    //toString() (inherited)


    //function developing() , fixingBug() needs to create since they are unique for only developers

    //constructor
    public Developer(String name,long jobID, String jobTitle , int age , double salary){
        this.name=name;
        this.jobID=jobID;
        this.jobTitle=jobTitle;
        this.age=age;
        this.salary=salary;

    }

    public void developing(){
        System.out.println(name + " is developing program ");

    }
    public void fixingBug( ){
        System.out.println(name + " is fixing bug");
    }
}