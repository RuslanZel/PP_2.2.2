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
        cars.add(new Car(1, "����", 30));
        cars.add(new Car(2, "��������", 200));
        cars.add(new Car(3, "���", 50));
        cars.add(new Car(4, "�����", 1000));
        cars.add(new Car(5, "���", 700));
    }

    public List<Car> viewCar(int i) {
        if (i > 0 & i < 5) return cars.subList(0, i);
        return cars;
    }
}
