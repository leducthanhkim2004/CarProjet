/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carms;

/**
 *
 * @author tranngocvu942004
 */
// Source code is decompiled from a .class file using FernFlower decompiler.

public class CarMS {
   public CarMS() {
   }

   public static void main(String[] args) {
      LuxuryCar luxuryCar = new LuxuryCar("CAR001", "Mercedes-Benz", "S-Class", 2024, "Black", 500.0, 150000.0, "AMG Package");
      SportCar sportCar = new SportCar("CAR002", "Nissan", "GT-R", 2023, "Gun Metallic", 1200.0, 115000.0, 315.0, 2.9);
      ElectricCar electricCar = new ElectricCar("CAR003", "Vin Fast", "VF e34", 2024, "Black", 300.0, 35000.0, 42.0, 285.0);
      System.out.println(luxuryCar.displayCarDetails());
      System.out.println(sportCar.displayCarDetails());
      System.out.println(electricCar.displayCarDetails());
   }
}
