package IO_00._00_Алещенко_Олексій_Вадимович.lab7;

import IO_00._00_Алещенко_Олексій_Вадимович.lab6.Flower;

public class Main {
    public static void main(String[] args) {
        MyFlowerCollection flowers = new MyFlowerCollection();
        MyGenericCollection<Flower> flowers1 = new MyGenericCollection<>();
        flowers1.add(new Flower());
//        flowers1.add(new String("123"));
        flowers.add(new Flower());
//        flowers.add(new String("123"));

        MyGenericCollection<String> strings = new MyGenericCollection<>();
        strings.add(new String("123"));
//        strings.add(new Flower());

    }
}
