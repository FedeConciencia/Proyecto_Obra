
package com.proyecto.obra.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "general")
public class General extends Base {
    
    @Column(name = "codigo") 
    private String codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "dniCuit")
    private String dniCuit;
    @Column(name = "domicilio")
    private String domicilio;
    @Column(name = "usoDestino")
    private String usoDestino;
    @Column(name = "alcance")
    private String alcance;
    @Column(name = "duracion")
    private int duracion;
    @Column(name = "comentario")
    private String comentario;
    
    
    //Variable Bidireccional Relacion General (1) a (N) Visit:
    @OneToMany(mappedBy = "general", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "general", allowSetters = true)
    private List<Visit> listVisit;
    
    //Variable Bidireccional Relacion Material (1) a (1) General:
    @OneToOne(mappedBy = "general", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "general", allowSetters = true)
    private Material material;
    
    //Variable Bidireccional Relacion General (1) a (1) Structure:
    @OneToOne(mappedBy = "general", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "general", allowSetters = true)
    private Structure structure;
    
    //Variable Bidireccional Relacion General (1) a (1) Mounting:
    @OneToOne(mappedBy = "general", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "general", allowSetters = true)
    private Mounting mounting;

    public General() {
    }

    public General(String codigo, String nombre, String dniCuit, String domicilio, String usoDestino, String alcance, int duracion, String comentario, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.codigo = codigo;
        this.nombre = nombre;
        this.dniCuit = dniCuit;
        this.domicilio = domicilio;
        this.usoDestino = usoDestino;
        this.alcance = alcance;
        this.duracion = duracion;
        this.comentario = comentario;
    }

    public General(String codigo, String nombre, String dniCuit, String domicilio, String usoDestino, String alcance, int duracion, String comentario, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.codigo = codigo;
        this.nombre = nombre;
        this.dniCuit = dniCuit;
        this.domicilio = domicilio;
        this.usoDestino = usoDestino;
        this.alcance = alcance;
        this.duracion = duracion;
        this.comentario = comentario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDniCuit() {
        return dniCuit;
    }

    public void setDniCuit(String dniCuit) {
        this.dniCuit = dniCuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getUsoDestino() {
        return usoDestino;
    }

    public void setUsoDestino(String usoDestino) {
        this.usoDestino = usoDestino;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public List<Visit> getListVisit() {
        return listVisit;
    }

    public void setListVisit(List<Visit> listVisit) {
        this.listVisit = listVisit;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    public Mounting getMounting() {
        return mounting;
    }

    public void setMounting(Mounting mounting) {
        this.mounting = mounting;
    }
    
    
    
    
    @Override
    public String toString() {
        return "id: " + id + "\ncodigo: " + codigo + "\nnombre: " + nombre + "\ndniCuit: " + dniCuit + "\ndomicilio: " + domicilio + 
               "\nusoDestino: " + usoDestino + "\nalcance: " + alcance + "\nduracion: " + duracion + "\ncomentario: " + comentario +
               "\ndate_create: " + date_create + "\ndate_update: " + date_update + 
               "\ndate_delete: " + date_delete + "\nstate: " + state;
    }
    
    
    
  
    
}
