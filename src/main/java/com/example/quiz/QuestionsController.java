package com.example.quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@RequiredArgsConstructor
public class QuestionsController {

    private final QuestionsService questionService;

    @GetMapping
    public List<Questions> getQuestions() {
        return questionService.getApprovedQuestions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Questions> getQuestion(@PathVariable String id) {
        return ResponseEntity.of(questionService.getQuestion(id));
    }

    @PostMapping
    public Questions createQuestion(@RequestBody Questions question) {
        return questionService.createQuestion(question);
    }

}
