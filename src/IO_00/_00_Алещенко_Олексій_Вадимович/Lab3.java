package IO_00._00_Алещенко_Олексій_Вадимович;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab3 {
    public static void main(String[] args) {
        String textString = "Hello world!\nAAA";
        System.out.println(textString);
        System.out.println(textString.length());
        System.out.println(textString.lines().filter(s -> s.length() > 3).count());
        String[] textStringLines = textString.split("\n");
        System.out.println(Arrays.toString(textStringLines));
        System.out.println("\"A\".compareTo(\"A\"): " + ("A".compareTo("A")));
        System.out.println("\"A\".compareTo(\"B\"): " + ("A".compareTo("B")));
        System.out.println("\"B\".compareTo(\"A\"): " + ("B".compareTo("A")));

        StringBuilder stringBuilder = new StringBuilder("A");
        stringBuilder.append("B");
        System.out.println("stringBuilder = " + stringBuilder);
        /*String string = new String("Done!");
        String string1 = "Done!" + string;
        System.out.println(string);
        System.out.println(string1);*/

        String s = "A";
        /*System.out.println("s=" + s);
        String s2 = s;
        System.out.println("s2=" + s2);
        System.out.println("(s == s2)=" + (s == s2));
        s += "B";
        System.out.println("s=" + s);
        System.out.println("(s == s2)=" + (s == s2));
        System.out.println("s2=" + s2);*/

        System.out.println("A".equals("A"));
        System.out.println(s.equals(s));
        System.out.println("A" == "A");
        System.out.println(s == s);

        String s2 = new String("A");
        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);
        System.out.println("(s == s2) = " + (s == s2));
        System.out.println("s.equals(s2) = " + s.equals(s2));

        String stringTest1 = "AB";
        /*String stringTest2 = new String("AB");
        System.out.println("stringTest1 == stringTest2: " + (stringTest1 == stringTest2));*/
        String stringTest3 = "AB";
//        stringTest3 += "B";
        System.out.println("stringTest1 == stringTest3: " + (stringTest1 == stringTest3));

        System.out.println(s);

        Integer integer = Integer.valueOf(1);
        Integer integer2 = Integer.valueOf(1);
        System.out.println("integer == integer2: " + (integer == integer2));

        /*int[] array = new int[4];
        ArrayList list = new ArrayList();
        list.add("A");
        list.add(1);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(2);
        integerArrayList.add("A");*/

        System.out.println("Done!");
    }
}
