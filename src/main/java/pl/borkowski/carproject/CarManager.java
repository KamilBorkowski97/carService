package pl.borkowski.carproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager {

    private List<Car> carList;

    public CarManager(){
        this.carList = new ArrayList<>();
        carList.add(new Car(1, "VW","POLO"));
        carList.add(new Car(2, "VW","126"));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public boolean addCar(Car car){
        return carList.add(car);
    }

    public boolean deleteCar(long id){

        for (Car car: carList) {
            if(car.getId()==id){
                return carList.remove(car);
            }
        }

        return false;
    }

    public boolean deleteAllCars(){
        return carList.removeAll(carList);
    }

}