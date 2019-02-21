package eu.rimaycsanad.designpatterns.creational.builder;

public class Car {

    //mandatory properties
    private String brand;
    private String model;
    private String engineType;
    private Integer horsePower;

    //optional properties
    private boolean airConditioner;
    private boolean automaticTransmission;
    private boolean automaticWindowControl;
    private boolean frontSeatHeating;
    private boolean rearSeatHeating;

    private Car(CarBuilder builder){
        this.brand = builder.brand;
        this.model = builder.model;
        this.engineType = builder.engineType;
        this.horsePower = builder.horsePower;
        this.airConditioner = builder.airConditioner;
        this.automaticTransmission = builder.automaticTransmission;
        this.automaticWindowControl = builder.automaticWindowControl;
        this.frontSeatHeating = builder.frontSeatHeating;
        this.rearSeatHeating = builder.rearSeatHeating;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", horsePower=" + horsePower +
                ", airConditioner=" + airConditioner +
                ", automaticTransmission=" + automaticTransmission +
                ", automaticWindowControl=" + automaticWindowControl +
                ", frontSeatHeating=" + frontSeatHeating +
                ", rearSeatHeating=" + rearSeatHeating +
                '}';
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private String engineType;
        private Integer horsePower;
        private boolean airConditioner;
        private boolean automaticTransmission;
        private boolean automaticWindowControl;
        private boolean frontSeatHeating;
        private boolean rearSeatHeating;

        public CarBuilder(String brand, String model, String engineType, Integer horsePower) {
            this.brand = brand;
            this.model = model;
            this.engineType = engineType;
            this.horsePower = horsePower;
        }

        public CarBuilder setAirConditioner(boolean airConditioner) {
            this.airConditioner = airConditioner;
            return this;
        }

        public CarBuilder setAutomaticTransmission(boolean automaticTransmission) {
            this.automaticTransmission = automaticTransmission;
            return this;
        }

        public CarBuilder setAutomaticWindowControl(boolean automaticWindowControl) {
            this.automaticWindowControl = automaticWindowControl;
            return this;
        }

        public CarBuilder setFrontSeatHeating(boolean frontSeatHeating) {
            this.frontSeatHeating = frontSeatHeating;
            return this;
        }

        public CarBuilder setRearSeatHeating(boolean rearSeatHeating) {
            this.rearSeatHeating = rearSeatHeating;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
