
package com.example.springdatajpa;

import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.repo.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDataJpaApplicationTests {

    @Autowired
    private StudentRepository studentRepository;
    @Test
    void contextLoads() {
    }

    @Test
    void findStudentByName(){
        List<Student> list = studentRepository.findStudentByName();
    }
    @Test
    void updateStudent(){
        studentRepository.updateStudent("email@gmail.com",1l);
    }
    @Test
    void deleteStudent(){
        studentRepository.deleteStudent(1l);
    }


}