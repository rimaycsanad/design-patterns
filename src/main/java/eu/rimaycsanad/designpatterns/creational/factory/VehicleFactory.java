package eu.rimaycsanad.designpatterns.creational.factory;

public class VehicleFactory {

    public static Vehicle getVehicle(String type) {
        switch (type) {
            case "car" : return new Car();
            case "bus" : return new Bus();
            case "bulldozer" : return  new Bulldozer();
            default: System.out.println("I can't create this type of vehicle: "+type);
        }
        return null;
    }
}
