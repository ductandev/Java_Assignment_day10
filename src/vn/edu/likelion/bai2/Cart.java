package vn.edu.likelion.bai2;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products = new ArrayList<>();


    public void addTocart(Product product){
        products.add(product);
    }

    public double totalPrice(){
        double totalPrice = 0;
        for(Product productCurrent: products){
            totalPrice += productCurrent.getPrice();
        }

        return totalPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
