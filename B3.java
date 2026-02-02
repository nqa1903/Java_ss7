class ScoreUtils{
    public static boolean isPass(double score){
        return score >= 5.0;
    }

    public static double caculateAverage(double s1 , double s2 , double s3){
        return (s1 + s2 + s3) / 3;
    }
}

public class B3 {
    public static void main(String[] args){
        double avg = ScoreUtils.caculateAverage(6.8 , 7.2 , 7.6);
        System.out.println("Diem trung binh :" + avg);

        boolean pass = ScoreUtils.isPass(avg);
        System.out.println("Qua mon :" +pass);
    }
}
