package com.scheduler.dentist.model;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@CompoundIndexes({
        @CompoundIndex(name = "doctor_idx", def = "{'doctorId':1}", unique = true)
})
public class Doctor {
    private String id;
    private String name;
    private String surname;
    private String doctorId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public Doctor() {
    }

    public Doctor(String name, String surname, String doctorId) {
        this.name = name;
        this.surname = surname;
        this.doctorId = doctorId;
    }
}
