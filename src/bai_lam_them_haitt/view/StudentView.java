package bai_lam_them_haitt.view;

import bai_lam_them_haitt.model.Student;

import java.util.List;

public class StudentView {
    public void displayStudentList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}

