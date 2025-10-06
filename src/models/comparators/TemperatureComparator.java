package models.comparators;

import models.Sensor;

public class TemperatureComparator implements Comparator<Sensor> {
    @Override
    public int compare(Sensor o1, Sensor o2) {
        return (int) (o1.getTemperature() - o2.getTemperature());
    }
}
