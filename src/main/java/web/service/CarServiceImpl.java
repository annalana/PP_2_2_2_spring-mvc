package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private static List<Car> carsList = new ArrayList<>() {{
        add(new Car(1111, "f", 1991));
        add(new Car(1110, "f", 1991));
        add(new Car(1112, "f", 1991));
        add(new Car(10, "fy", 2001));
        add(new Car(11, "f", 2002));
    }};
    public List<Car> getCars(int count) {
        return count == 0 ? null
                : (count > 0 && count < carsList.size() ? carsList.subList(0, count)
                : carsList);
    }
}
