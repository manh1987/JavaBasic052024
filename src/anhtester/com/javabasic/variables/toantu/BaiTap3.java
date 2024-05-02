package anhtester.com.javabasic.variables.toantu;

public class BaiTap3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        boolean s;
        System.out.println("Tổng của a và b là: " + (a+b));
        s = (a<b)&&(b<c);
        s = (a<b) || (b>c);
        System.out.println(s);
    }
}
