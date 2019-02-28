package com.Tarasov.Util;

import com.Tarasov.University.Department;
import com.Tarasov.University.Group;
import com.Tarasov.University.Student;

public class Univresity {

    public static void displayDepartment(){
        System.out.println("Departments of university:");
        for(Object object : Department.getDepartmentList()){
            System.out.println(object);
        }
    }
    public static void displayGroups(){
        System.out.println("Groups of university:");
        for(Object object : Group.getGroups()){
            System.out.println(object);
        }
    }
    public static void displayStudents(){
        System.out.println("Students of university:");
        for(Object object : Student.getStudents()){
            System.out.println(object);
            }
        }
    public static void displayHeadmans(){
        System.out.println("Headmans:");
        for(Object object : Group.getHeadmans()){
            System.out.println(object);
        }
    }
    public static void searchByLastName(String lName){
        System.out.println("Cтуденты с фамилией " + lName );
        for (String string : Student.getStudents()){
            if(string.contains(lName)){
                System.out.println(string);
            }
        }

    }
}
