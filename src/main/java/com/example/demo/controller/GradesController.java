package com.example.demo.controller;

import com.example.demo.model.Grades;
import com.example.demo.service.GradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GradesController {

    @Autowired
    private GradesService gradesService;

    @GetMapping("/grades")
    public Grades getGrade(
            @RequestParam("id") String id
    ) {
        return gradesService.findById(id).get();
    }

    @GetMapping("/grades")
    public Grades getGradesByStudentId(
            @RequestParam("id") String id
    ) {
        return gradesService.findById(id).get();
    }
    @GetMapping("/grades")
    public Grades findByStudentId(
            @RequestParam("student_id") String id
    ) {
        return gradesService.findByStudentId(id).get();
    }
}
