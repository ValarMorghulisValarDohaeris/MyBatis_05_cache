package com.atguigu.mybatis.beans;

import java.io.Serializable;
import java.util.List;

/**
 * @author lenovo on 2018/1/3.
 * @version 1.0
 */

public class Department implements Serializable{
    private Integer id;

    public Department() {
    }

    public Department(Integer id) {
        this.id = id;
    }

    public Department(Integer id, String departmentName, List<Employee> emps) {

        this.id = id;
        this.departmentName = departmentName;
        this.emps = emps;
    }

    private String departmentName;
    private List<Employee> emps;

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", emps=" + emps +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
