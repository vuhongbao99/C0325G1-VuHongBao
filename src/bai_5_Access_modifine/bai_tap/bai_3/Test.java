package bai_5_Access_modifine.bai_tap.bai_3;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Before: " + student.getInfo());

        student.setName("Bao");
        student.setClasses("C03");

        System.out.println("After: " + student.getInfo());
    }
}

