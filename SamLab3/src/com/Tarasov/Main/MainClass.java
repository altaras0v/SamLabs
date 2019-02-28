package com.Tarasov.Main;

import com.Tarasov.University.Department;
import com.Tarasov.University.Group;
import com.Tarasov.University.Student;
import com.Tarasov.Util.Checker;
import com.Tarasov.Util.DescriptionBelarus;
import com.Tarasov.Util.Univresity;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Parameter: " + arg);
        }
        if (args.length > 0) {
            switch (args[0]) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
            }
        }
        task3();
    }
    private static void task3() {
        Student a = new Student("A","A","1111111",1);
        Student b = new Student("B","B","2222222",2);
        Student c = new Student("C","C","3333333",3);
        Student d = new Student("D","D","4444444",4);
        Student e = new Student("E","E","5555555",5);

        Group first = new Group(1);
        Group second = new Group(2);
        Group third = new Group(3);
        Group fourth = new Group(4);
        Group fifth = new Group(5);

        first.setHeadman(a);second.setHeadman(b);third.setHeadman(c);fourth.setHeadman(d);fifth.setHeadman(e);

        Student f = new Student("F","F","0112321",1);
        Student g = new Student("G","G","3232323",1);
        Student h = new Student("H","H","3230099",2);
        Student i = new Student("I","I","8737272",2);
        Student j = new Student("J","J","1221390",3);
        Student k = new Student("K","K","1763452",3);
        Student l = new Student("L","L","2906863",4);
        Student x = new Student("X","X","8908902",4);
        Student y = new Student("Y","Y","4123456",5);
        Student z = new Student("Z","Z","5678910",5);
        Student test = new Student("eq","F","1",1);

        first.setStudents(f);first.setStudents(g);second.setStudents(h);second.setStudents(i);third.setStudents(j);
        third.setStudents(k);fourth.setStudents(l);fourth.setStudents(x);fifth.setStudents(y);fifth.setStudents(z);

        Department firstDepartment = new Department("FirstDepartment");
        Department secondDepartment = new Department("SecondDepartment");

        firstDepartment.setGroups(first);firstDepartment.setGroups(second);firstDepartment.setGroups(third);
        secondDepartment.setGroups(fourth);secondDepartment.setGroups(fifth);

        Univresity.displayDepartment();
        Univresity.displayGroups();
        Univresity.displayStudents();
        Univresity.displayHeadmans();
        Univresity.searchByLastName("F");

    }

    private static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номинал:");
        int value = in.nextInt();
        System.out.println(Checker.Money.formatMoney(value));
        System.out.println("Введите год:");
        int year = in.nextInt();
        System.out.println(Checker.Year.checkLeapYear(year));
        int[][] mas = new int[3][3];
        System.out.println(Arrays.deepToString(mas));
        System.out.println(Arrays.toString(Checker.Array.linearizeArray(mas)));
    }

    private static void task1() {
        String s = DescriptionBelarus.DISTRICTS.BREST;
        System.out.println(s);
        System.out.println(DescriptionBelarus.fullInfo());
    }
}