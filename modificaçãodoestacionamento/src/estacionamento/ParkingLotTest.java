   package src.estacionamento;

   import static org.junit.jupiter.api.Assertions.assertEquals;
   import static org.junit.jupiter.api.Assertions.*;
   import org.junit.jupiter.api.Test;

   class ParkingLotTest {

       @Test
       void testParkingLotFunctionality() {
           ParkingLot parkingLot = new ParkingLot();
           parkingLot.addVehicle(new car("Civic", "XYZ9876"));
           parkingLot.addVehicle(new car("Fusca", "XYZ1234"));
           
           assertEquals(parkingLot.getAllVehicles().size(), 2);
           
           car foundCar = parkingLot.findVehicleByPlate("XYZ9876");
           
           assertEquals(foundCar.getModel(), "Civic");
       }
   }
   