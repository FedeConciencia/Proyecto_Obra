
package com.proyecto.obra.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cameras")
public class Camera extends Base {
    
    @Column(name = "date_init")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_init;
    @Column(name = "date_end")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_end;
    @Column(name = "num_wall")
    private int num_wall;
    @Column(name = "num_person_wall")
    private int num_person_wall;
    @Column(name = "panel_type_wall")
    private String panel_type_wall;
    @Column(name = "ceiling")
    private int ceiling;
    @Column(name = "num_person_ceil")
    private int num_person_ceil;
    @Column(name = "panel_type_ceil")
    private String panel_type_ceil;
    @Column(name = "fallen_days")
    private int fallen_days;
    @Column(name = "reason")
    private String reason;
    @Column(name = "use_putty")
    private String use_putty;
    @Column(name = "use_sealant")
    private String use_sealant;
    @Column(name = "stairs")
    private int stairs;
    @Column(name = "scaffolding")
    private int scaffolding;
    @Column(name = "stork")
    private int stork;
    @Column(name = "winch")
    private int winch;
    @Column(name = "scissors")
    private int scissors;
    @Column(name = "handy")
    private int handy;
    @Column(name = "mobile_crane")
    private int mobile_crane;
    @Column(name = "tower_crane")
    private int tower_crane;
    @Column(name = "other_guilds")
    private String other_guilds;
    @Column(name = "delay")
    private String delay;
    @Column(name = "quality_work")
    private int quality_work;
    @Column(name = "comment")
    private String comment;
    
    
    //Variable Bidireccional Relacion Visit (1) a (N) Camera:
    @ManyToOne
    @JoinColumn(name = "id_visit")
    @JsonIgnoreProperties(value = "listCamera", allowSetters = true)
    private Visit visit;
    

    public Camera() {
    }

    public Camera(LocalDate date_init, LocalDate date_end, int num_wall, int num_person_wall, String panel_type_wall, int ceiling, int num_person_ceil, String panel_type_ceil, int fallen_days, String reason, String use_putty, String use_sealant, int stairs, int scaffolding, int stork, int winch, int scissors, int handy, int mobile_crane, int tower_crane, String other_guilds, String delay, int quality_work, String comment, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.date_init = date_init;
        this.date_end = date_end;
        this.num_wall = num_wall;
        this.num_person_wall = num_person_wall;
        this.panel_type_wall = panel_type_wall;
        this.ceiling = ceiling;
        this.num_person_ceil = num_person_ceil;
        this.panel_type_ceil = panel_type_ceil;
        this.fallen_days = fallen_days;
        this.reason = reason;
        this.use_putty = use_putty;
        this.use_sealant = use_sealant;
        this.stairs = stairs;
        this.scaffolding = scaffolding;
        this.stork = stork;
        this.winch = winch;
        this.scissors = scissors;
        this.handy = handy;
        this.mobile_crane = mobile_crane;
        this.tower_crane = tower_crane;
        this.other_guilds = other_guilds;
        this.delay = delay;
        this.quality_work = quality_work;
        this.comment = comment;
    }

    public Camera(LocalDate date_init, LocalDate date_end, int num_wall, int num_person_wall, String panel_type_wall, int ceiling, int num_person_ceil, String panel_type_ceil, int fallen_days, String reason, String use_putty, String use_sealant, int stairs, int scaffolding, int stork, int winch, int scissors, int handy, int mobile_crane, int tower_crane, String other_guilds, String delay, int quality_work, String comment, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.date_init = date_init;
        this.date_end = date_end;
        this.num_wall = num_wall;
        this.num_person_wall = num_person_wall;
        this.panel_type_wall = panel_type_wall;
        this.ceiling = ceiling;
        this.num_person_ceil = num_person_ceil;
        this.panel_type_ceil = panel_type_ceil;
        this.fallen_days = fallen_days;
        this.reason = reason;
        this.use_putty = use_putty;
        this.use_sealant = use_sealant;
        this.stairs = stairs;
        this.scaffolding = scaffolding;
        this.stork = stork;
        this.winch = winch;
        this.scissors = scissors;
        this.handy = handy;
        this.mobile_crane = mobile_crane;
        this.tower_crane = tower_crane;
        this.other_guilds = other_guilds;
        this.delay = delay;
        this.quality_work = quality_work;
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

    public int getNum_wall() {
        return num_wall;
    }

    public void setNum_wall(int num_wall) {
        this.num_wall = num_wall;
    }

    public int getNum_person_wall() {
        return num_person_wall;
    }

    public void setNum_person_wall(int num_person_wall) {
        this.num_person_wall = num_person_wall;
    }

    public String getPanel_type_wall() {
        return panel_type_wall;
    }

    public void setPanel_type_wall(String panel_type_wall) {
        this.panel_type_wall = panel_type_wall;
    }

    public int getCeiling() {
        return ceiling;
    }

    public void setCeiling(int ceiling) {
        this.ceiling = ceiling;
    }

    public int getNum_person_ceil() {
        return num_person_ceil;
    }

    public void setNum_person_ceil(int num_person_ceil) {
        this.num_person_ceil = num_person_ceil;
    }

    public String getPanel_type_ceil() {
        return panel_type_ceil;
    }

    public void setPanel_type_ceil(String panel_type_ceil) {
        this.panel_type_ceil = panel_type_ceil;
    }

    public int getFallen_days() {
        return fallen_days;
    }

    public void setFallen_days(int fallen_days) {
        this.fallen_days = fallen_days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getUse_putty() {
        return use_putty;
    }

    public void setUse_putty(String use_putty) {
        this.use_putty = use_putty;
    }

    public String getUse_sealant() {
        return use_sealant;
    }

    public void setUse_sealant(String use_sealant) {
        this.use_sealant = use_sealant;
    }

    public int getStairs() {
        return stairs;
    }

    public void setStairs(int stairs) {
        this.stairs = stairs;
    }

    public int getScaffolding() {
        return scaffolding;
    }

    public void setScaffolding(int scaffolding) {
        this.scaffolding = scaffolding;
    }

    public int getStork() {
        return stork;
    }

    public void setStork(int stork) {
        this.stork = stork;
    }

    public int getWinch() {
        return winch;
    }

    public void setWinch(int winch) {
        this.winch = winch;
    }

    public int getScissors() {
        return scissors;
    }

    public void setScissors(int scissors) {
        this.scissors = scissors;
    }

    public int getHandy() {
        return handy;
    }

    public void setHandy(int handy) {
        this.handy = handy;
    }

    public int getMobile_crane() {
        return mobile_crane;
    }

    public void setMobile_crane(int mobile_crane) {
        this.mobile_crane = mobile_crane;
    }

    public int getTower_crane() {
        return tower_crane;
    }

    public void setTower_crane(int tower_crane) {
        this.tower_crane = tower_crane;
    }

    public String getOther_guilds() {
        return other_guilds;
    }

    public void setOther_guilds(String other_guilds) {
        this.other_guilds = other_guilds;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public int getQuality_work() {
        return quality_work;
    }

    public void setQuality_work(int quality_work) {
        this.quality_work = quality_work;
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
    

    @Override
    public String toString() {
        return "id: " + id + "\ndate_init: " + date_init + "\ndate_end: " + date_end + "\nnum_wall: " + num_wall + "\nnum_person_wall: " + num_person_wall + "\npanel_type_wall: " + panel_type_wall + 
               "\nceiling: " + ceiling + "\nnum_person_ceil: " + num_person_ceil + "\npanel_type_ceil: " + panel_type_ceil + "\nfallen_days: " + fallen_days + "\nreason: " + reason + 
               "\nuse_putty: " + use_putty + "\nuse_sealant: " + use_sealant + "\nstairs: " + stairs + "\nscaffolding: " + scaffolding + "\nstork: " + stork + "\nwinch: " + winch + 
               "\nscissors: " + scissors + "\nhandy: " + handy + "\nmobile_crane: " + mobile_crane + "\ntower_crane: " + tower_crane + "\nother_guilds: " + other_guilds + 
               "\ndelay: " + delay + "\nquality_work: " + quality_work + "\ncomment: " + comment +
               "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
    }
    
    
    
    
    
    
}
