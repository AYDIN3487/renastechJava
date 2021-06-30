package day25;

public class EmployeeObjects {

    public static void main(String[] args) {
        SDET saira=new SDET("Saira",25,345678,"SDET III",150);

        System.out.println(saira);
        saira.foundBug();

        Developer evindar=new Developer("Evindar", 345679,"Developer" ,20,140);

        System.out.println(evindar);
        evindar.fixingBug();
        //saira.fixingBug();  fixing bug is unique for developers
    }


    //bigeest parent                       Employee
    //parent that extend Employee          DevTeam
    //child that extend DevTeam            Developer
}