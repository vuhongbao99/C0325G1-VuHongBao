package bai_12_java_collection.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xóa sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Sắp xếp theo giá (Tăng)");
            System.out.println("7. Sắp xếp theo giá (Giảm)");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Giá: ");
                    double price = Double.parseDouble(sc.nextLine());
                    manager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("Nhập ID cần sửa: ");
                    int editId = Integer.parseInt(sc.nextLine());
                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Giá mới: ");
                    double newPrice = Double.parseDouble(sc.nextLine());
                    manager.editProduct(editId, newName, newPrice);
                    break;
                case 3:
                    System.out.print("Nhập ID cần xóa: ");
                    int delId = Integer.parseInt(sc.nextLine());
                    manager.deleteProduct(delId);
                    break;
                case 4:
                    manager.displayProducts();
                    break;
                case 5:
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();
                    manager.searchByName(keyword);
                    break;
                case 6:
                    manager.sortByPrice(true);
                    manager.displayProducts();
                    break;
                case 7:
                    manager.sortByPrice(false);
                    manager.displayProducts();
                    break;
            }

        } while (choice != 0);

        System.out.println("Đã thoát chương trình.");
    }
}

