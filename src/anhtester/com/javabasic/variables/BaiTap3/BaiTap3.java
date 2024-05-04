package anhtester.com.javabasic.variables.BaiTap3;

public class BaiTap3 {
    public static int number = 100;
    public static int DieuKien(int n){
        if (n== number){
            System.out.println("So ban nhập = "+ number);
        } else if (n < number) {
            System.out.println("Số bạn nhập bé hơn " + number);
        }else {
            System.out.println("Số bạn nhập lơn hơn " + number);
        }
        return n;
    }

    public static void main(String[] args) {
        BaiTap3.DieuKien(99);
    }
}
