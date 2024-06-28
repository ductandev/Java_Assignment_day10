package vn.edu.likelion.bai1;

public class Car extends Vehicle {
    // Khai báo thuộc tính
    private  int numberOfDoors;

    public Car (String name, int id, int numberOfDoors){
        super(id, name);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
