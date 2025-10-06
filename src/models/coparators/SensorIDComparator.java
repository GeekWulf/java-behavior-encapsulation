package models.coparators;

import models.Sensor;

public class SensorIDComparator implements Comparator<Sensor> {
    @Override
    public int compare(Sensor o1, Sensor o2) {
        return o1.getSensorID() - o2.getSensorID();
    }
}
