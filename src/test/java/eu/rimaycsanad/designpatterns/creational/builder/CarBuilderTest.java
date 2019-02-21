package eu.rimaycsanad.designpatterns.creational.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarBuilderTest {

    @Test
    public void testBuilder() {
        Car car = new Car.CarBuilder("Audi", "A4", "Diesel", 100).setAirConditioner(true).setAutomaticTransmission(true).build();

        System.out.println(car.toString());

        car = new Car.CarBuilder("Audi", "A4", "Diesel", 100).build();
        System.out.println(car.toString());

    }

}