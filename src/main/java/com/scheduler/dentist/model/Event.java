package com.scheduler.dentist.model;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@CompoundIndexes({
        @CompoundIndex(name = "event_idx", def = "{'initDate':1,'endDate':1,'doctor':1,'patient':1}", unique = true)
})
public class Event {

    private String id;
    private Date initDate;
    private Date endDate;
    private List<Work> works;
    private Doctor doctor;
    private Patient patient;
    private String comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Event() {
    }

    public Event(Date initDate, Date endDate, List<Work> works, Doctor doctor, Patient patient, String comments) {
        this.initDate = initDate;
        this.endDate = endDate;
        this.works = works;
        this.doctor = doctor;
        this.patient = patient;
        this.comments = comments;
    }
}
