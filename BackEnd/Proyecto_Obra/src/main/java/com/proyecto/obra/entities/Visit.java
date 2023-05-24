
package com.proyecto.obra.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "visit")
public class Visit extends Base {
    
    @Column(name = "fecha")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date;
    @Column(name = "nroVisita")
    private int nroVisit;
    
    
    //Variable Bidireccional Relacion General (1) a (N) Visit:
    @ManyToOne
    @JoinColumn(name = "id_general")
    @JsonIgnoreProperties(value = "listVisit", allowSetters = true)
    private General general;
    
    //Variable Bidireccional Relacion Person (1) a (N) Visit:
    @ManyToOne
    @JoinColumn(name = "id_person")
    @JsonIgnoreProperties(value = "listVisit", allowSetters = true)
    private Person person;
    
    

    public Visit() {
    }
    
    
    public Visit(LocalDate date, int nroVisit, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.date = date;
        this.nroVisit = nroVisit;
    }

    public Visit(LocalDate date, int nroVisit, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.date = date;
        this.nroVisit = nroVisit;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNroVisit() {
        return nroVisit;
    }

    public void setNroVisit(int nroVisit) {
        this.nroVisit = nroVisit;
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

   
   
    @Override
    public String toString() {
        return "id: " + id + "\ndate: " + date + "\nnroVisit: " + nroVisit + 
               "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
    }
    
    
}
