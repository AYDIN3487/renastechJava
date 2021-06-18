package day02;
public class c6_String {
    public static void main(String [] args){
        String name="Serhat";
        String companyName="Amazon";
        String companyName2="Renastech";
        double salary=110000.00;
        System.out.println("Name : " + name + " Company Name :" + companyName2 + " Salary : "+ salary);
        //printing them in new lines
        System.out.println("Name : " + name + "\nCompany Name :" + companyName2 + "\nSalary : "+ salary);
        // to make println concat different variables you need to use  +
        String number="100000"; // this is still word characters
    }
}