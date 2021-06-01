package com.employee;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "employee")
public class Employee implements Serializable {
    int id;
    String name;
    String dept;
    String salary;

    public Employee(){

    }

    public Employee(int id, String name, String dept, String salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getDept() {
        return dept;
    }

    @XmlElement
    public void setDept(String dept) {
        this.dept = dept;
    }

    @XmlElement
    public String getSalary() {
        return salary;
    }

    @XmlElement
    public void setSalary(String salary) {
        this.salary = salary;
    }
}
