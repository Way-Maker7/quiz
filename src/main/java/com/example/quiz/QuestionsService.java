package com.example.quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionsService {

    private final QuestionsRepository questionRepository;

    public List<Questions> getApprovedQuestions() {
        return questionRepository.findAllByApproved(true);
    }

    public List<Questions> getOpenQuestions() {
        return questionRepository.findAllByApproved(false);
    }

    public Questions createQuestion(Questions question) {
        return questionRepository.save(question);
    }

    public Optional<Questions> getQuestion(String id) {
        return questionRepository.findById(id);
    }
}
