package IO_00._00_Алещенко_Олексій_Вадимович;

public class Lab3 {
    public static void main(String[] args) {
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

        System.out.println(s);

        System.out.println("Done!");
    }
}
