package com.example.quiz;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepository extends MongoRepository<Questions, String> {

    List<Questions> findAllByApproved(boolean approvalStatus);

}
