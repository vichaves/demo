package com.example.demo.service;

import com.example.demo.model.Grades;
import com.example.demo.repository.GradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradesService {

    @Autowired
    private GradesRepository gradesRepository;

    public Optional<Grades> findById(String id) {
        return this.gradesRepository.findById(id);
    }

    public List<Grades> findByStudentId(Long id) {
        return this.gradesRepository.findByStudentId(id);
    }
}