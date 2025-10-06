package models.measurers;

import models.Sensor;

public class TemperatureMeasurer implements Measurer<Sensor> {
    @Override
    public double measure(Sensor object) {
        return object.getTemperature();
    }
}
