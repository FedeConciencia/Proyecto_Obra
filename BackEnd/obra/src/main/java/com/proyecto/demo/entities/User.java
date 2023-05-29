
package com.proyecto.demo.entities;

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
    
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "password")
    private String password;
    
    //Variable Bidireccional Relacion Person (1) a (1) User:
    @OneToOne
    @JoinColumn(name = "id_person")
    @JsonIgnoreProperties(value = "user", allowSetters = true)
    private Person person;
    
    //Variable Bidireccional Relacion User (1) a (1) Role:
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "user", allowSetters = true)
    private Role role;

    public User() {
    }

    public User(String usuario, String password, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.usuario = usuario;
        this.password = password;
    }

    public User(String usuario, String password, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.usuario = usuario;
        this.password = password;
    }

    public String getUser() {
        return usuario;
    }

    public void setUser(String usuario) {
        this.usuario = usuario;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
   
    
    
}
