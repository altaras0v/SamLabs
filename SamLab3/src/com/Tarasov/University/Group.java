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
        boolean f = true;
        while (f!=false) {
            if (student.getNumberOfGroup() == number) {
                students.add(student.getfName() + " " + student.getlName() + " " + student.getNumberOfGroup() + " group");
                f=false;
            } else {
                System.out.println("Этот студент должен быть в другой группе "+student.getfName()+" " + student.getlName());
                f = true;
                break;
            }
        }

    }

    public void setHeadman(Student headman) {
        boolean f = true;
                while (f!=false) {
                if (this.headman == null && headman.getNumberOfGroup() == number) {
                    this.headman = headman;
                    headmans.add(headman.getfName() + " " + headman.getlName() + " " + headman.getNumberOfGroup() + " group");
                    f = false;
                }
                else {
                    System.out.println("Этот студент должен быть в другой группе"+headman.getfName()+" " + headman.getlName());
                    f = true;
                    break;
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


