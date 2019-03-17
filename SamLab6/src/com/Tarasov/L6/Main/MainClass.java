package com.Tarasov.L6.Main;

import L6Tasks.L6Task1.AllOverParticipantImpl;
import L6Tasks.L6Task1.SwimmingAthleteImpl;
import L6Tasks.L6Task2.MyWeek;
import L6Tasks.L6Task3.MyMathOperator;
import L6Tasks.L6Task4.MyRGB;

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

            }
        }
        task4();
    }
    private static void task1() {
        SwimmingAthleteImpl swimmingAthlete = new SwimmingAthleteImpl();
        System.out.println("Hi!I am swimmer");
        swimmingAthlete.participate();
        System.out.println("----------------------");
        AllOverParticipantImpl allOverParticipant = new AllOverParticipantImpl();
        System.out.println("Hi!I am athlete");
        allOverParticipant.participate();
        System.out.println("--------------------");
    }
    private static void task2() {
        MyWeek.Week wk =MyWeek.Week.THURSDAY;
        System.out.println(MyWeek.Week.getText(wk));
        System.out.println(wk.getAbrev());
        System.out.println(wk.isWeekend());


        MyWeek.Week a =MyWeek.Week.THURSDAY;
        MyWeek.Week b =MyWeek.Week.FRIDAY;
        MyWeek.Week c =MyWeek.Week.SATURDAY;
        MyWeek.Week d =MyWeek.Week.SUNDAY;

        MyWeek.Week[] mw = {a,b,c,d};
            for(MyWeek.Week e : mw) {
                switch (e) {

                    case MONDAY:
                        System.out.println(e.getAbrev());
                        break;
                    case TUESDAY:
                        break;
                    case WEDNESDAY:
                        System.out.println(e.getAbrev());
                        break;
                    case THURSDAY:
                        System.out.println(e.getAbrev());
                        break;
                    case FRIDAY:
                        break;
                    case SATURDAY:
                        System.out.println(e.getAbrev());
                        break;
                    case SUNDAY:
                        break;
                }
            }
    }
    private static void task3() {
        MyMathOperator.MathOperator mathOperator = MyMathOperator.MathOperator.SUM;
        System.out.println(mathOperator.execute(3,5));
    }
    private static void task4() {
        MyRGB.RGB rgb = MyRGB.RGB.BLUE;
        System.out.println(rgb.convertTo());
    }
}
