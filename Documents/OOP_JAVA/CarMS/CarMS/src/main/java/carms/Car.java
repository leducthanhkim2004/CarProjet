package carms;

public abstract class Car {
   private String carId;
   private String brand;
   private String model;
   private int year;
   private String color;
   private double mileage;
   private double price;
   private String availabilityStatus;

   public Car(String carId, String brand, String model, int year, String color, double mileage, double price) {
      this.carId = carId;
      this.brand = brand;
      this.model = model;
      this.year = year;
      this.color = color;
      this.mileage = mileage;
      this.price = price;
      this.availabilityStatus = "Available"; // Default status
   }

   public String getCarId() { return carId; }
   public String getBrand() { return brand; }
   public String getModel() { return model; }
   public int getYear() { return year; }
   public String getColor() { return color; }
   public double getMileage() { return mileage; }
   public double getPrice() { return price; }
   public String getAvailabilityStatus() { return availabilityStatus; }

   public void updateCarStatus(String status) {
      this.availabilityStatus = status;
   }

   public abstract String displayCarDetails();
}
