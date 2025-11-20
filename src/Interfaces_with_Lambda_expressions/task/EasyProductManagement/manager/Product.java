package Interfaces_with_Lambda_expressions.task.EasyProductManagement.manager;

import java.time.LocalDate;

public class Product implements Comparable<Product>, Cloneable {
    public String name;
    public double price;
    public int quantity;
    private String id;
    public LocalDate launchDate;

    public String getId() {
        return id;
    }


    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.launchDate = LocalDate.now();
    }

    public Product() {
        this.id = "";
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
        this.launchDate = LocalDate.now();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return id.equals(product.id);
    }


    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public int compareTo(Product o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public Product clone() {
        //deep copy
        return new Product(this.id, this.name, this.price, this.quantity);
    }


}
