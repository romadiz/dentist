package com.scheduler.dentist.repository;

import com.scheduler.dentist.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
    Doctor findByDoctorId (String doctorId);
    List<Doctor> findByNameAndSurname(String name, String surname);
}
