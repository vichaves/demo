package com.example.demo.repository;

import com.example.demo.model.Grades;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface GradesRepository extends MongoRepository<Grades, String> {

    @Query("{student_id: ?0}")
    List<Grades> findByStudentId(Long studentId);
}
