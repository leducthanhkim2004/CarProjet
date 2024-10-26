// Source code is decompiled from a .class file using FernFlower decompiler.
package carms;

public class LuxuryCar extends Car {
   private String luxuryPackage;

   public LuxuryCar(String carId, String brand, String model, int year, String color, double mileage, double price, String luxuryPackage) {
      super(carId, brand, model, year, color, mileage, price);
      this.luxuryPackage = luxuryPackage;
   }

   public String getLuxuryPackage() {
      return this.luxuryPackage;
   }

   public String displayCarDetails() {
      return String.format("Luxury Car | Car ID: %s | Brand: %s | Model: %s | Year: %d | Color: %s | Mileage: %.1f km | Price: $%.2f | Luxury Package: %s | Availability Status: %s", this.getCarId(), this.getBrand(), this.getModel(), this.getYear(), this.getColor(), this.getMileage(), this.getPrice(), this.getLuxuryPackage(), this.getAvailabilityStatus());
   }
}

