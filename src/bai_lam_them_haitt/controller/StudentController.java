package bai_lam_them_haitt.controller;

import bai_lam_them_haitt.model.Student;
import bai_lam_them_haitt.view.StudentView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentController {
    private List<Student> studentList = new ArrayList<>();
    private StudentView view = new StudentView();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void sortStudentsByNameThenId() {
        studentList.sort(Comparator
                .comparing(Student::getName)
                .thenComparing(Student::getId));
        view.showMessage("Danh sách sau khi sắp xếp:");
        view.displayStudentList(studentList);
    }

    // Tạm thời dùng để demo
    public void runDemo() {
        addStudent(new Student("S003", "An"));
        addStudent(new Student("S001", "Bình"));
        addStudent(new Student("S002", "An"));
        addStudent(new Student("S004", "Cường"));

        sortStudentsByNameThenId();
    }
}

