package web;

import web.model.Car;
import web.service.CarService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = CarService.getCarsCount(3);

        for (Car car : cars) {
            System.out.println("Color: " + car.getColor() +
                    ", Number of Wheels: " + car.getNumberOfWheels() +
                    ", Length: " + car.getLength());
        }
    }
}
