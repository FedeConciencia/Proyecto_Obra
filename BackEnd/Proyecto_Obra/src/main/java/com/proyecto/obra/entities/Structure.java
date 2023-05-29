
package com.proyecto.obra.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "structures")
public class Structure extends Base {
    
    @Column(name = "structure")
    private String structure;
    @Column(name = "done")
    private String done;
    @Column(name = "beams")
    private int beams;
    @Column(name = "columns")
    private int columns;
    @Column(name = "straps")
    private int straps;
    @Column(name = "budgeted")
    private String budgeted;
    @Column(name = "comment")
    private String comment;
    
    //Variable Bidireccional Relacion General (1) a (1) Structure:
    @OneToOne
    @JoinColumn(name = "id_general")
    @JsonIgnoreProperties(value = "structure", allowSetters = true)
    private General general;

    public Structure() {
    }

    public Structure(String structure, String done, int beams, int columns, int straps, String budgeted, String comment, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.structure = structure;
        this.done = done;
        this.beams = beams;
        this.columns = columns;
        this.straps = straps;
        this.budgeted = budgeted;
        this.comment = comment;
    }

    public Structure(String structure, String done, int beams, int columns, int straps, String budgeted, String comment, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.structure = structure;
        this.done = done;
        this.beams = beams;
        this.columns = columns;
        this.straps = straps;
        this.budgeted = budgeted;
        this.comment = comment;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public int getBeams() {
        return beams;
    }

    public void setBeams(int beams) {
        this.beams = beams;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getStraps() {
        return straps;
    }

    public void setStraps(int straps) {
        this.straps = straps;
    }

    public String getBudgeted() {
        return budgeted;
    }

    public void setBudgeted(String budgeted) {
        this.budgeted = budgeted;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }
    
    

    @Override
    public String toString() {
        return "id: " + id + "\nstructure: " + structure + "\ndone: " + done + "\nbeams: " + beams + "\ncolumns: " + columns + "\nstraps: " + straps + 
               "\nbudgeted: " + budgeted + "\ncomment: " + comment + 
               "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
    }
    
    
   
    
    
    
}
