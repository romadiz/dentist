package com.scheduler.dentist.repository;

import com.scheduler.dentist.model.Doctor;
import com.scheduler.dentist.model.Event;
import com.scheduler.dentist.model.Patient;
import com.scheduler.dentist.model.Work;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface EventRepository extends MongoRepository<Event, String> {
    List<Event> findByPatient(Patient patient);
    List<Event> findByDoctor(Doctor doctor);
    List<Event> findByDoctorAndBetweenInitDateAndEndDate(Doctor doctor, Date initDate, Date endDate);
    List<Event> findBetweenInitDateAndEndDate(Date initDate, Date endDate);
    List<Event> findByWorks(List<Work> works);
}
