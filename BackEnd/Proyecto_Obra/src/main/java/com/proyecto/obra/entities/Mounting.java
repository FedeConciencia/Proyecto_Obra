
package com.proyecto.obra.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mounting")
public class Mounting extends Base {
    
    @Column(name = "height")
    private double height;
    @Column(name = "deck")
    private double deck;
    @Column(name = "wall")
    private double wall;
    @Column(name = "num_wall")
    private int num_wall;
    @Column(name = "num_ceilings")
    private int num_ceilings;
    @Column(name = "num_cameras")
    private int num_cameras;
    @Column(name = "archit_stage")
    private int archit_stage;
    @Column(name = "archit_stage")
    private int cameras_stage;
    @Column(name = "comment")
    private String comment;
    
    //Variable Bidireccional Relacion General (1) a (1) Mounting:
    @OneToOne
    @JoinColumn(name = "id_general")
    @JsonIgnoreProperties(value = "mounting", allowSetters = true)
    private General general;

    public Mounting() {
    }

    public Mounting(double height, double deck, double wall, int num_wall, int num_ceilings, int num_cameras, int archit_stage, int cameras_stage, String comment, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.height = height;
        this.deck = deck;
        this.wall = wall;
        this.num_wall = num_wall;
        this.num_ceilings = num_ceilings;
        this.num_cameras = num_cameras;
        this.archit_stage = archit_stage;
        this.cameras_stage = cameras_stage;
        this.comment = comment;
    }

    public Mounting(double height, double deck, double wall, int num_wall, int num_ceilings, int num_cameras, int archit_stage, int cameras_stage, String comment, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.height = height;
        this.deck = deck;
        this.wall = wall;
        this.num_wall = num_wall;
        this.num_ceilings = num_ceilings;
        this.num_cameras = num_cameras;
        this.archit_stage = archit_stage;
        this.cameras_stage = cameras_stage;
        this.comment = comment;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDeck() {
        return deck;
    }

    public void setDeck(double deck) {
        this.deck = deck;
    }

    public double getWall() {
        return wall;
    }

    public void setWall(double wall) {
        this.wall = wall;
    }

    public int getNum_wall() {
        return num_wall;
    }

    public void setNum_wall(int num_wall) {
        this.num_wall = num_wall;
    }

    public int getNum_ceilings() {
        return num_ceilings;
    }

    public void setNum_ceilings(int num_ceilings) {
        this.num_ceilings = num_ceilings;
    }

    public int getNum_cameras() {
        return num_cameras;
    }

    public void setNum_cameras(int num_cameras) {
        this.num_cameras = num_cameras;
    }

    public int getArchit_stage() {
        return archit_stage;
    }

    public void setArchit_stage(int archit_stage) {
        this.archit_stage = archit_stage;
    }

    public int getCameras_stage() {
        return cameras_stage;
    }

    public void setCameras_stage(int cameras_stage) {
        this.cameras_stage = cameras_stage;
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
        return "id: " + id + "\nheight: " + height + "\ndeck: " + deck + "\nwall: " + wall + "\nnum_wall: " + num_wall + 
               "\nnum_ceilings: " + num_ceilings + "\nnum_cameras: " + num_cameras + "\narchit_stage: " + archit_stage + 
               "\ncameras_stage: " + cameras_stage + "\ncomment: " + comment +
               "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
    }
    
    
    
}
