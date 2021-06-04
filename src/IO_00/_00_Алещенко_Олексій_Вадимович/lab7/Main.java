package IO_00._00_Алещенко_Олексій_Вадимович.lab7;

import IO_00._00_Алещенко_Олексій_Вадимович.lab6.Cornflower;
import IO_00._00_Алещенко_Олексій_Вадимович.lab6.Flower;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final ArrayList<Cornflower> collection = new ArrayList<>();
        MyFlowerArrayList myFlowerArrayList = new MyFlowerArrayList(collection);
        MyFlowerArrayList myFlowerArrayList2 = new MyFlowerArrayList(new Cornflower(1, 1));
        MyFlowerLinkedSet myFlowerLinkedSet = new MyFlowerLinkedSet();
//        myFlowerSet.add(1);
        System.out.println(myFlowerLinkedSet.size());
        myFlowerLinkedSet.add(new Cornflower(1, 1));
        myFlowerLinkedSet.add(new Cornflower(2, 2));
        myFlowerLinkedSet.add(new Cornflower(3, 3));
        myFlowerLinkedSet.add(new Cornflower(3, 3));
//        myFlowerSet.add("");
        System.out.println(myFlowerLinkedSet.size());
//        System.out.println(myFlowerSet);

       /* MyFlowerCollection flowers = new MyFlowerCollection();
        MyGenericCollection<Flower> flowers1 = new MyGenericCollection<>();
//        flowers1.add(new Flower());
//        flowers1.add(new String("123"));
//        flowers.add(new Flower());
//        flowers.add(new String("123"));

        MyGenericCollection<String> strings = new MyGenericCollection<>();
        strings.add(new String("123"));
//        strings.add(new Flower());*/

    }
}
