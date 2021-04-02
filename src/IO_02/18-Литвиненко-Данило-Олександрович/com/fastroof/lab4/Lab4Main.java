package com.fastroof.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab4Main {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        0219
        C11 = 10 -> Визначити клас студент, який складається як мінімум з 5-и полів.

        Створити клас із виконавчим методом, в якому створити масив з об’єктів класу визначеному варіантом (C11).
        Відсортувати масив, за одним з полів, за зростанням, а за іншим, за спаданням використавши при цьому
        стандартні засоби сортування. Всі змінні повинні бути описані та значення їх задані у виконавчому методі. Код
        повинен відповідати стандартам JCC та бути детально задокументований.
        */

        File file = new File("./src/com/fastroof/lab4/rating.txt");
        Scanner scanner = new Scanner(file);

        String university = "КПІ"; // Igor Sikorsky Kyiv Polytechnic Institute
        String faculty = "ФІОТ"; // Faculty of Informatics and Computer Technologies
        int courseNumber = 1; // only for first course

        ArrayList<Student> students = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String lastName = line.substring(0, line.indexOf(" "));
            line = line.substring(line.indexOf(" ")+1);

            String firstName = line.substring(0, line.indexOf(" "));
            line = line.substring(line.indexOf(" ")+1);

            String middleName = line.substring(0, line.indexOf(" "));
            line = line.substring(line.indexOf(" ")+1);

            int specialtyNumber = Integer.parseInt(line.substring(0, line.indexOf(" ")));
            line = line.substring(line.indexOf(" ")+1);

            double ratingScore = Double.parseDouble(line);

            students.add(new Student(firstName, lastName, middleName, university, faculty, specialtyNumber,
                    courseNumber, ratingScore));
        }
        scanner.close();

        for (Student st: students) {
            System.out.println(st.toString());
        }

        System.out.println("\n" + "-------------------------------------------------" + "\n");

        students.sort(Comparator.comparingDouble(Student::getRatingScore));

        for (Student st: students) {
            System.out.println(st.toString());
        }

        System.out.println("\n" + "-------------------------------------------------" + "\n");

        students.sort(Comparator.comparingInt(Student::getSpecialtyNumber).reversed());

        for (Student st: students) {
            System.out.println(st.toString());
        }

    }
}
