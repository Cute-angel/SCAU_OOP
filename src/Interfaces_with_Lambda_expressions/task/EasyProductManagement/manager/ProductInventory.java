package Interfaces_with_Lambda_expressions.task.EasyProductManagement.manager;

import java.util.ArrayList;

public class ProductInventory {
    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ProductInventory() {
    }

    Product getProduct(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    boolean removeProduct(Product product) {
        if (product.quantity == 0) {
            if (products.remove(product)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    int getTotalQuantity() {
        int total = 0;
        for (Product p : products) {
            total += p.quantity;
        }
        return total;
    }

    double getTotalAmount() {
        double total = 0.0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }


}
