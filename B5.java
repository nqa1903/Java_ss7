class Config{
    // Hằng số – dùng chung, không thay đổi
    public static final double MAX_SCORE = 10.0;
    public static final double MIN_SCORE = 0.0;
}

public class B5 {
    public static void main(String[] args){
        double score = 8.0;

        if(score >= Config.MIN_SCORE && score <= Config.MAX_SCORE){
            System.out.println("Diem hop le");
        }else{
            System.out.println("Dien khong hop le");
        }

        // Config.MAX_SCORE = 20.0; // Lỗi xảy ra NGAY KHI BIÊN DỊCH, không cần chạy chương trình
    }
}

/*
* final giúp bảo vệ dữ liệu ngay từ lúc viết code
* Ngăn thay đổi giá trị quan trọng
* Tránh bug do sửa nhầm
* Dễ kiểm soát logic chương trình
* Compiler bắt lỗi sớm
* */