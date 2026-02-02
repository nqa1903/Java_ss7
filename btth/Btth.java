package btth;

public class Btth {
    public static void main(String[] args) {

        Student s1 = new Student("SV001", "anh");
        Student s2 = new Student("SV002", "anh quang");
        Student s3 = new Student("SV003", "quang anh");

        // gọi method của đối tượng
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        System.out.println("----------------");

        // gọi method static (qua class)
        Student.showTotalStudent();

        // lỗi biên dịch nếu
        // s1.id = "SV100";
        // Student.SCHOOL_NAME = "XYZ";
    }
}
