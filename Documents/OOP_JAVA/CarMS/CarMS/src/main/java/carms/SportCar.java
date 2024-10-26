// Source code is decompiled from a .class file using FernFlower decompiler.
package carms;

public class SportCar extends Car {
   private double topSpeed;
   private double acceleration;

   public SportCar(String carId, String brand, String model, int year, String color, double mileage, double price, double topSpeed, double acceleration) {
      super(carId, brand, model, year, color, mileage, price);
      this.topSpeed = topSpeed;
      this.acceleration = acceleration;
   }

   public double getTopSpeed() {
      return this.topSpeed;
   }

   public double getAcceleration() {
      return this.acceleration;
   }

   public String displayCarDetails() {
      return String.format("Sport Car | Car ID: %s | Brand: %s | Model: %s | Year: %d | Color: %s | Mileage: %.1f km | Price: $%.2f | Top Speed: %.1f km/h | Acceleration (0-100 km/h): %.1f seconds | Availability Status: %s", this.getCarId(), this.getBrand(), this.getModel(), this.getYear(), this.getColor(), this.getMileage(), this.getPrice(), this.getTopSpeed(), this.getAcceleration(), this.getAvailabilityStatus());
   }
}

