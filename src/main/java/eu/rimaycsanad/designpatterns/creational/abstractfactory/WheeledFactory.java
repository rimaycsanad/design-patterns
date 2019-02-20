package eu.rimaycsanad.designpatterns.creational.abstractfactory;

public class WheeledFactory {

    public static Wheeled getWheeled(WheeledAbstractFactory factory) {
        return factory.createWeeled();
    }
}
