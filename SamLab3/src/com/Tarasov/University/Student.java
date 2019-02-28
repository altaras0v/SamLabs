package com.Tarasov.University;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String fName;
    private String lName;
    private String phoneNumber;
    private int numberOfGroup;
    private static List <String> students = new ArrayList();

    public Student(String fName,String lName,String phoneNumber,int numberOfGroup){
        this.fName = fName;
        this.lName = lName;
        this.numberOfGroup = numberOfGroup;
        this.phoneNumber = phoneNumber;
        students.add(lName + " " + fName + " " + numberOfGroup + " group");

    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public static List <String> getStudents() {
        return students;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}





