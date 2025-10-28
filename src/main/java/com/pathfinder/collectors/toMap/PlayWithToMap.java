package com.pathfinder.collectors.toMap;

import com.pathfinder.beans.Employee;
import com.pathfinder.beans.EmployeeUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayWithToMap{
    public static void main(String[] args){

        final List<Employee> employeeData = EmployeeUtils.getEmployeeData();
        // convert List<Employee> to Map<employeeId, Employee>
        final Map<String, Employee> collect = employeeData.stream().collect(Collectors.toMap(
                emp -> emp.getEmployeeId(), emp -> emp));
        System.out.println(collect);
    }
}
