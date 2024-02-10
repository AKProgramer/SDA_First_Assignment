import java.util.ArrayList;
import java.util.List;

public class RenterManagement{
   private List<Renter> renterList;
   RenterManagement(){
       renterList = new ArrayList<Renter>();
   }
   public void addARenter(Renter renter)
   {
       renterList.add(renter);
   }
   public Renter getARenter(int id)
   {

       for (Renter renter : renterList) {
           if(renter.getId()==id)
           {
               return renter;
           }
       }
       return null;
   }
   public void printRenterList()
   {
       for (Renter renter : renterList) {
           renter.display();
       }
   }
}
