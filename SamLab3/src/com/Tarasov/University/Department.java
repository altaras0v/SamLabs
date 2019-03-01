package com.Tarasov.University;

import java.util.ArrayList;
import java.util.List;

/**
 * Class which creates department
 */
public class Department {
    private String name;
    private List groups = new ArrayList();
    private static ArrayList departmentList = new ArrayList();

    /**
     * Constructor of department
     * @param name - name of department
     */
    public Department(String name){
        this.name = name;
        departmentList.add(name);
    }

    /**
     * Get list of departments
     * @return list of departments
     */
    public static ArrayList getDepartmentList() {
        return departmentList;
    }
}
