public class Car {

    private String name;
    private int cylinders;
    private boolean engines;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engines=true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Car engine is starting.");
    }

    public void accelerate(){
        System.out.println("Car is accelerating.");
    }


    public void brake(){
        System.out.println("Car is breaking.");
    }

}
