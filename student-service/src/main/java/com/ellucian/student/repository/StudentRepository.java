package com.ellucian.student.repository;

import com.ellucian.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    //Student findStudentByStudentId(Long studentId);

    Student findByStudentId(Long studentId);
}
