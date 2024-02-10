import java.util.ArrayList;
import java.util.List;

public class Renter extends CarManagement{
    private static int nextId = 1;
    private int id;
    private String name;
    private String email;
    private List<Car> rentedCars;
    private double totalRentalFee;
    private String phoneNumber;
    private String address;

    public Renter(String name, String email, double totalRentalFee, String phoneNumber, String address, List<Car> rentedCars) {
        
        this.id = nextId++;
        this.name = name;
        this.email = email;
        this.rentedCars = rentedCars;
        this.totalRentalFee = totalRentalFee;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public Renter(List<Car> list){
        super(list);
        this.id = nextId++;
        name = "";
        email = "";
        rentedCars = new ArrayList<>();
        totalRentalFee = 0;
        phoneNumber = "";
        address = "";

    }

    public Renter(String name, String email,String address , String phoneNumber, List<Car> carList) {
        super(carList);
        this.id = nextId++;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        rentedCars = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }
    public void rentACar(int carId)
   {
        
         for (Car car : carList) {
              if(car.getId()==carId){
                if(car.getRentalStatus()==false){
                    car.setRentalStatus(true);
                    this.rentedCars.add(car);
                    System.out.println("Car rented successfully");
                }
                else{
                    System.out.println("Car is already rented");
                }
              }
         }
         calTotalRentalFee();
   }
   public void returnACar(int carId)
   {
    boolean check=false;
       for(Car car : rentedCars)
       {
            if(car.getId()==carId)
            {
              check=true;
            }
       }
       if(check==true)
       {
            for(Car car : carList)
            {
                if(car.getId()==carId)
                {
                    car.setRentalStatus(false);
                    rentedCars.remove(car);
                    System.out.println("Car returned successfully");
                }
            }
       }
       else
       {
              System.out.println("Car not found in rented car list");
       }
   }
   public void calTotalRentalFee()
   {
    double temp=0;
    for(Car car:rentedCars)
    {
        temp+=car.getRent();
    }
    this.totalRentalFee=temp;
   }
   @Override
   public void printRentedCarList()
   {
         for(Car car:rentedCars)
         {
              car.display();
         }
   }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Car> getRentedCars() {
        return rentedCars;
    }

    public void setRentedCars(List<Car> rentedCars) {
        this.rentedCars = rentedCars;
    }

    public double getTotalRentalFee() {
        return totalRentalFee;
    }

    public void setTotalRentalFee(double totalRentalFee) {
        this.totalRentalFee = totalRentalFee;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display() {
        System.out.println("Customer Information:");
        System.out.println("---------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Rented Cars:");
        for (Car car : rentedCars) {
            System.out.println("    - " + car.getBrand() + " " + car.getModel() + ", Plate Number: " + car.getPlateNumber());
        }
        System.out.println("Total Rental Fee: $" + totalRentalFee);
        System.out.print("\n\n");
    }
}

