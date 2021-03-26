package com.fastroof.lab3;

import java.util.regex.Pattern;

public class Lab3Main {
    public static void main(String[] args) {
        /*
        0219
        C3 = 0 -> StringBuilder
        C17 = 15 ->  В заданому тексті замінити слова заданої довжини визначеним рядком.

        Створити клас, який складається з виконавчого методу, що виконує дію текстовим рядком (C17), тип якого
        визначено варіантом (C3). Необхідно обробити всі виключні ситуації, що можуть виникнути під час виконання
        програмного коду. Всі змінні повинні бути описані та значення їх задані у виконавчому методі.
        */

        // Текстовий рядок з яким виконують зміни
        StringBuilder oldStr = new StringBuilder("There are many variations of passages of ,Lore Ipsum available, but" +
                " the majority have suffered alteration in (((some)); form, by injected humour, or randomised words " +
                "which don't look even slightly believable.");

        // Довжина слів, які будуть замінені
        int l = 4;

        // Рядок на який заміняють слова заданої довжини
        String newStr = "ᕙ(⇀‸↼‶)ᕗ";

        String sWithoutPunctuation;

        // Вивід oldStr
        System.out.println(oldStr.toString());
        // Вивід результату без зміни змінної oldStr
        for (String s : oldStr.toString().split(" ")) {
            // перевірка на символи слова (слово складається з букв та деяких можливих знаків в середині слова)
            if (s.matches(".*[\\p{L}].*")) {
                // перевірка на знаки пунктуації
                if (s.matches(".*[\\p{Punct}\\p{IsPunctuation}].*")) {
                    // знаки пунктуації не можуть бути в середині слова, тому перевіряємо слово, прибравши знаки з країв
                    sWithoutPunctuation = s
                            .replaceAll(Pattern.compile("^[\\p{Punct}\\p{IsPunctuation}]*").pattern(), "")
                            .replaceAll(Pattern.compile("[\\p{Punct}\\p{IsPunctuation}]*$").pattern(), "");
                    if (sWithoutPunctuation.length() == l) {
                        System.out.print(s.replace(sWithoutPunctuation, newStr) + " ");
                    } else {
                        System.out.print(s + " ");
                    }
                } else {
                    if (s.length() == l) {
                        System.out.print(newStr + " ");
                    } else {
                        System.out.print(s + " ");
                    }
                }
            } else {
                System.out.print(s + " ");
            }
        }
    }
}
