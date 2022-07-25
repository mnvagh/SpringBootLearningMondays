package com.ellucian.course.controller;

import com.ellucian.course.entity.Course;
import com.ellucian.course.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
@Slf4j
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/")
    public Course saveCourse(@RequestBody Course course){
        log.info("CourseController :: Inside save course method!!!");
        return courseService.saveCourse(course);
    }

    @GetMapping("/{courseId}")
    public Course findCourseByCourseId(@PathVariable("courseId") Long courseId){
        log.info("CourseController :: Inside get course info method!!!");
        return courseService.findCourseByCourseId(courseId);
    }
}
