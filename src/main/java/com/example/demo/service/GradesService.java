package com.example.demo.service;

import com.example.demo.model.Grades;
import com.example.demo.repository.GradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GradesService {

    @Autowired
    private GradesRepository productRepository;
    private GradesService findByStudentId;


    public Optional<Grades> findById(String id){
        return this.productRepository.findById(id);
    }
    public Optional<Grades> findByStudentId (String id){
        return this.findByStudentId.findById(id);
    }
}
