package vn.edu.likelion.bai2;

public class Product {
    private int productId;
    private String productName;
    private double price;
    static final String storeName = "ABC store";

    public Product() {}
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
