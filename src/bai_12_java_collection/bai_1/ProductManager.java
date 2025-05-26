package bai_12_java_collection.bai_1;

import java.util.*;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void editProduct(int id, String newName, double newPrice) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có ID: " + id);
    }

    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void searchByName(String name) {
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    public void sortByPrice(boolean ascending) {
        products.sort((p1, p2) -> {
            if (ascending)
                return Double.compare(p1.getPrice(), p2.getPrice());
            else
                return Double.compare(p2.getPrice(), p1.getPrice());
        });
    }
}

