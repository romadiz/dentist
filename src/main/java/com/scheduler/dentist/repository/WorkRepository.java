package com.scheduler.dentist.repository;

import com.scheduler.dentist.model.Work;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends MongoRepository<Work, String>{

    Work findByName(String name);
}
