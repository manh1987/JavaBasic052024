package anhtester.com.javabasic.variables.learn_collection;

import java.util.ArrayList;
import java.util.Objects;

public class LearnArrayList {
    public static void main(String[] args) {
        //Khai báo Arraylisst
        ArrayList<String> arrayList = new ArrayList<String>();


        //Thêm phần tử Arraylist
        arrayList.add("Selenium");
        arrayList.add("TestNG Framwork");
        arrayList.add("Selenium");
        arrayList.add(1, "Extent Reprt"); //Thêm vào vị trí chỉ định

        arrayList.add("");
        arrayList.add("");
        arrayList.trimToSize();

        //Remove phần tử trong
        arrayList.remove("Selenium");

        //Duyệt arraylist
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Playwright");
        arrayList2.add("Cypress");
        System.out.println("=================");
        //add all Arraylist2 vào arraylist1
        arrayList.addAll(arrayList2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //Tìm kiếm phần tử trong arraylist
        System.out.println("Tìm kiếm  phàn tử " + arrayList.contains("Selenium"));


        Objects[] mang = arrayList.toArray();
        for (i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }
       
    }
}
