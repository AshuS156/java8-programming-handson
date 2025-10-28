package com.pathfinder.beans;

import lombok.*;
import org.apache.commons.lang3.builder.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee{

    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private  String gender;
    private String newJoiner;
    private String learningPending;
    private Double salary;
    private String rating;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.JSON_STYLE);
    }

    public int hashcode() {
        return  5 * this.employeeId.hashCode() + this.email.hashCode();
    }

    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }
        if(obj instanceof Employee) {
            Employee emp = (Employee) obj;
            return this.employeeId.equals(emp.getEmployeeId()) && this.email.equals(emp.getEmail());
        }
        return false;
    }

}
