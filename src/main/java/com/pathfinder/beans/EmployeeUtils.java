package com.pathfinder.beans;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public interface EmployeeUtils{

    public static List<Employee> getEmployeeData(){
        List<Employee> employees = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            employees = mapper.readValue(new File("employees.json"),new TypeReference<List<Employee>>(){
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}
