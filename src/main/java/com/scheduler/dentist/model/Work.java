package com.scheduler.dentist.model;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@CompoundIndexes({
        @CompoundIndex(name = "work_idx", def = "{'name':1}", unique = true)
})
public class Work {

    private String id;
    private String name;
    private Long time;

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

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Work() {
    }

    public Work(String name, Long time) {
        this.name = name;
        this.time = time;
    }
}
