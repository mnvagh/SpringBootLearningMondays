package com.ellucian.course.repository;

import com.ellucian.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

    Course findCourseByCourseId(Long courseId);
}
