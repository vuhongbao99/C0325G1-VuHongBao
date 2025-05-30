package bai_17_binary_file.view;

import bai_17_binary_file.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị sản phẩm");
        System.out.println("3. Tìm kiếm theo mã sản phẩm");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Product inputProduct() {
        System.out.print("Nhập mã SP: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên SP: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hãng SX: ");
        String manu = scanner.nextLine();
        System.out.print("Nhập mô tả: ");
        String desc = scanner.nextLine();

        return new Product(id, name, price, manu, desc);
    }

    public void displayProducts(List<Product> list) {
        if (list.isEmpty()) {
            System.out.println("Không có sản phẩm nào.");
            return;
        }
        for (Product p : list) {
            System.out.println(p);
        }
    }

    public String inputSearchId() {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        return scanner.nextLine();
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}

