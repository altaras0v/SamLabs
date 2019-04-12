package com.Tarasov.L11.tasks;

public class Task1 {
    public static void task1()
    {
        IBooleanOperationable operation = new IBooleanOperationable() {
            @Override
            public boolean checker(int x) {
               if(x % 13 == 0) return true;
               else  return false;
            }
        };
        boolean f = operation.checker(5);
        System.out.println(f);

    }
}
interface IBooleanOperationable{
    boolean checker(int x);
}
