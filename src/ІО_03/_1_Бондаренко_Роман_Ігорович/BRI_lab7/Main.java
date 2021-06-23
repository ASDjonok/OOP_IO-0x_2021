package BRI_lab7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myArrayList = new CustomArrayList<>();

        myArrayList.add("0");
        myArrayList.add("1");
        myArrayList.add("2");

        for (String s : myArrayList) {
            System.out.println(s);
        }

        System.out.println();

        myArrayList.remove("1");

        for (String s : myArrayList) {
            System.out.println(s);
        }
    }
}
