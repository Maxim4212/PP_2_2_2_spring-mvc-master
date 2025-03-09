package web;

import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = carService.getCarsCount(3);

        for (Car car : cars) {
            System.out.println("Color: " + car.getColor() +
                    ", Number of Wheels: " + car.getNumberOfWheels() +
                    ", Length: " + car.getLength());
        }
    }
}
