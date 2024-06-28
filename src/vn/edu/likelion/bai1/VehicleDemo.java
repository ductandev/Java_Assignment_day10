package vn.edu.likelion.bai1;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VehicleDemo {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Car và Bike
        Car car = new Car("RoRRoy", 1, 4);
        Bike bike = new Bike("Martin", 2, true);
        Bike bike1 = new Bike("Martin01", 3, true);

        // Khởi tạo một mảng các đối tượng
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(bike);

        for(Vehicle vehicle : vehicles){
            vehicle.move();
        }

        System.out.println(Vehicle.getVehicleCount());
    }
}