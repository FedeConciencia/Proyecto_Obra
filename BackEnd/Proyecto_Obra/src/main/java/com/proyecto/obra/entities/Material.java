
package com.proyecto.obra.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "materials")
public class Material extends Base {
    
    @Column(name = "storage_state")
    private int storage_state;
    @Column(name = "storage_time")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    private LocalTime storage_time;
    @Column(name = "material_transfer")
    private int material_transfer;
    @Column(name = "secure_storage")
    private String secure_storage;
    @Column(name = "empty_container")
    private String empty_container;
    @Column(name = "leftover_material")
    private String leftover_material;
    @Column(name = "cleaning_status")
    private int cleaning_status;
    @Column(name = "organic_waste")
    private String organic_waste;
    @Column(name = "comment")
    private String comment;
    
    //Variable Bidireccional Relacion Material (1) a (1) General:
    @OneToOne
    @JoinColumn(name = "id_general")
    @JsonIgnoreProperties(value = "material", allowSetters = true)
    private General general;

    public Material() {
    }

    public Material(int storage_state, LocalTime storage_time, int material_transfer, String secure_storage, String empty_container, String leftover_material, int cleaning_status, String organic_waste, String comment, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.storage_state = storage_state;
        this.storage_time = storage_time;
        this.material_transfer = material_transfer;
        this.secure_storage = secure_storage;
        this.empty_container = empty_container;
        this.leftover_material = leftover_material;
        this.cleaning_status = cleaning_status;
        this.organic_waste = organic_waste;
        this.comment = comment;
    }

    public Material(int storage_state, LocalTime storage_time, int material_transfer, String secure_storage, String empty_container, String leftover_material, int cleaning_status, String organic_waste, String comment, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.storage_state = storage_state;
        this.storage_time = storage_time;
        this.material_transfer = material_transfer;
        this.secure_storage = secure_storage;
        this.empty_container = empty_container;
        this.leftover_material = leftover_material;
        this.cleaning_status = cleaning_status;
        this.organic_waste = organic_waste;
        this.comment = comment;
    }

    public int getStorage_state() {
        return storage_state;
    }

    public void setStorage_state(int storage_state) {
        this.storage_state = storage_state;
    }

    public LocalTime getStorage_time() {
        return storage_time;
    }

    public void setStorage_time(LocalTime storage_time) {
        this.storage_time = storage_time;
    }

    public int getMaterial_transfer() {
        return material_transfer;
    }

    public void setMaterial_transfer(int material_transfer) {
        this.material_transfer = material_transfer;
    }

    public String getSecure_storage() {
        return secure_storage;
    }

    public void setSecure_storage(String secure_storage) {
        this.secure_storage = secure_storage;
    }

    public String getEmpty_container() {
        return empty_container;
    }

    public void setEmpty_container(String empty_container) {
        this.empty_container = empty_container;
    }

    public String getLeftover_material() {
        return leftover_material;
    }

    public void setLeftover_material(String leftover_material) {
        this.leftover_material = leftover_material;
    }

    public int getCleaning_status() {
        return cleaning_status;
    }

    public void setCleaning_status(int cleaning_status) {
        this.cleaning_status = cleaning_status;
    }

    public String getOrganic_waste() {
        return organic_waste;
    }

    public void setOrganic_waste(String organic_waste) {
        this.organic_waste = organic_waste;
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
        return "id: " + id + "\nstorage_state: " + storage_state + "\nstorage_time: " + storage_time + "\nmaterial_transfer: " + material_transfer + 
               "\nsecure_storage: " + secure_storage + "\nempty_container: " + empty_container + 
               "\nleftover_material: " + leftover_material + "\ncleaning_status: " + cleaning_status + "\norganic_waste: " + organic_waste + "\ncomment: " + comment +
               "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
    }
    
    

}
