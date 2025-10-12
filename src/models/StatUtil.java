package models;

import models.comparators.*;
import models.measurers.BalanceMeasurer;
import models.measurers.Measurer;
import models.measurers.TemperatureMeasurer;

public class StatUtil {
    public static <T> int countNegative(T[] Collections, Measurer<T> measurer) {
        int count = 0;

        for (T obj : Collections) {
            if (measurer.measure(obj) < 0) {
                count ++;
            }
        }

        return count;
    }

    public static <T> void sort(T[] a, Comparator<T> comparator) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (comparator.compare(a[j], a[minPos]) < 0) {
                    minPos = j;
                }
            }
            T temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

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

        System.out.println(countNegative(sensors, new TemperatureMeasurer()));
        System.out.println(countNegative(cards, new BalanceMeasurer()));
    }
}
