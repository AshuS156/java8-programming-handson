package com.pathfinder.streams.sorting;

import com.pathfinder.beans.Employee;
import com.pathfinder.beans.EmployeeUtils;
import com.pathfinder.beans.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayWithSorting{
    public static void main(String[] args){

        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);
        Person p3 = new Person("Charlie", 35);
        Person p4 = new Person("David", 28);
        Person p5 = new Person("Eve", 22);

        final List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);
        final List<Person> collect = personList.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).limit(1).collect(Collectors.toList());
        System.out.println(collect);
        final Person person = personList.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).findFirst().get();
        System.out.println(person);

        // find the employee with highest salary among new joiners and non-new joiners
        final List<Employee> employeeData = EmployeeUtils.getEmployeeData();

        final Map<String, Optional<Employee>> collect1 = employeeData.stream().collect(Collectors.groupingBy(Employee::getNewJoiner,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        collect1.entrySet().stream().forEach(entry -> {
            System.out.println("is newJoiner: " + entry.getKey() + ", Max Salary: " + entry.getValue().get().getSalary());
        });

        // sort employees by rating  and if ratings are equals then sort by first name
        final List<Employee> collect2 = employeeData.stream().sorted(Comparator.comparing(Employee::getRating).thenComparing(Employee::getFirstName)).collect(Collectors.toList());
        collect2.stream().forEach( emp -> System.out.println(emp.getRating() + " - " + emp.getFirstName()));


    }
}
