package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class CarController {
    List<Car> carsList = new ArrayList<>() {{
        add(new Car(1111, "f", 1991));
        add(new Car(1110, "f", 1991));
        add(new Car(1112, "f", 1991));
        add(new Car(10, "fy", 2001));
        add(new Car(11, "f", 2002));
    }};
    @GetMapping(value = "/cars")
    public String printCarsTable(@RequestParam Map<String, String> params, ModelMap model) {
        int count = -1;
        try {
            count = Integer.parseInt(params.get("count"));
        } catch (NumberFormatException e) {}
        model.addAttribute("cars",
                count == 0 ? null
                           : (count > 0 && count < carsList.size() ? carsList.subList(0, count)
                                                                   : carsList));
        return "cars";
    }
}
