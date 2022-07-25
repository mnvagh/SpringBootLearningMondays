package com.ellucian.course.service;

import com.ellucian.course.entity.Course;
import com.ellucian.course.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        log.info("CourseRepository :: Inside save course method!!!");
        return courseRepository.save(course);
    }

    public Course findCourseByCourseId(Long courseId) {
        log.info("CourseRepository :: Inside get course info method!!!");
        return courseRepository.findCourseByCourseId(courseId);
    }
}
