package com.Tarasov.L11.tasks;

public class Task3 {
    public static void task3(){
        IDOperationable op = new IDOperationable() {
            @Override
            public double checker(double a, double b, double c) {
                return b*b - 4*a*c;
            }
        };

    double k = op.checker(1,2,3);
        System.out.println(k);
    }
}

interface IDOperationable{
    double checker(double a,double b,double c);
}