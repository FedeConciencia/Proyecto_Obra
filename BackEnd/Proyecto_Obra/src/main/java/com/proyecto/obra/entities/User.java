
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
@Table(name = "users")
public class User extends Base{
    
    @Column(name = "user")
    private String user;
    @Column(name = "password")
    private String password;
    
    //Variable Bidireccional Relacion Person (1) a (1) User:
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_person")
    @JsonIgnoreProperties(value = "user", allowSetters = true)
    private Person person;
    
    //Variable Bidireccional Relacion User (1) a (1) Role:
    @OneToOne(mappedBy = "user")
    private Role role;

    public User() {
    }

    public User(String user, String password, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.user = user;
        this.password = password;
    }

    public User(String user, String password, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
   
    @Override
    public String toString() {
        return "id: " + id + "user: " + user + ", password: " + password +
               "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
        
    }
    
    
    
    
}
