class Person{
    String name;

    public Person(String name){
        this.name = name;
    }
}

public class B2 {
    public static void main(String[] args){
        // Primitive - biến kiểu nguyên thủy (int)
        int a = 10;
        int b = a; // sao chép GIÁ TRỊ

        b = 20;

        System.out.println("Primitive");
        System.out.println("a = "+a); // 10
        System.out.println("b = "+b); // 20
        // Primitive => sao chép giá trị => độc lập

        // Reference - biến kiểu tham chiếu (object Person)
        Person p1 = new Person("anh quang");
        Person p2 = p1; // sao chép ĐỊA CHỈ

        p2.name = "quang anh";

        System.out.println("Reference");
        System.out.println("person 1 name :" + p1.name); // quang anh
        System.out.println("person 2 name :" + p2.name); // quang anh
        // Reference => sao chép địa chỉ => dùng chung object
    }
}

/*
* Primitive
* Lưu giá trị trực tiếp
* Gán = sao chép giá trị
* Thay đổi không ảnh hưởng biến khác
* */

/*
* Reference
* Lưu địa chỉ object
* Gán = sao chép địa chỉ
* Nhiều biến có thể cùng trỏ 1 object
* */
