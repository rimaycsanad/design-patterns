package eu.rimaycsanad.designpatterns.creational.abstractfactory;

public class Bicycle extends Wheeled {
    private int numberOfWheels;

    public Bicycle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }
}
