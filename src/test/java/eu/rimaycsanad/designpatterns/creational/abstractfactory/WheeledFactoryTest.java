package eu.rimaycsanad.designpatterns.creational.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class WheeledFactoryTest {

    Wheeled wheeled;
    @Test
    public void getWheeled() {

        wheeled = WheeledFactory.getWheeled(new BicycleFactory(2));
        assertTrue(wheeled.getNumberOfWheels() == 2);
        assertTrue(wheeled instanceof Bicycle);
        System.out.println(wheeled.getNumberOfWheels());

        wheeled = WheeledFactory.getWheeled(new MonocycleFactory(1));
        assertTrue(wheeled.getNumberOfWheels() == 1);
        assertTrue(wheeled instanceof Monocycle);
    }
}