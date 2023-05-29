
package com.proyecto.obra.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Base implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(name = "date_create")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    protected LocalDate date_create;
    @Column(name = "date_update")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    protected LocalDate date_update;
    @Column(name = "date_delete")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    protected LocalDate date_delete;
    @Column(name = "state")
    protected String state;

    public Base() {
    }

    public Base(Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        this.id = id;
        this.date_create = date_create;
        this.date_update = date_update;
        this.date_delete = date_delete;
        this.state = state;
    }

    public Base(LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        this.date_create = date_create;
        this.date_update = date_update;
        this.date_delete = date_delete;
        this.state = state;
    }

   
    @Override
    public String toString() {
        return "id: " + id + "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
    }
    
    
    
}
