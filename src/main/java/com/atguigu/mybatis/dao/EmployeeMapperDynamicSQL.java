package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.beans.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lenovo on 2018/1/3.
 * @version 1.0
 */

public interface EmployeeMapperDynamicSQL {

    public List<Employee> getEmpsTestInnerParameter(Employee employee);

    //携带了哪个字段查询条件就带上这个字段的值
    public List<Employee> getEmpsByconditionIf(Employee employee);

    public List<Employee> getEmpsByconditionTrim(Employee employee);

    public List<Employee> getEmpsByConditionChoose(Employee employee);

    public void updateEmp(Employee employee);

    public List<Employee> getEmpsByConditionForeach(List<Integer> list);

    public void addEmps(@Param("emps") List<Employee> emps);
}
