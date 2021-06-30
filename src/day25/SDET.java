package day25;

public class SDET extends Employee{
    //task says have SDET name,jobid,jobtitle,age,salary
    //function testing() , foundBug()

    //name (inherited)
    //jobId (inherited)
    //jobTitle (inherited)
    //age (inherited)
    //salary (inherited)

    //toString() (inherited)

    //create consturactor to assign all tester personle informations
    public SDET(String name,int age , long jobID , String jobTitle , double salary){
        this.name=name;
        this.age=age;
        this.jobID=jobID;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }

    //function testing() , foundBug()
    public void testing(){
        System.out.println(name + " is testing ");
    }

    public void foundBug(){
        System.out.println(name + " founded bug ") ;
    }
}