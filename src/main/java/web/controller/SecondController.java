package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.ServiseOfCarImpl;

import java.util.List;

@Controller
public class SecondController {

    private final ServiseOfCarImpl serviseOfCarImpl;

    public SecondController(ServiseOfCarImpl serviseOfCarImpl) {
        this.serviseOfCarImpl = serviseOfCarImpl;
    }

    @GetMapping(value = "/cars")
    public String print(@RequestParam(value = "number", defaultValue = "5")int number,Model model){
        List<Car> list = serviseOfCarImpl.getCar(number);
        model.addAttribute("list", list);
        return "print";
    }
}



