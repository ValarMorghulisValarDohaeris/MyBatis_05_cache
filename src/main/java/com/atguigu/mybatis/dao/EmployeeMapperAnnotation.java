package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.beans.Employee;
import org.apache.ibatis.annotations.Select;

/**
 * @author lenovo on 2018/1/2.
 * @version 1.0
 */

public interface EmployeeMapperAnnotation {
    @Select("select * from tbl_employee where id = #{id}")
    public Employee getEmpById(Integer id);
}
