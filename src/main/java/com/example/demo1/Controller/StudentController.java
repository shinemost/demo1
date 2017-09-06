package com.example.demo1.Controller;

import com.example.demo1.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:fhj
 * date:2017/6/29 0029 14:51
 * doc:mongodb测试Controller
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;


}
