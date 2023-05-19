package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpI implements CarService {
    private List<Car> car;

    {
        car = new ArrayList<>();   //создаем список и заполняем автомобилями

        car.add(new Car(1, 5, "bmw"));
        car.add(new Car(2, 6, "audi"));
        car.add(new Car(3, 7, "skoda"));
        car.add(new Car(4, 8, "porshe"));
        car.add(new Car(5, 9, "seat"));
    }

    public List<Car> index() {      //возвращает список из car
        return car;
    }

    @Override
    public List<Car> getCar(int number) {
        return car.stream().limit(number).toList();
    }
}
