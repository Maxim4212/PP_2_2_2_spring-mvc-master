package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("red", 4, 3.43f),
            new Car("yellow", 3, 2.43f),
            new Car("green", 2, 1.43f),
            new Car("yellow", 3, 1.43f),
            new Car("blue", 1, 5.43f)
    ));

    @Override
    public List<Car> getCarsCount(int carsCount) {
        return cars.stream()
                .limit(carsCount)
                .toList();
    }
}
