package vn.edu.likelion.bai2;

import java.util.ArrayList;

public class ShoppingApp {
    public static void main(String[] args) {

        Product product = new Product(1, "Áo nam", 1000);
        Product product1 = new Product(2, "Áo nam", 2000);
        Product product2 = new Product(3, "Giày nam", 3000);

        Cart cart = new Cart();
        cart.addTocart(product);
        cart.addTocart(product1);
        cart.addTocart(product2);

        System.out.println("========================================================");
        System.out.println("|                    GIỎ HÀNG                          |");
        System.out.println("| Stt | Tên sản phẩm |    Giá       |  Tên cửa hàng    |");
        for(Product p : cart.getProducts()){
            System.out.printf("| %-3d | %-12s | %-12f | %-16s |\n", p.getProductId(), p.getProductName(), p.getPrice(), Product.storeName);
        }
        System.out.println("========================================================");

        System.out.println("Tổng tiền giỏ hàng: " + cart.totalPrice());

    }
}
