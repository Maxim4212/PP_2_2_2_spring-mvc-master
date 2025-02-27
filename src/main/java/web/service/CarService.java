package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    public static List<Car> getFiveCarsList() {
        return Arrays.asList(new Car("red", 4, 3.43f),
                             new Car("yellow", 3, 2.43f),
                             new Car("green", 2, 1.43f),
                             new Car("yellow", 3, 1.43f),
                             new Car("blue", 1, 5.43f));
    }

    public static List<Car> getCarsCount(int carsCount) {
        List<Car> cars = new ArrayList<>();
        if (carsCount <= 5) {
            for (int i = 0; i < carsCount; i++) {
                cars.add(getFiveCarsList().get(i));
            }
        } else {
            cars = getFiveCarsList();
        }
        return cars;
    }
}
