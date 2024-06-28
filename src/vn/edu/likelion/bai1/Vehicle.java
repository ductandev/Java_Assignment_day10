package vn.edu.likelion.bai1;

public abstract class Vehicle {
    private String name;
    private final int id;
    static int vehicleCount;

    // Khởi tạo Constructor
    public Vehicle(int id, String name) {
        this.name = name;
        this.id = id;
        vehicleCount++;
    }

    // ================================================
    //          KHỞI TẠO HÀM GETTER VÀ SETTER
    // ================================================
    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    static public int getVehicleCount(){
        return vehicleCount;
    }
}
