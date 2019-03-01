package com.Tarasov.University;

/**
 * Class which creates student
 */
public class Student {
    private String fName;
    private String lName;
    private String phoneNumber;
    private int numberOfGroup;

    /**
     * Constructor of student
     * @param fName - first name of student
     * @param lName - last name of student
     * @param phoneNumber - phone number of student
     * @param numberOfGroup - number of group that student study
     */
    public Student(String fName,String lName,String phoneNumber,int numberOfGroup){
        this.fName = fName;
        this.lName = lName;
        this.numberOfGroup = numberOfGroup;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get number of group that student study
     * @return number of group
     */
    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    /**
     * Get first name of student
     * @return first name
     */
    public String getfName() {
        return fName;
    }
    /**
     * Get last name of student
     * @return last name
     */
    public String getlName() {
        return lName;
    }
}





