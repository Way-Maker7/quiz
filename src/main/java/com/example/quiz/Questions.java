package com.example.quiz;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questions")
@Data
public class Questions {

    @Id
    private String id;
    private String question;
    private String correctAnswer;
    private boolean approved;
}