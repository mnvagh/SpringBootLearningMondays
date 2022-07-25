package com.ellucian.student.controller;

import com.ellucian.student.VO.ResponseTemplateVO;
import com.ellucian.student.entity.Student;
import com.ellucian.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public Student saveStudent(@RequestBody Student student){
        log.info("StudentController :: Inside save student method!!!");
        return studentService.saveStudent(student);
    }

   /* @GetMapping("/{studentId}")
    public Student getStudentInfoById(@PathVariable("studentId") Long studentId){
        log.info("StudentController :: Inside get student info method!!!");
        return studentService.findStudentById(studentId);
    }*/
    @GetMapping("/{studentId}")
    public ResponseTemplateVO getStudentWithCourse(@PathVariable("studentId")Long studentId){
        log.info("StudentController :: Inside get student with course info method!!!");
        return studentService.getStudentWithCourse(studentId);
    }
}

