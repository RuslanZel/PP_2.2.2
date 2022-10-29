package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class CarServiceImpl implements CarService {


    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Форд", 30));
        cars.add(new Car(2, "Мерседес", 200));
        cars.add(new Car(3, "БМВ", 50));
        cars.add(new Car(4, "KIA", 1000));
        cars.add(new Car(5, "Лексус", 700));
    }

    public List<Car> getCarsByCount(int i) {
        if (i > 0 & i < 5) return cars.subList(0, i);
        return cars;
    }
}
