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
    void listStudent(){
        List<Student> list = (List<Student>) studentRepository.findAll();
        list.forEach(System.out::println);
    }
    @Test
    void createStudent(){
        Student student = Student.builder().name("studentA").email("studentA@gmail.com").build();
        studentRepository.save(student);
    }
    @Test
    void deleteStudent(){
        studentRepository.deleteById(2L);
    }


}
