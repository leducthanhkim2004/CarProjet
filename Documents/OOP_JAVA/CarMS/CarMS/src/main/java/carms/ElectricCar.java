package carms;

public class ElectricCar extends Car {
   private double batteryCapacity;
   private double range;

   public ElectricCar(String carId, String brand, String model, int year, String color, double mileage, double price, double batteryCapacity, double range) {
      super(carId, brand, model, year, color, mileage, price);
      this.batteryCapacity = batteryCapacity;
      this.range = range;
   }
   

   public double getBatteryCapacity() {
      return batteryCapacity;
   }

   public double getRange() {
      return range;
   }

   @Override
   public String displayCarDetails() {
      return String.format("Electric Car | Car ID: %s | Brand: %s | Model: %s | Year: %d | Color: %s | Mileage: %.1f km | Price: $%.2f | Battery Capacity: %.1f kWh | Range: %.1f km | Availability Status: %s",
         getCarId(), getBrand(), getModel(), getYear(), getColor(), getMileage(), getPrice(), getBatteryCapacity(), getRange(), getAvailabilityStatus());
   }
}
