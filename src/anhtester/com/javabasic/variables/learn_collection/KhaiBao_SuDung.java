package anhtester.com.javabasic.variables.learn_collection;

import java.util.*;

public class KhaiBao_SuDung {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Selenium");
        arrayList.add("Appium");
        arrayList.add("Playwright");

        for (int i = 0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        Set<String> stringSet = new HashSet<String>();
        stringSet.add("Cypress");
        stringSet.add("akat");
        stringSet.add("Cypress");

        stringSet.

        for (String str : stringSet) {
            System.out.println(str);
        }

        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("company","FPT Software");
        stringMap.put("address","Hà Nội");

        System.out.println(stringMap.get("company"));

    }
}
