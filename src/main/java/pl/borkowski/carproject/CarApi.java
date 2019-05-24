package pl.borkowski.carproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarApi {

    @Autowired
    private CarManager carManager;

    /*public CarApi(CarManager carManager){
        this.carManager = carManager;
    }*/

    @GetMapping("/getCars")
    public List<Car> getCars(){
        return carManager.getCarList();
    }

    @PostMapping("/addCar")
    public boolean addCar(@RequestBody Car car){
        return carManager.addCar(car);
    }

    @DeleteMapping("/deleteCar")
    public boolean deleteCar(@RequestParam long id){
        return carManager.deleteCar(id);
    }

    @DeleteMapping("/deleteAllCars")
    public boolean deleteAllCars(){
        return carManager.deleteAllCars();
    }

}