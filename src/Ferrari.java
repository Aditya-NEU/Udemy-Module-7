public class Ferrari extends Car {

    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }
    @Override
    public void accelerate() {
       // super.accelerate();
        System.out.println("Ferrari is accelerating.");
    }

    @Override
    public void startEngine() {
     //   super.startEngine();
        System.out.println("Ferrari engine is starting");
    }

    @Override
    public void brake(){
        System.out.println("Ferrari is breaking.");
    }


}
