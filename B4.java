class Classroom{
    // Biến instance - tên sinh viên (của riêng)
    private String name;

    // Biến static - quỹ lớp (của chung)
    private static double classFund = 0;

    public Classroom(String name){
        this.name = name;
    }

    public void contribute(double amount){
        classFund += amount;
        System.out.println("Hoc sinh :" + name + " gop : " + amount);
    }

    public static void showClassFund(){
        System.out.println("Quy gop :"+ classFund);
    }
}

public class B4 {
    public static void main(String[] args){
        Classroom c1 = new Classroom("Quang anh");
        Classroom c2 = new Classroom("Anh quang");

        c1.contribute(10000.0);
        c2.contribute(50000.0);

        Classroom.showClassFund();
    }
}
