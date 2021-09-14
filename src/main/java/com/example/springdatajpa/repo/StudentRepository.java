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
    @Query(value = "SELECT * FROM student WHERE name = 'studentA'",
            nativeQuery = true)
    List<Student> findStudentByName();

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM student WHERE id = :id", nativeQuery = true)
    void deleteStudent(long id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE Student SET email= ?1 WHERE id = ?2", nativeQuery = true)
    void updateStudent(String email, long id);

}