
package com.proyecto.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "subjects")
public class Subject extends Base {
    
    @Column(name = "num_gang")
    private int num_gang;
    @Column(name = "num_person")
    private int num_person;
    @Column(name = "num_arg")
    private int num_arg;
    @Column(name = "name_contract")
    private String name_contract;
    @Column(name = "name_capataz")
    private String last_capataz;
    @Column(name = "time_week_init")
    private int time_week_init;
    @Column(name = "time_week_end")
    private int time_week_end;
    @Column(name = "time_saturday_init")
    private int time_saturday_init;
    @Column(name = "time_saturday_end")
    private int time_saturday_end;
    @Column(name = "time_sunday_init")
    private int time_sunday_init;
    @Column(name = "time_sunday_end")
    private int time_sunday_end;
    @Column(name = "num_guild")
    private int num_guild;
    @Column(name = "clothes")
    private int clothes;
    @Column(name = "footwear")
    private String footwear;
    @Column(name = "epp")
    private String epp;
    @Column(name = "tools")
    private String tools;
    @Column(name = "work_height")
    private String work_height;
    @Column(name = "bathrooms")
    private String bathrooms;
    @Column(name = "place_eat")
    private String place_eat;
    @Column(name = "age_young")
    private int age_young;
    @Column(name = "age_old")
    private int age_old;
    @Column(name = "comment")
    private String comment;
    
    
    //Variable Bidireccional Relacion Subject (1) a (1) Visit:
    @OneToOne
    @JoinColumn(name = "id_visit")
    @JsonIgnoreProperties(value = "subject", allowSetters = true)
    private Visit visit;

    public Subject() {
    }

    public Subject(int num_gang, int num_person, int num_arg, String name_contract, String last_capataz, int time_week_init, int time_week_end, int time_saturday_init, int time_saturday_end, int time_sunday_init, int time_sunday_end, int num_guild, int clothes, String footwear, String epp, String tools, String work_height, String bathrooms, String place_eat, int age_young, int age_old, String comment, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.num_gang = num_gang;
        this.num_person = num_person;
        this.num_arg = num_arg;
        this.name_contract = name_contract;
        this.last_capataz = last_capataz;
        this.time_week_init = time_week_init;
        this.time_week_end = time_week_end;
        this.time_saturday_init = time_saturday_init;
        this.time_saturday_end = time_saturday_end;
        this.time_sunday_init = time_sunday_init;
        this.time_sunday_end = time_sunday_end;
        this.num_guild = num_guild;
        this.clothes = clothes;
        this.footwear = footwear;
        this.epp = epp;
        this.tools = tools;
        this.work_height = work_height;
        this.bathrooms = bathrooms;
        this.place_eat = place_eat;
        this.age_young = age_young;
        this.age_old = age_old;
        this.comment = comment;
    }

    public Subject(int num_gang, int num_person, int num_arg, String name_contract, String last_capataz, int time_week_init, int time_week_end, int time_saturday_init, int time_saturday_end, int time_sunday_init, int time_sunday_end, int num_guild, int clothes, String footwear, String epp, String tools, String work_height, String bathrooms, String place_eat, int age_young, int age_old, String comment, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.num_gang = num_gang;
        this.num_person = num_person;
        this.num_arg = num_arg;
        this.name_contract = name_contract;
        this.last_capataz = last_capataz;
        this.time_week_init = time_week_init;
        this.time_week_end = time_week_end;
        this.time_saturday_init = time_saturday_init;
        this.time_saturday_end = time_saturday_end;
        this.time_sunday_init = time_sunday_init;
        this.time_sunday_end = time_sunday_end;
        this.num_guild = num_guild;
        this.clothes = clothes;
        this.footwear = footwear;
        this.epp = epp;
        this.tools = tools;
        this.work_height = work_height;
        this.bathrooms = bathrooms;
        this.place_eat = place_eat;
        this.age_young = age_young;
        this.age_old = age_old;
        this.comment = comment;
    }

    public int getNum_gang() {
        return num_gang;
    }

    public void setNum_gang(int num_gang) {
        this.num_gang = num_gang;
    }

    public int getNum_person() {
        return num_person;
    }

    public void setNum_person(int num_person) {
        this.num_person = num_person;
    }

    public int getNum_arg() {
        return num_arg;
    }

    public void setNum_arg(int num_arg) {
        this.num_arg = num_arg;
    }

    public String getName_contract() {
        return name_contract;
    }

    public void setName_contract(String name_contract) {
        this.name_contract = name_contract;
    }

    public String getLast_capataz() {
        return last_capataz;
    }

    public void setLast_capataz(String last_capataz) {
        this.last_capataz = last_capataz;
    }

    public int getTime_week_init() {
        return time_week_init;
    }

    public void setTime_week_init(int time_week_init) {
        this.time_week_init = time_week_init;
    }

    public int getTime_week_end() {
        return time_week_end;
    }

    public void setTime_week_end(int time_week_end) {
        this.time_week_end = time_week_end;
    }

    public int getTime_saturday_init() {
        return time_saturday_init;
    }

    public void setTime_saturday_init(int time_saturday_init) {
        this.time_saturday_init = time_saturday_init;
    }

    public int getTime_saturday_end() {
        return time_saturday_end;
    }

    public void setTime_saturday_end(int time_saturday_end) {
        this.time_saturday_end = time_saturday_end;
    }

    public int getTime_sunday_init() {
        return time_sunday_init;
    }

    public void setTime_sunday_init(int time_sunday_init) {
        this.time_sunday_init = time_sunday_init;
    }

    public int getTime_sunday_end() {
        return time_sunday_end;
    }

    public void setTime_sunday_end(int time_sunday_end) {
        this.time_sunday_end = time_sunday_end;
    }

    public int getNum_guild() {
        return num_guild;
    }

    public void setNum_guild(int num_guild) {
        this.num_guild = num_guild;
    }

    public int getClothes() {
        return clothes;
    }

    public void setClothes(int clothes) {
        this.clothes = clothes;
    }

    public String getFootwear() {
        return footwear;
    }

    public void setFootwear(String footwear) {
        this.footwear = footwear;
    }

    public String getEpp() {
        return epp;
    }

    public void setEpp(String epp) {
        this.epp = epp;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getWork_height() {
        return work_height;
    }

    public void setWork_height(String work_height) {
        this.work_height = work_height;
    }

    public String getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(String bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getPlace_eat() {
        return place_eat;
    }

    public void setPlace_eat(String place_eat) {
        this.place_eat = place_eat;
    }

    public int getAge_young() {
        return age_young;
    }

    public void setAge_young(int age_young) {
        this.age_young = age_young;
    }

    public int getAge_old() {
        return age_old;
    }

    public void setAge_old(int age_old) {
        this.age_old = age_old;
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
