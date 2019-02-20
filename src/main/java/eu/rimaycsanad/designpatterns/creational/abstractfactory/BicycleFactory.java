package eu.rimaycsanad.designpatterns.creational.abstractfactory;

public class BicycleFactory extends WheeledAbstractFactory {

    int nrOfWheels;

    public BicycleFactory(int nrOfWheels) {
        this.nrOfWheels = nrOfWheels;
    }

    @Override
    public Wheeled createWeeled() {
        return new Bicycle(nrOfWheels);
    }
}
