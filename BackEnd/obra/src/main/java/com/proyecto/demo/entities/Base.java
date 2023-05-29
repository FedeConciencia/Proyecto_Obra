
package com.proyecto.demo.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Base implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date_create")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_create;
    @Column(name = "date_update")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_update;
    @Column(name = "date_delete")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate date_delete;
    @Column(name = "estado")
    private String estado;

    public Base() {
    }

    public Base(Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String estado) {
        this.id = id;
        this.date_create = date_create;
        this.date_update = date_update;
        this.date_delete = date_delete;
        this.estado = estado;
    }

    public Base(LocalDate date_create, LocalDate date_update, LocalDate date_delete, String estado) {
        this.date_create = date_create;
        this.date_update = date_update;
        this.date_delete = date_delete;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate_create() {
        return date_create;
    }

    public void setDate_create(LocalDate date_create) {
        this.date_create = date_create;
    }

    public LocalDate getDate_update() {
        return date_update;
    }

    public void setDate_update(LocalDate date_update) {
        this.date_update = date_update;
    }

    public LocalDate getDate_delete() {
        return date_delete;
    }

    public void setDate_delete(LocalDate date_delete) {
        this.date_delete = date_delete;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    
}
