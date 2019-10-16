package com.itheima.service.Impl;/*
包名:com.itheima.service.Impl
创建者:ZJ
日期:2019-09-20 11:06
*/

import com.itheima.domain.department;
import com.itheima.mapper.DepartmentMapper;
import com.itheima.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
   private DepartmentMapper departmentMapper;
    @Override
    public List<department> findsubject() {
        return null;
    }
}
