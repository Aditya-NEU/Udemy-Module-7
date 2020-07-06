public class Audi extends Car {

    public Audi (String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("Audi is accelerating.");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Audi engine is starting");
    }

    @Override
    public void brake(){
        System.out.println("Audi is breaking.");
    }
}
