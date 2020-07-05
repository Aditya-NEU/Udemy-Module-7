public class Main {
    public static void main(String[] args) {
        /**
         * This problem is related to composition concept of Java.
         */
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.


//        Wall wall1= new Wall("West");
//        Wall wall2= new Wall("South");
//        Wall wall3= new Wall("North");
//        Wall wall4= new Wall("East");
//
//
//        Ceiling ceiling= new Ceiling(12,"white");
//
//        Bed bed= new Bed("Moder",4,10,2,1);
//
//        Lamp lamp= new Lamp("Classic",false,75);
//
//        Bedroom bedroom= new Bedroom("Adityas Bedroom",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
//        bedroom.makeBed();
//
//        bedroom.getLamp().turnOn();

        /**
         * This problem is related to encapsulation concept of Java.
         */

        // Create a class and demonstrates proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.


        Printer printer= new Printer(50,true);
        System.out.println();
        System.out.println("Initial page count ="+printer.getPagesPrinted());
        int pagesPrinted= printer.printPages(4);
        System.out.println("Pages printed was "+pagesPrinted+" ,new total print count for printer= "+printer.getPagesPrinted());
        pagesPrinted=printer.printPages(2);
        System.out.println("Pages printed was "+pagesPrinted+" ,new total print count for printer= "+printer.getPagesPrinted());


        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).




    }
}
