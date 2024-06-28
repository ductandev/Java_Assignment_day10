package vn.edu.likelion.bai1;

public class Bike extends Vehicle {
    // Khai báo thuộc tính
    private boolean hasGear;

    public Bike(String name, int id, boolean hasGear){
        super(id, name);
        this.hasGear = hasGear;
    }

    public boolean isHasGear(){
        return this.hasGear;
    }

    @Override
    public void move(){
        System.out.println("Bike is moving");
    }
}
