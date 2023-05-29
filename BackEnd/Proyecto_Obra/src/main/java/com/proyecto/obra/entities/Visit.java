
package com.proyecto.obra.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "visits")
public class Visit extends Base {
    
    @Column(name = "date_visit")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_visit;
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
    
    //Variable Bidireccional Relacion Subject (1) a (N) Visit:
    @OneToOne(mappedBy = "visit", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "visit", allowSetters = true)
    private Subject subjetc;
    
    //Variable Bidireccional Relacion Visit (1) a (N) Wall:
    @OneToMany(mappedBy = "visit", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "visit", allowSetters = true)
    private List<Wall> listWall;
    
    //Variable Bidireccional Relacion Visit (1) a (N) Roof:
    @OneToMany(mappedBy = "visit", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "visit", allowSetters = true)
    private List<Roof> listRoof;
    
    //Variable Bidireccional Relacion Visit (1) a (N) Camera:
    @OneToMany(mappedBy = "visit", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "visit", allowSetters = true)
    private List<Camera> listCamera;
    
    //Variable Bidireccional Relacion Visit (1) a (1) Profiling:
    @OneToOne(mappedBy = "visit", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "visit", allowSetters = true)
    private Profiling profiling;

    public Visit() {
    }
    
    
    public Visit(LocalDate date_visit, int nroVisit, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.date_visit = date_visit;
        this.nroVisit = nroVisit;
    }

    public Visit(LocalDate date_visit, int nroVisit, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.date_visit = date_visit;
        this.nroVisit = nroVisit;
    }

    public LocalDate getDate_visit() {
        return date_visit;
    }

    public void setDate_visit(LocalDate date_visit) {
        this.date_visit = date_visit;
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

    public Subject getSubjetc() {
        return subjetc;
    }

    public void setSubjetc(Subject subjetc) {
        this.subjetc = subjetc;
    }

    public List<Wall> getListWall() {
        return listWall;
    }

    public void setListWall(List<Wall> listWall) {
        this.listWall = listWall;
    }

    public List<Roof> getListRoof() {
        return listRoof;
    }

    public void setListRoof(List<Roof> listRoof) {
        this.listRoof = listRoof;
    }

    public List<Camera> getListCamera() {
        return listCamera;
    }

    public void setListCamera(List<Camera> listCamera) {
        this.listCamera = listCamera;
    }

    public Profiling getProfiling() {
        return profiling;
    }

    public void setProfiling(Profiling profiling) {
        this.profiling = profiling;
    }
    
    
    @Override
    public String toString() {
        return "id: " + id + "\ndate: " + date_visit + "\nnroVisit: " + nroVisit + 
               "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
    }
    
    
}
