
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
@Table(name = "conclusions")
public class Conclusion extends Base {
    
    @Column(name = "finished_work")
    private String finished_work;
    @Column(name = "current_progress")
    private double current_progress;
    @Column(name = "expected_progress")
    private double expected_progress;
    @Column(name = "date_end")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_end;
    @Column(name = "satisfaction")
    private int satisfaction;
    @Column(name = "comment")
    private String comment;
    
    //Variable Bidireccional Relacion Conclusion (1) a (1) General:
    @OneToOne
    @JoinColumn(name = "id_general")
    @JsonIgnoreProperties(value = "conclusion", allowSetters = true)
    private General general;

    public Conclusion() {
    }

    public Conclusion(String finished_work, double current_progress, double expected_progress, LocalDate date_end, int satisfaction, String comment, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.finished_work = finished_work;
        this.current_progress = current_progress;
        this.expected_progress = expected_progress;
        this.date_end = date_end;
        this.satisfaction = satisfaction;
        this.comment = comment;
    }

    public Conclusion(String finished_work, double current_progress, double expected_progress, LocalDate date_end, int satisfaction, String comment, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.finished_work = finished_work;
        this.current_progress = current_progress;
        this.expected_progress = expected_progress;
        this.date_end = date_end;
        this.satisfaction = satisfaction;
        this.comment = comment;
    }

    public String getFinished_work() {
        return finished_work;
    }

    public void setFinished_work(String finished_work) {
        this.finished_work = finished_work;
    }

    public double getCurrent_progress() {
        return current_progress;
    }

    public void setCurrent_progress(double current_progress) {
        this.current_progress = current_progress;
    }

    public double getExpected_progress() {
        return expected_progress;
    }

    public void setExpected_progress(double expected_progress) {
        this.expected_progress = expected_progress;
    }

    public LocalDate getDate_end() {
        return date_end;
    }

    public void setDate_end(LocalDate date_end) {
        this.date_end = date_end;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
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
    
    
  
    
}
