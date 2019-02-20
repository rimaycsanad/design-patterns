package eu.rimaycsanad.designpatterns.creational.abstractfactory;

public class Monocycle extends Wheeled {
    private int numberOfWheels;

    public Monocycle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }
}
