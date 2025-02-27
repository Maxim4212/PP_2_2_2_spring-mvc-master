package web.model;

public class Car {
    private final String color;
    private final int numberOfWheels;
    private final float length;

    public Car(String color, int numberOfWheels, float length) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public float getLength() {
        return length;
    }
}
