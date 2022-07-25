package com.ellucian.student.service;

import com.ellucian.student.VO.Course;
import com.ellucian.student.VO.ResponseTemplateVO;
import com.ellucian.student.entity.Student;
import com.ellucian.student.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Student saveStudent(Student student) {
        log.info("StudentService :: Inside save student method!!!");
        return studentRepository.save(student);
    }

    /*public Student findStudentById(Long studentId) {
        log.info("StudentService :: Inside get student info method!!!");
        return studentRepository.findStudentByStudentId(studentId);
    }*/

    public ResponseTemplateVO getStudentWithCourse(Long studentId) {
        log.info("StudentService :: Inside get student with course info method!!!");
        ResponseTemplateVO vo = new ResponseTemplateVO();

        Student student = studentRepository.findByStudentId(studentId);
        //Course course = restTemplate.getForObject("http://localhost:9001/courses/"+student.getCourseId() ,Course.class);
        Course course = restTemplate.getForObject("http://COURSE-SERVICE/courses/"+student.getCourseId() ,Course.class);
        vo.setStudent(student);
        vo.setCourse(course);

        return vo;
    }
}
