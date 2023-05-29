
package com.proyecto.demo.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "roofs")
public class Roof extends Base {
    
    
    @Column(name = "date_init")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_init;
    @Column(name = "date_end")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_end;
    @Column(name = "num_deck")
    private int num_deck;
    @Column(name = "num_person")
    private int num_person;
    @Column(name = "panel_type")
    private String panel_type;
    @Column(name = "fallen_days")
    private int fallen_days;
    @Column(name = "reason")
    private String reason;
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
    
    //Variable Bidireccional Relacion Visit (1) a (N) Roof:
    @ManyToOne
    @JoinColumn(name = "id_visit")
    @JsonIgnoreProperties(value = "listRoof", allowSetters = true)
    private Visit visit;

    public Roof() {
    }

    public Roof(LocalDate date_init, LocalDate date_end, int num_deck, int num_person, String panel_type, int fallen_days, String reason, String use_sealant, int stairs, int scaffolding, int stork, int winch, int scissors, int handy, int mobile_crane, int tower_crane, String other_guilds, String delay, int quality_work, String comment, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.date_init = date_init;
        this.date_end = date_end;
        this.num_deck = num_deck;
        this.num_person = num_person;
        this.panel_type = panel_type;
        this.fallen_days = fallen_days;
        this.reason = reason;
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

    public Roof(LocalDate date_init, LocalDate date_end, int num_deck, int num_person, String panel_type, int fallen_days, String reason, String use_sealant, int stairs, int scaffolding, int stork, int winch, int scissors, int handy, int mobile_crane, int tower_crane, String other_guilds, String delay, int quality_work, String comment, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.date_init = date_init;
        this.date_end = date_end;
        this.num_deck = num_deck;
        this.num_person = num_person;
        this.panel_type = panel_type;
        this.fallen_days = fallen_days;
        this.reason = reason;
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

    public int getNum_deck() {
        return num_deck;
    }

    public void setNum_deck(int num_deck) {
        this.num_deck = num_deck;
    }

    public int getNum_person() {
        return num_person;
    }

    public void setNum_person(int num_person) {
        this.num_person = num_person;
    }

    public String getPanel_type() {
        return panel_type;
    }

    public void setPanel_type(String panel_type) {
        this.panel_type = panel_type;
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
    
    

    
}
