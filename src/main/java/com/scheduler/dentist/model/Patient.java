package com.scheduler.dentist.model;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@CompoundIndexes({
     @CompoundIndex(name = "patient_idx", def = "{'name':1,'surname':1,'phone':1}", unique = true)
})
public class Patient {

    private String id;
    private String name;
    private String surname;
    private Long phone;
    private Boolean sms;
    private Doctor doctor;

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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Boolean getSms() {
        return sms;
    }

    public void setSms(Boolean sms) {
        this.sms = sms;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient(String name, String surname, Long phone, Boolean sms) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.sms = sms;
    }

    public Patient() {
    }

    public Patient(String name, String surname, Long phone, Boolean sms, Doctor doctor) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.sms = sms;
        this.doctor = doctor;
    }
}
