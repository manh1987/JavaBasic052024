package anhtester.com.javabasic.variables.mang;

public class MangMotChieu {
    public static void main(String[] args) {
        //Khai báo mảng
        int songuyen[] = new int[3];

        //Thêm giá trị vào mảng
        songuyen[0] = 5;
        songuyen[1] = 8;
        songuyen[2] = 10;

        //in giá trị trong mảng theo thủ công từng vị tri
        System.out.println(songuyen[0]);
        System.out.println("Độ dài mảng " + songuyen.length);

        //Duyệt phần tử mảng với vòng lặp for
        //Nhớ dừng lại với giá trị bé hơn độ dài của mảng đó. Vì nó bắt đầu từ 0
        for (int i=0;i < songuyen.length;i++) {
            System.out.println(songuyen[i]);
        }

        //Thêm giá trị vào mảng bằng vòng lặp for
        for (int i=0;i < songuyen.length;i++) {
            if(i % 2 == 0){songuyen[i] = 10;}

        }
    }

}
