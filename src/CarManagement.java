import java.util.ArrayList;
import java.util.List;

public class CarManagement {
    protected List<Car> carList;

    public CarManagement(List<Car> carList) {
        this.carList = carList;
    }
    public CarManagement() {
        carList = new ArrayList<Car>();
    }

    public List<Car> getCarList() {
        return carList;
    }
    
    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
    public void addACar(Car car) {
        carList.add(car);
    }
    public void printUnRentedCarList() {
        for (Car car : carList) {
            if(car.getRentalStatus()==false){
                car.display();
            }
      }
    }
    public void printRentedCarList() {
        for (Car car : carList) {
            if(car.getRentalStatus()==true){
                car.display();
            }
      }
    }
    public void printAllCarList() {
        for (Car car : carList) {
           car.display();

        }
    }
  
}
