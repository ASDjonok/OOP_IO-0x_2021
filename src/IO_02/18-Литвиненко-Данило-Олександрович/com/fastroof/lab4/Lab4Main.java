package com.fastroof.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab4Main {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        0219
        C11 = 10 -> Визначити клас студент, який складається як мінімум з 5-и полів.
        */

        String university = "КПІ"; // Igor Sikorsky Kyiv Polytechnic Institute
        String faculty = "ФІОТ"; // Faculty of Informatics and Computer Technologies
        int courseNumber = 1; // only for first course

        ArrayList<Student> students = new ArrayList<>();

        File file = new File("./src/com/fastroof/lab4/rating.txt");
        Scanner scanner = new Scanner(file);

        String[] tmp;
        while (scanner.hasNextLine()) {
            tmp = scanner.nextLine().split(" ");

            // lastname 0, firstname 1, middlename 2, SpecialtyNumber 3, RatingScore 4

            students.add(new Student(tmp[1], tmp[0], tmp[2], university, faculty, Integer.parseInt(tmp[3]),
                    courseNumber, Double.parseDouble(tmp[4])));
        }
        scanner.close();

        for (Student st : students) {
            System.out.println(st.toString());
        }

        System.out.println("\n" + "-------------------------------------------------" + "\n");

        students.sort(Comparator.comparingDouble(Student::getRatingScore));

        for (Student st : students) {
            System.out.println(st.toString());
        }

        System.out.println("\n" + "-------------------------------------------------" + "\n");

        students.sort(Comparator.comparingInt(Student::getSpecialtyNumber).reversed());

        for (Student st : students) {
            System.out.println(st.toString());
        }

    }
}
