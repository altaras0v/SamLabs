package com.Tarasov.Main;

import com.Tarasov.Library.Book;
import com.Tarasov.Library.Library;
import com.Tarasov.Time.Time;
import com.Tarasov.University.Department;
import com.Tarasov.University.Group;
import com.Tarasov.University.Student;
import com.Tarasov.Util.Checker;
import com.Tarasov.Util.DescriptionBelarus;
import com.Tarasov.Util.Univresity;

import java.util.Arrays;
import java.util.Date;
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
                case "4":
                    task4();
                    break;
                case "5":
                    task5();
                    break;
            }
        }
        task5();
    }
    private static void task5() {
        Time time1 = new Time(600);
        Time time2 = new Time(250,43,12);
        System.out.println(time1.convertToSeconds());
        time1.showTime();
        time2.showTime();
    }
    private static void task4() {
        Book[] books = new Book[3];
        books[0]= new Book("Chuck Palanik","Fight Club",new Date(1998,1,3));
        books[1]= new Book("Chuck Palanik","1",new Date(2005,1,3));
        books[2]= new Book("Steaven King","2",new Date(2007,1,3));
        Library library = new Library("A","Address",books);
        library.showAuthors();
        library.showBooks();
        library.searchByDate(new Date(1999,1,1),new Date(2006,2,3));
    }

    private static void task3() {
        // Create headmans
        Student a = new Student("A","A","1111111",1);
        Student b = new Student("B","B","2222222",2);
        Student c = new Student("C","C","3333333",3);
        Student d = new Student("D","D","4444444",4);
        Student e = new Student("E","E","5555555",5);

        //Create groups
        Group first = new Group(1);
        Group second = new Group(2);
        Group third = new Group(3);
        Group fourth = new Group(4);
        Group fifth = new Group(5);

        //Set headmans to group
        first.addHeadman(a);second.addHeadman(b);third.addHeadman(c);fourth.addHeadman(d);fifth.addHeadman(e);

        // Create students
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
        Student test = new Student("eq","F","1",5);

        //Add students to group
        first.addUsualStudents(f);first.addUsualStudents(g);second.addUsualStudents(h);second.addUsualStudents(i);third.addUsualStudents(j);
        third.addUsualStudents(k);fourth.addUsualStudents(l);fourth.addUsualStudents(x);fifth.addUsualStudents(y);fifth.addUsualStudents(z);
        fifth.addUsualStudents(test);

        //Create departments
        Department firstDepartment = new Department("FirstDepartment");
        Department secondDepartment = new Department("SecondDepartment");


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
        if (Checker.Year.checkLeapYear(year)==true){
            System.out.println("Вы ввели високосный год");
        }
        else System.out.println("Вы ввели невисокосный год");
        int[][] mas = new int[3][3];
        System.out.println("Исходный массив:");
        System.out.println(Arrays.deepToString(mas));
        System.out.println("Преобразованный массив:");
        System.out.println(Arrays.toString(Checker.Array.linearizeArray(mas)));
    }

    private static void task1() {
        String s = DescriptionBelarus.DISTRICTS.BREST;
        System.out.println(s);
        System.out.println(DescriptionBelarus.fullInfo());
    }
}