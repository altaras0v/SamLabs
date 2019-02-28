package com.Tarasov.University;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private int number;
    private Student headman;
    private static List<Integer> groups = new ArrayList();
    private static ArrayList headmans = new ArrayList();
    private static ArrayList students = new ArrayList();


    public Group(int number){
        this.number = number;
        groups.add(number);
    }

    public void setStudents(Student student) {
            for (Integer i : groups){
                if(student.getNumberOfGroup()==i){
                    students.add(student);
                }
            }

    }

    public void setHeadman(Student headman) {
        for (Integer i : groups) {
            if (this.headman == null && headman.getNumberOfGroup() == i) {
                this.headman = headman;
                headmans.add(headman.getfName() + " " + headman.getlName() + " " + headman.getNumberOfGroup() + " group");
            }
        }
    }

    public static List<Integer> getGroups() {
        return groups;
    }

    public static ArrayList getHeadmans(){
        return headmans;
    }

}


