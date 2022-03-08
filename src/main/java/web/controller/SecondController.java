package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.models.ServiseOfCar;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SecondController {
    @GetMapping(value = "/cars")
    public String print(@RequestParam(value = "number", defaultValue = "5")int number,Model model){
        List<Car> list = ServiseOfCar.numberOfCars(number);
        model.addAttribute("list", list);
        return "print";
    }
}



