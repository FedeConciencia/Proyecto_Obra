
package com.proyecto.obra.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person extends Base {
    
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "dni")
    private String dni;
    @Column(name = "record")
    private String record;
    @Column(name = "position")
    private String position;
    @Column(name = "company")
    private String company;
    
    //Variable Bidireccional Relacion Person (1) a (1) User:
    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "person", allowSetters = true)
    private User user;
    
    //Variable Bidireccional Relacion Person (1) a (N) Visit:
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "person", allowSetters = true)
    private List<Visit> listVisit;

    public Person() {
    }

    public Person(String first_name, String last_name, String dni, String record, String position, String company, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.first_name = first_name;
        this.last_name = last_name;
        this.dni = dni;
        this.record = record;
        this.position = position;
        this.company = company;
    }

    public Person(String first_name, String last_name, String dni, String record, String position, String company, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.first_name = first_name;
        this.last_name = last_name;
        this.dni = dni;
        this.record = record;
        this.position = position;
        this.company = company;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Visit> getListVisit() {
        return listVisit;
    }

    public void setListVisit(List<Visit> listVisit) {
        this.listVisit = listVisit;
    }

    
    @Override
    public String toString() {
        return "id: " + id + "\nfirst_name: " + first_name + "\nlast_name: " + last_name + "\ndni: " + dni + 
               "\nrecord: " + record + "\nposition: " + position + "\ncompany: " + company + 
               "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
    }
    
    
    
}
