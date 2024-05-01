package anhtester.com.javabasic.variables;

import java.util.function.DoubleToIntFunction;

public class LearnVariables {
    static int age = 26; //Bien toan cuc
    static  int number = 20;

    public static void sayHello() {
        int n = 10; //Bien local
        System.out.println("Gia tri cua n la: " + n);
    }
    public static void main(String[] args) {
        String FullName = "Anh Tester";
        System.out.println("Hello world");
        System.out.println();
        LearnVariables abc = new LearnVariables();
        abc.sayHello();
        sayHello();
    }
}
