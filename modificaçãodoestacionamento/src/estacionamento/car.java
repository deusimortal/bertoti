   package src.estacionamento;

   public class car {
       
       private String modelName;
       private String plateNumber;
       
       public car(String modelName, String plateNumber) {
           this.modelName = modelName;
           this.plateNumber = plateNumber;
       }
       
       public String getModel() {
           return modelName;
       }
       
       public void setModel(String modelName) {
           this.modelName = modelName;
       }
       
       public String getPlate() {
           return plateNumber;
       }
       
       public void setPlate(String plateNumber) {
           this.plateNumber = plateNumber;
       }
   }
   