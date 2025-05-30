package bai_17_binary_file.controller;

import bai_17_binary_file.model.Product;
import bai_17_binary_file.view.ProductView;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> productList = new ArrayList<>();
    private final String FILE_PATH = "products.dat";
    private ProductView view = new ProductView();

    public void run() {
        productList = readFromFile();

        while (true) {
            int choice = view.showMenu();
            switch (choice) {
                case 1:
                    Product newProduct = view.inputProduct();
                    productList.add(newProduct);
                    writeToFile(productList);
                    break;
                case 2:
                    view.displayProducts(productList);
                    break;
                case 3:
                    String searchId = view.inputSearchId();
                    boolean found = false;
                    for (Product p : productList) {
                        if (p.getId().equalsIgnoreCase(searchId)) {
                            System.out.println(p);
                            found = true;
                        }
                    }
                    if (!found) view.showMessage("Không tìm thấy sản phẩm.");
                    break;
                case 0:
                    view.showMessage("Thoát chương trình.");
                    return;
                default:
                    view.showMessage("Chọn sai. Nhập lại.");
            }
        }
    }

    private void writeToFile(List<Product> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(list);
            view.showMessage("Đã lưu vào file.");
        } catch (IOException e) {
            view.showMessage("Lỗi ghi file: " + e.getMessage());
        }
    }

    private List<Product> readFromFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            view.showMessage("Không thể đọc file. Tạo danh sách mới.");
            return new ArrayList<>();
        }
    }
}

