package com.Tarasov.University;

import java.util.ArrayList;
import java.util.List;

/**
 * Class which creates group and adds students to their groups
 */
public class Group {

    private int number;
    private Student headman;
    private static List<Integer> groups = new ArrayList();
    private static List<String> headmans = new ArrayList();
    private static List<String> usualStudents = new ArrayList();

    /**
     * Constructor of group
     * @param number - number of group
     */
    public Group(int number){
        this.number = number;
        groups.add(number);
    }

    /**
     * Adds students to their group
     * @param student - object of class Student
     */
    public void addUsualStudents(Student student) {
        boolean f = true;
        while (f!=false) {
            if (student.getNumberOfGroup() == number) {
                usualStudents.add(student.getlName() + " " + student.getfName() + " " + student.getNumberOfGroup() + " group");
                f=false;
            } else {
                System.out.println("Этот студент должен быть в другой группе "+student.getfName()+" " + student.getlName());
                f = true;
                break;
            }
        }
    }
    /**
     * Adds headmans to their group
     * @param headman - object of class Student
     */
    public void addHeadman(Student headman) {
        boolean f = true;
                while (f!=false) {
                if (this.headman == null && headman.getNumberOfGroup() == number) {
                    this.headman = headman;
                    headmans.add(headman.getlName() + " " + headman.getfName() + " " + headman.getNumberOfGroup() + " group");
                    f = false;
                }
                else {
                    System.out.println("Этот студент должен быть в другой группе"+headman.getfName()+" " + headman.getlName());
                    f = true;
                    break;
            }
        }
    }

    /**
     * Get list of group
     * @return list of group
     */
    public static List<Integer> getGroups() {
        return groups;
    }

    /**
     * Get list of headmans
     * @return list of headmans
     */
    public static List<String> getHeadmans(){
        return headmans;
    }

    /**
     * Get list of usual students (all students without headmans)
     * @return list of usual students
     */
    public static List<String> getUsualStudents() {
        return usualStudents;
    }
}


