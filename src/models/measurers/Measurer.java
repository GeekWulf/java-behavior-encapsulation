package models.measurers;

public interface Measurer<T> {
    double measure(T object);
}
