package eu.rimaycsanad.designpatterns.creational.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleFactoryTest {

    @Test
    public void getVehicle() {
        Vehicle vehicle = VehicleFactory.getVehicle("car");
        assertTrue(vehicle instanceof Car);

        vehicle = VehicleFactory.getVehicle("bus");
        assertTrue(vehicle instanceof Bus);

        vehicle = VehicleFactory.getVehicle("bulldozer");
        assertTrue(vehicle instanceof Bulldozer);

        vehicle = VehicleFactory.getVehicle("house");
        assertTrue(vehicle == null);
    }
}