package models;

import models.comparators.BalanceComparator;
import models.comparators.CreditCardNameComparator;
import models.comparators.SensorIDComparator;
import models.comparators.TemperatureComparator;

public class SortTest {
    public static void main(String[] args) {
        Sensor[] sensors = {
                new Sensor(1, -20),
                new Sensor(2, 32),
                new Sensor(3, -15)
        };

        CreditCard[] cards = {
                new CreditCard("Emma", 300),
                new CreditCard("Chris", 100),
                new CreditCard("Joey", -50)
        };

        StatUtil.sort(sensors, new SensorIDComparator());
        System.out.print("Sort by ID :           ");
        for (Sensor sensor : sensors) {
            System.out.print(sensor + " ");
        }
        System.out.println();

        StatUtil.sort(sensors, new TemperatureComparator());
        System.out.print("Sort by temperature :  ");
        for (Sensor sensor : sensors) {
            System.out.print(sensor + " ");
        }
        System.out.println();

        StatUtil.sort(cards, new CreditCardNameComparator());
        System.out.print("Sort by name :         ");
        for (CreditCard card : cards) {
            System.out.print(card + " ");
        }
        System.out.println();

        StatUtil.sort(cards, new BalanceComparator());
        System.out.print("Sort by balance :      ");
        for (CreditCard card : cards) {
            System.out.print(card + " ");
        }
        System.out.println();
    }
}
