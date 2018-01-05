package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.beans.Department;

/**
 * @author lenovo on 2018/1/3.
 * @version 1.0
 */

public interface DepartmentMapper {
    public Department getDeptById(Integer id);

    public Department getDeptByIdPlus(Integer id);

    public Department getDeptByIdStep(Integer id);
}
