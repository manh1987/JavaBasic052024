package anhtester.com.javabasic.variables.dieukien;

public class DieuKienIfElse {
    public static void main(String[] args) {
        //Điều kiện if - else
        int age = 30;
        String name = "Auto";
        String mesage = "Add Category Successful";
//        if (age>20){
//            System.out.println("Tuổi lớn hơn 20");
//        }
        if(age>20 && name.equals("Auto") || mesage.contains("success")){
            System.out.println("Tuổi lơn hon 20");
        }

        int number = 13;
        if(number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn");
        } else {
            System.out.println("Số " + number + " là số lẻ");
        }
    }
}
