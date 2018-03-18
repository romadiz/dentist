package com.scheduler.dentist.repository;

import com.scheduler.dentist.model.Doctor;
import com.scheduler.dentist.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientRepository extends MongoRepository<Patient, String>{
    Patient findByNameAndSurnameAndPhone(String name, String surname, Long phone);
    List<Patient> findByDoctor(Doctor doctor);
    List<Patient> findByPhone(Long phone);
}
