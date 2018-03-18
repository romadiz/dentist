package com.scheduler.dentist.service;

import com.scheduler.dentist.model.Doctor;
import com.scheduler.dentist.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor findByDoctorId(String doctorId){
        return doctorRepository.findByDoctorId(doctorId);
    }


}
