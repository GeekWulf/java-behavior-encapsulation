package models;

public class Sensor {
    private int sensorID;
    private double temperature;

    public Sensor(int sensorID, double temperature) {
        this.sensorID = sensorID;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getSensorID() {
        return sensorID;
    }
}
