package com.example.springdatajpa.repo;
import com.example.springdatajpa.entity.*;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query(value = "SELECT s FROM Student s WHERE s.name = 'studentA'")
    List<Student> findStudentByName();

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Student WHERE id = :id")
    void deleteStudent(long id);

}