package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "grades")
public class Grades {
    @Id
    private String id;

    @JsonProperty("student_id")
    private Long student_id;

    @JsonProperty("scores")
    private List<Score> scores;

    @JsonProperty("class_id")
    private Long class_id;

    }

