package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human humen1;
        Human humen2;// Введите 1 если М,введите 2 если Ж
        Scanner s1 = new Scanner(System.in);
        int s = s1.nextInt();
        if (s == 1) {
            Scanner s2 = new Scanner(System.in);
            String name = s2.nextLine();
            String surname = s2.nextLine();
            Float casse = s2.nextFloat();
            Float weight = s2.nextFloat();
            humen1 = new Men(name, surname, casse, weight);
            System.out.println("Введите 2 человека");
        } else {
            Scanner s2 = new Scanner(System.in);
            String name = s2.nextLine();
            String surname = s2.nextLine();
            Float casse = s2.nextFloat();
            Float weight = s2.nextFloat();
            humen1 = new Women(name, surname, casse, weight);
            System.out.println("Введите 2 человека");
        }
        s = s1.nextInt();
        if (s == 1) {
            Scanner s2 = new Scanner(System.in);
            String name = s2.nextLine();
            String surname = s2.nextLine();
            Float casse = s2.nextFloat();
            Float weight = s2.nextFloat();
            humen2 = new Men(name, surname, casse, weight);
            System.out.println("Введите 2 человека");
        } else {
            Scanner s2 = new Scanner(System.in);
            String name = s2.nextLine();
            String surname = s2.nextLine();
            Float casse = s2.nextFloat();
            Float weight = s2.nextFloat();
            humen2 = new Women(name, surname, casse, weight);
            System.out.println("Введите 2 человека");
        }
        System.out.println("\n" + "Таблица данных объектов");
        humen1.speak(humen2);
        if (humen1.speak(humen2) == false)
            System.out.println("MM з \n" + "вероятностью 0.5");
        else if (humen1.sex == humen2.sex && humen1.sex == false)
            System.out.println("ЖЖ всегда true");
        else if (humen1.speak(humen2) == true && humen1.sex == false && humen2.sex == true)
            System.out.println("ЖМ true");
        else if (humen1.speak(humen2) == true && humen1.sex == true && humen2.sex == false)
            System.out.println("МЖ true");

        humen1.terpeti(humen2);
        if (humen1.terpeti(humen2) == false && humen1.sex == true) {
            System.out.println("MM з \n" + "вероятностью 0.056");
        } else if (humen1.terpeti(humen2) == false && humen1.sex == false) {
            System.out.println("ЖЖ з \n" + "вероятностью 0.05");
        } else if (humen1.terpeti(humen2) == true && humen1.sex == true)
            System.out.println("MЖ з \n" + "вероятностью 0.7");
        else if (humen1.terpeti(humen2) == true && humen1.sex == false)
            System.out.println("ЖМ з \n" + "вероятностью 0.7");
        humen1.somethingtime(humen2);
        if (humen1.somethingtime(humen2) == true && 0.9 * humen1.casse >= humen2.casse || humen1.casse <= 0.9 * humen2.casse) {
            System.out.println("true з \n" + "вероятностью 0.85");
        } else if (humen1.somethingtime(humen2) == true && 0.9 * humen1.casse >= 0.9 * humen2.casse && 0.9 * humen1.casse <= humen2.casse || 0.9 * humen2.casse >= 0.9 * humen1.casse || 0.9 * humen2.casse <= humen1.casse) {
            System.out.println(" true з \n" + "вероятностью 0.95");
        }
        if (humen2.somethingtime(humen1) == true && humen2.speak(humen1) == true && humen2.terpeti(humen1) == true && humen2.sex == true) {
            humen1.relative(humen2);
            Scanner s3 = new Scanner(System.in);
            Human human3 = humen1.relative(humen2);
            human3.name = s3.nextLine();
            human3.surname = humen2.surname;
            human3.casse = (float) (humen2.casse + 0.1 * humen2.casse);
            human3.weight = (float) (humen2.weight + 0.1 * humen2.weight);
            human3.sex = true;
            System.out.println(human3.sex + " " + human3.weight + " " + human3.surname + " " + human3.name + " " + human3.casse);
        } else System.out.println("Європа в Україні");
        if (humen1.somethingtime(humen2) == true && humen1.speak(humen2) == true && humen1.terpeti(humen2) == true && humen1.sex == true)
            System.out.println("nu");
    }
}
