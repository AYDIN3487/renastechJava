package day26.taskCar;

public class BMW  extends  Car{

    //method overriding: same method name, same parameter, same return-type  (MUST)
//				   MUST happen in the sub class
//				   access modifer MUST be same or more visible
//				   ONLY the instance methods can be overridden
//				   @Override annotation MUST be applicable
//

    //start()  inherited
    //stop() inherited
    @Override // this will check if your method overrided or not
    public void startCar(){
        System.out.println("BMW started");
    }

    ///@Override
    public void bmwColor(){
        System.out.println("bmw is green");
    }
}
