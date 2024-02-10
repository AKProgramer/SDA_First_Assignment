import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
     Car car1 = new Car("Toyota", "Camry", 2020, "ABC123", false, 50.0, true, Arrays.asList("Bluetooth", "Backup Camera", "Keyless Entry"));
     Car car2 = new Car("Honda", "Accord", 2019, "XYZ456", false, 60.0, false, Arrays.asList("Sunroof", "Leather Seats", "Navigation System"));
     Car car3 = new Car("Ford", "Mustang", 2021, "DEF789", false, 70.0, true, Arrays.asList("Sports Exhaust", "Racing Stripes", "Spoiler"));
     Car car4 = new Car("Chevrolet", "Cruze", 2018, "GHI123", true, 55.0, true, Arrays.asList("Apple CarPlay", "Android Auto", "Remote Start"));
     Car car5 = new Car("BMW", "X5", 2022, "JKL456", false, 100.0, true, Arrays.asList("Panoramic Sunroof", "Heated Seats", "Gesture Control"));
     Car car6 = new Car("Mercedes-Benz", "C-Class", 2019, "MNO789", true, 80.0, false, Arrays.asList("Adaptive Cruise Control", "Lane Keeping Assist", "Blind Spot Monitoring"));
     Car car7 = new Car("Audi", "A4", 2020, "PQR012", false, 90.0, true, Arrays.asList("Virtual Cockpit", "Matrix LED Headlights", "Wireless Charging"));
    //  Car car8 = new Car("Hyundai", "Elantra", 2021, "STU345", true, 65.0, true, Arrays.asList("Smartphone Integration", "Automatic Emergency Braking", "Wireless Apple CarPlay"));
    //  Car car9 = new Car("Volkswagen", "Golf", 2017, "VWX678", false, 45.0, false, Arrays.asList("Park Assist", "Rain-Sensing Wipers", "Adaptive Headlights"));
    //  Car car10 = new Car("Subaru", "Outback", 2023, "YZA901", true, 75.0, true, Arrays.asList("All-Wheel Drive", "X-Mode", "EyeSight Driver Assist"));
     
      CarManagement carManagement = new CarManagement();
      RenterManagement renterManagement = new RenterManagement();
      carManagement.addACar(car1);
      carManagement.addACar(car2);
      carManagement.addACar(car3);
      carManagement.addACar(car4);
      carManagement.addACar(car5);
      carManagement.addACar(car6);
      carManagement.addACar(car7);
      
       while(true)
       {
        System.out.println("Press 1 to rent a car");
        System.out.println("Press 2 to return a car");
        System.out.println("Press 3 to display renter list");
        System.out.println("Press 2 to exit");
        int carRentChoice=input.nextInt();
        if(carRentChoice==1)
        {
         // input.nextLine();
          // System.out.println("Enter Your Details");
          // System.out.print("Enter customer name: ");
         // String name = input.nextLine();
          String name="ali";
          String email="racks";
          String phoneNumber="123";
          String address="lahore";
        //   System.out.print("Enter customer email: ");
        //  // String email = input.nextLine();
        //   System.out.print("Enter customer phone number: ");
        //  // String phoneNumber = input.nextLine();

        //   System.out.print("Enter customer address: ");
          // String address = input.nextLine();
          carManagement.printUnRentedCarList();
          Renter renter=new Renter(name, email, phoneNumber, address, carManagement.getCarList());
          //while(true)
          //{
           // System.out.println("Enter the car id you want to rent");
          //int carId=input.nextInt();
          //renter.rentACar(carId);
          renter.rentACar(1);
          renter.rentACar(2);
          renter.rentACar(3);
          //System.out.println("Do you want to rent another car? Press 1 for yes and 2 for no");
         // int rentAnotherCar=input.nextInt();
          // if(rentAnotherCar==2)
          // {
            renterManagement.addARenter(renter);
            renter.display();
            //break;
         // }
     // }
      }
      else if(carRentChoice==2)
      {
          System.out.println("Enter the renter id : ");
          int renterId=input.nextInt();
          Renter currenRenter=renterManagement.getARenter(renterId);
          if(currenRenter!=null)
          {
            while(true)
            {
              currenRenter.printRentedCarList();
              System.out.println("Enter the car id you want to return");
              int carId=input.nextInt();
              currenRenter.returnACar(carId);
              System.out.println("Do you want to return another car? Press 1 for yes and 2 for no");
              int returnAnotherCar=input.nextInt();
              if(returnAnotherCar==2)
              {
                break;
              }
            }  
          }
          else
          {
             System.out.println("Invalid renter id");
          }
          
        
     
      }
      else if(carRentChoice==3)
      {
        renterManagement.printRenterList();
      }
      else
      {
        System.out.println("Invalid choice");
    }
   
  }
    
  }

}
