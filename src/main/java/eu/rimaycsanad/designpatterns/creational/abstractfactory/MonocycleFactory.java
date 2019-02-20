package eu.rimaycsanad.designpatterns.creational.abstractfactory;

public class MonocycleFactory extends WheeledAbstractFactory {

    private int nrOfWheels;

    public MonocycleFactory(int nrOfWheels) {
        this.nrOfWheels = nrOfWheels;
    }

    @Override
    public Wheeled createWeeled() {
        return new Monocycle(nrOfWheels);
    }
}
