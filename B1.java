class Student{
    // Biến instance – mỗi sinh viên có giá trị riêng
    private String id;
    private String name;

    // Biến static – dùng chung cho tất cả sinh viên
    private static int totalStudent = 0;

    // Constructor
    public Student(String id , String name){
        this.id = id;
        this.name = name;
        totalStudent++;
    }

    public void displayInfo(){
        System.out.println("ID :" + id);
        System.out.println("Ho ten sinh vien :"+name);
        System.out.println("-------------------");
    }

    public static void displayTotalStudent(){
        System.out.println("Tong sinh vien : "+ totalStudent);
    }
}

public class B1 {
    public static void main(String[] args){
        Student s1 = new Student("SV1" , "ngo quang anh");
        Student s2 = new Student("SV2" , "anh quang");
        Student s3 = new Student("SV3" , "anh quang");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        // Gọi biến static qua tên lớp
        Student.displayTotalStudent();
    }
}
