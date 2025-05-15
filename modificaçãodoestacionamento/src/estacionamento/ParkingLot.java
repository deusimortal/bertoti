   package src.estacionamento;

   import java.util.ArrayList;
   import java.util.List;

   public class ParkingLot {
       
       private List<car> vehicles = new ArrayList<car>();
       
       public void addVehicle(car vehicle) {
           vehicles.add(vehicle);
       }
       
       public car findVehicleByPlate(String plate) {
           for (car vehicle : vehicles) {
               if (vehicle.getPlate().equals(plate)) {
                   return vehicle;
               }
           }
           return null;
       }
       
       public List<car> findVehiclesByModel(String model) {
           List<car> matchedVehicles = new ArrayList<car>();
           for (car vehicle : vehicles) {
               if (vehicle.getModel().equals(model)) {
                   matchedVehicles.add(vehicle);
               }
           }
           return matchedVehicles;
       }
       
       public List<car> getAllVehicles() {
           return vehicles;
       }
   }
   