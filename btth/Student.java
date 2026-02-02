package btth;

public class Student {

    // static final (hằng số dùng chung)
    public static final String SCHOOL_NAME = "PTIT";

    // static variable
    private static int studentCount = 0;

    // instance variables (riêng từng sinh viên)
    private final String id;   // không thay đổi
    private String name;

    // constructor
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        studentCount++; // mỗi lần tạo SV thì tăng
    }

    // instance method
    public void displayInfo() {
        System.out.println( "ID: " + id + ", Name: " + name + ", School: " + SCHOOL_NAME);
    }

    // static method
    public static void showTotalStudent() {
        System.out.println("Tổng số sinh viên: " + studentCount);
    }
}

