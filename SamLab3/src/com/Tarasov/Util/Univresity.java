package com.Tarasov.Util;

import com.Tarasov.University.Department;
import com.Tarasov.University.Group;


/**
 *Util class whichs display information about departmens,groups,headmans and search students by last name
 */
public class Univresity {
    /**
     * Display list of departments
     */
    public static void displayDepartment() {
        System.out.println("Departments of university:");
        for (Object object : Department.getDepartmentList()) {
            System.out.println(object);
        }
    }

    /**
     * Display list of groups
     */
    public static void displayGroups() {
        System.out.println("Groups of university:");
        for (Object object : Group.getGroups()) {
            System.out.println(object);
        }
    }

    /**
     * Display list of students (besides headmans)
     */
    public static void displayStudents() {
        System.out.println("Students of university:");
        for (String string : Group.getUsualStudents()) {
            System.out.println(string);
        }
        for (String string : Group.getHeadmans()) {
            System.out.println(string);
        }
    }

    /**
     * Display list of headmans
     */
    public static void displayHeadmans() {
        System.out.println("Headmans:");
        for (String string : Group.getHeadmans()) {
            System.out.println(string);
        }
    }

    /**
     * Search students with same last name
     * @param lName - last name of student by which will be search
     */
    public static void searchByLastName(String lName) {
        System.out.println("Cтуденты с фамилией " + lName);
        for (String string : Group.getUsualStudents()) {
            if (string.contains(lName)) {
                System.out.println(string);
            }
        }
        for (String string : Group.getHeadmans()) {
            if (string.contains(lName)) {
                System.out.println(string);
            }

        }

    }
}
