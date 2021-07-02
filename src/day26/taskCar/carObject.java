package day26.taskCar;

public class carObject {

    public static void main(String[] args) {
        Audi audi=new Audi();
        audi.startCar();

        BMW bmw=new BMW();
        bmw.startCar();

        Toyota toyota=new Toyota();
        toyota.startCar();

        toyota.stopCar();
        audi.stopCar();
    }
}
