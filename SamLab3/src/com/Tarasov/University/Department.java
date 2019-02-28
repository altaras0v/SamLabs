package com.Tarasov.University;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List groups = new ArrayList();
    private static ArrayList departmentList = new ArrayList();

    public Department(String name){
        this.name = name;
        departmentList.add(name);
    }

    public void setGroups(Group group) {
        groups.add(group);
    }

    public static ArrayList getDepartmentList() {
        return departmentList;
    }
}
