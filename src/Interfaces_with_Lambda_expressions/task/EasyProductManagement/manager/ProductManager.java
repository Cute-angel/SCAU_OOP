package Interfaces_with_Lambda_expressions.task.EasyProductManagement.manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    private ProductInventory inventory;

    public ProductManager() {
        this.inventory = new ProductInventory();
    }


    int displayMenu() {
        System.out.println("1. 查询产品 2. 产品入库 3. 产品出库 4. 产品删除 5. 产品列表 0. 退出");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //scanner.hasNextLine();
            int input = scanner.nextInt();
            if (input >= 0 && input <= 5) {
                return input;
            } else {
                System.out.println("输入有误，请重新输入");
            }
        }
    }

    void findProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入产品ID:");
        String id = scanner.nextLine();
        Product product = inventory.getProduct(id);
        if (product != null) {
            System.out.printf("产品ID:%s, 产品名称:%s, 产品价格:%.2f, 产品数量:%d, 上架时间:%s\n",
                    product.getId(), product.name, product.price, product.quantity, product.launchDate.toString());
        } else {
            System.out.println("产品不存在");
        }
    }

    void entryProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入产品ID");
        String input = scanner.nextLine();

        String fullInput = null;
        if (inventory.getProduct(input) != null) {
            Product p = inventory.getProduct(input);
            System.out.println("请输入数量:");
            int qty = scanner.nextInt();
            p.quantity += qty;
            System.out.println("产品增加数量成功");
            return;
        } else {
            System.out.println("请输入产品名称, 产品价格, 产品数量 (用空格分隔):");
            String details = scanner.nextLine();
            fullInput = input + " " + details;
        }
        String[] parts = fullInput.trim().split("\\s+");
        String id = parts[0];
        String name = parts[1];
        double price = Double.parseDouble(parts[2]);
        int quantity = Integer.parseInt(parts[3]);
        Product product = new Product(id, name, price, quantity);
        inventory.addProduct(product);
        System.out.println("新增产品成功");
    }

    void reduceProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入产品ID:");
        String id = scanner.nextLine();
        Product product = inventory.getProduct(id);
        if (product != null) {
            System.out.println("请输入出库数量:");
            int qty = scanner.nextInt();
            if (qty <= product.quantity) {
                product.quantity -= qty;
                System.out.println("产品出库成功");
            } else {
                System.out.println("库存数量不足");
            }
        } else {
            System.out.println("产品不存在");
        }
    }

    void removeProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入产品ID:");
        String id = scanner.nextLine();
        Product product = inventory.getProduct(id);
        if (product != null) {
            boolean removed = inventory.removeProduct(product);
            if (removed) {
                System.out.println("删除成功");
            } else {
                System.out.println("库存数量不为0，不能删除");
            }
        } else {
            System.out.println("产品不存在");
        }
    }

    void listProduct() {
        inventory.getProducts().sort(Comparator.comparing(Product::getId));
        for (Product p : inventory.getProducts()) {
            System.out.printf("产品ID:%s, 产品名称:%s, 产品价格:%.2f, 产品数量:%d, 上架时间:%s\n",
                    p.getId(), p.name, p.price, p.quantity, p.launchDate.toString());
        }

        class SortByNameAscending implements Comparator<Product> {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.name.compareTo(p2.name);
            }
        }


        System.out.print("1. 按名称升序/2.按价格升序/3.按库存数量降序/0.直接返回，你的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                Collections.sort(inventory.getProducts(), new SortByNameAscending());
            }
            case 2 -> {
                Collections.sort(inventory.getProducts(), new Comparator<Product>() {
                    @Override
                    public int compare(Product p1, Product p2) {
                        return Double.compare(p1.price, p2.price);
                    }
                });
            }
            case 3 -> Collections.sort(inventory.getProducts(), (p1, p2) -> Integer.compare(p2.quantity, p1.quantity));
            case 0 -> {
                return;
            }
            default -> {
                System.out.println("输入有误，直接返回");
                return;
            }

        }
        for (Product p : inventory.getProducts()) {
            System.out.printf("产品ID:%s, 产品名称:%s, 产品价格:%.2f, 产品数量:%d, 上架时间:%s\n",
                    p.getId(), p.name, p.price, p.quantity, p.launchDate.toString());
        }
    }

    public void start() {
        while (true) {
            int choice = displayMenu();
            switch (choice) {
                case 1 -> findProduct();
                case 2 -> entryProduct();
                case 3 -> reduceProduct();
                case 4 -> removeProduct();
                case 5 -> listProduct();
                case 0 -> {
                    System.out.println("退出系统");
                    return;
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }


}



