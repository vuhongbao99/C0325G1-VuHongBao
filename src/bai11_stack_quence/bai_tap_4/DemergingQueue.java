package bai11_stack_quence.bai_tap_4;

import java.util.*;

// Lớp đại diện cho nhân viên
class NhanVien {
    String hoTen;
    String gioiTinh;
    String ngaySinh;

    // Hàm khởi tạo
    public NhanVien(String hoTen, String gioiTinh, String ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    // In thông tin nhân viên
    @Override
    public String toString() {
        return hoTen + " - " + gioiTinh + " - " + ngaySinh;
    }
}

public class DemergingQueue {

    public static void main(String[] args) {
        // Tạo danh sách nhân viên mẫu
        List<NhanVien> danhSach = Arrays.asList(
                new NhanVien("Nguyen Thi A", "Nu", "2000-01-15"),
                new NhanVien("Le Van B", "Nam", "1999-06-20"),
                new NhanVien("Tran Thi C", "Nu", "2001-03-10"),
                new NhanVien("Pham Van D", "Nam", "2002-12-25"),
                new NhanVien("Nguyen Thi E", "Nu", "1998-11-05")
        );

        // Khởi tạo 2 hàng đợi: một cho Nữ, một cho Nam
        Queue<NhanVien> queueNu = new LinkedList<>();
        Queue<NhanVien> queueNam = new LinkedList<>();

        // Duyệt qua danh sách và phân loại theo giới tính
        for (NhanVien nv : danhSach) {
            if (nv.gioiTinh.equalsIgnoreCase("Nu")) {
                queueNu.add(nv); // Thêm vào hàng đợi nữ
            } else if (nv.gioiTinh.equalsIgnoreCase("Nam")) {
                queueNam.add(nv); // Thêm vào hàng đợi nam
            }
        }

        // In kết quả sau khi sắp xếp: Nữ trước, Nam sau
        System.out.println("=== DANH SÁCH SAU KHI DEMERGE ===");

        System.out.println(">> Danh sách Nữ:");
        while (!queueNu.isEmpty()) {
            System.out.println(queueNu.poll());
        }

        System.out.println("\n>> Danh sách Nam:");
        while (!queueNam.isEmpty()) {
            System.out.println(queueNam.poll());
        }
    }
}

