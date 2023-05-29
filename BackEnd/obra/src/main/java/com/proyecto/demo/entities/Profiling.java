
package com.proyecto.demo.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "profilings")
public class Profiling extends Base {
    
    @Column(name = "date_init")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_init;
    @Column(name = "date_end")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_end;
    @Column(name = "element_set")
    private String element_set;
    @Column(name = "use_sealant")
    private String use_sealant;
    @Column(name = "num_person")
    private int num_person;
    @Column(name = "ml_profiling")
    private int ml_profiling;
    @Column(name = "kg_profiling")
    private int kg_profiling;
    @Column(name = "ml_straps")
    private int ml_straps;
    @Column(name = "result")
    private int result;
    @Column(name = "comment")
    private String comment;
    
    //Variable Bidireccional Relacion Visit (1) a (1) Profiling:
    @OneToOne
    @JoinColumn(name = "id_visit")
    @JsonIgnoreProperties(value = "profiling", allowSetters = true)
    private Visit visit;

    public Profiling() {
    }

    public Profiling(LocalDate date_init, LocalDate date_end, String element_set, String use_sealant, int num_person, int ml_profiling, int kg_profiling, int ml_straps, int result, String comment, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.date_init = date_init;
        this.date_end = date_end;
        this.element_set = element_set;
        this.use_sealant = use_sealant;
        this.num_person = num_person;
        this.ml_profiling = ml_profiling;
        this.kg_profiling = kg_profiling;
        this.ml_straps = ml_straps;
        this.result = result;
        this.comment = comment;
    }

    public Profiling(LocalDate date_init, LocalDate date_end, String element_set, String use_sealant, int num_person, int ml_profiling, int kg_profiling, int ml_straps, int result, String comment, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.date_init = date_init;
        this.date_end = date_end;
        this.element_set = element_set;
        this.use_sealant = use_sealant;
        this.num_person = num_person;
        this.ml_profiling = ml_profiling;
        this.kg_profiling = kg_profiling;
        this.ml_straps = ml_straps;
        this.result = result;
        this.comment = comment;
    }

    public LocalDate getDate_init() {
        return date_init;
    }

    public void setDate_init(LocalDate date_init) {
        this.date_init = date_init;
    }

    public LocalDate getDate_end() {
        return date_end;
    }

    public void setDate_end(LocalDate date_end) {
        this.date_end = date_end;
    }

    public String getElement_set() {
        return element_set;
    }

    public void setElement_set(String element_set) {
        this.element_set = element_set;
    }

    public String getUse_sealant() {
        return use_sealant;
    }

    public void setUse_sealant(String use_sealant) {
        this.use_sealant = use_sealant;
    }

    public int getNum_person() {
        return num_person;
    }

    public void setNum_person(int num_person) {
        this.num_person = num_person;
    }

    public int getMl_profiling() {
        return ml_profiling;
    }

    public void setMl_profiling(int ml_profiling) {
        this.ml_profiling = ml_profiling;
    }

    public int getKg_profiling() {
        return kg_profiling;
    }

    public void setKg_profiling(int kg_profiling) {
        this.kg_profiling = kg_profiling;
    }

    public int getMl_straps() {
        return ml_straps;
    }

    public void setMl_straps(int ml_straps) {
        this.ml_straps = ml_straps;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }
    
 
}
