package com.itheima.controller;/*
包名:com.itheima.controller
创建者:ZJ
日期:2019-09-20 10:48
*/

import com.itheima.domain.department;
import com.itheima.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/department")
public class departmentController {
    @Autowired
    private DepartmentService departmentService;
   @RequestMapping("/findsubject")
    public List<department> findsubject(){
        return null;
    }

}
