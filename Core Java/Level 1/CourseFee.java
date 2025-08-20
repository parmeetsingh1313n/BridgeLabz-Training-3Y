public class CourseFee {
    public static void main(String[] args) {
        double fee = 125000;
        double dispercent = 10;
        double dis = fee * dispercent / 100;
        double finalFee = fee - dis;
        System.out.println("The discount amount is INR " + dis + " and final discounted fee is INR " + finalFee);
    }
}
