package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.beans.Employee;

import java.util.List;

/**
 * @author lenovo on 2018/1/3.
 * @version 1.0
 */

public interface EmployeeMapperPlus {

    public Employee getEmpById(Integer id);

    public Employee getEmpAndDept(Integer id);

    public Employee getEmpByIdStep(Integer id);

    public List<Employee> getEmpsByDeptId(Integer id);
}
