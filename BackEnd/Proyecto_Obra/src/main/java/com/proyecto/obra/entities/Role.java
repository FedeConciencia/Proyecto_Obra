
package com.proyecto.obra.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "roles")
public class Role extends Base{
    
    @Column(name = "description")
    private String description;
    
    //Variable Bidireccional Relacion User (1) a (1) Role:
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    @JsonIgnoreProperties(value = "user", allowSetters = true)
    private User user;

    public Role() {
    }

    public Role(String description, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.description = description;
    }

    public Role(String description, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    @Override
    public String toString() {
        return "id: " + id + "first_name: " + "\ndescription: " + description + 
               "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
    }
    
    
    
    
}
