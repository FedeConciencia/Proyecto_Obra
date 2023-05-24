
package com.proyecto.obra.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "subjetc")
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
    private int time_saturday_saturday;
    @Column(name = "time_saturday_end")
    private int time_saturday_end;
    @Column(name = "time_sunday_init")
    private int time_sunday_saturday;
    @Column(name = "time_sunday_end")
    private int time_sunday_end;
    
    
    
}
