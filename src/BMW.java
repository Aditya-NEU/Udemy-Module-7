public class BMW extends Car {

    public BMW (String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("BMW is accelerating.");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("BMW engine is starting");
    }

    @Override
    public void brake(){
        System.out.println("BMW is breaking.");
    }
}
