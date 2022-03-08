package web.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiseOfCar {
    public static List<Car> numberOfCars( int  number){
        List<Car> list = new ArrayList<>();
        list.add(new Car("Porshe", 2005, "red"));
        list.add(new Car("Chevrolet", 2011, "black"));
        list.add(new Car("Honda", 2022, "yellow"));
        list.add(new Car("Audi", 2014, "red"));
        list.add(new Car("Ford", 1991, "white"));
        if( number<0)
            return list;
        if(number>5)
            return list;
        return list.stream().limit(number).collect(Collectors.toList());

    }



}
