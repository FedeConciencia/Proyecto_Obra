
package com.proyecto.demo.entities;

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
@Table(name = "generals")
public class General extends Base {
    
    @Column(name = "code") 
    private String code;
    @Column(name = "nanme")
    private String name;
    @Column(name = "dniCuit")
    private String dniCuit;
    @Column(name = "adress")
    private String adress;
    @Column(name = "destination_use")
    private String destination_use;
    @Column(name = "scope")
    private String scope;
    @Column(name = "duration")
    private int duration;
    @Column(name = "comment")
    private String comment;
    
    
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
    
    //Variable Bidireccional Relacion Conclusion (1) a (1) General:
    @OneToOne(mappedBy = "general", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "general", allowSetters = true)
    private Conclusion conclusion;

    public General() {
    }

    public General(String code, String name, String dniCuit, String adress, String destination_use, String scope, int duration, String comment, List<Visit> listVisit, Material material, Structure structure, Mounting mounting, Conclusion conclusion, Long id, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(id, date_create, date_update, date_delete, state);
        this.code = code;
        this.name = name;
        this.dniCuit = dniCuit;
        this.adress = adress;
        this.destination_use = destination_use;
        this.scope = scope;
        this.duration = duration;
        this.comment = comment;
        this.listVisit = listVisit;
        this.material = material;
        this.structure = structure;
        this.mounting = mounting;
        this.conclusion = conclusion;
    }

    public General(String code, String name, String dniCuit, String adress, String destination_use, String scope, int duration, String comment, List<Visit> listVisit, Material material, Structure structure, Mounting mounting, Conclusion conclusion, LocalDate date_create, LocalDate date_update, LocalDate date_delete, String state) {
        super(date_create, date_update, date_delete, state);
        this.code = code;
        this.name = name;
        this.dniCuit = dniCuit;
        this.adress = adress;
        this.destination_use = destination_use;
        this.scope = scope;
        this.duration = duration;
        this.comment = comment;
        this.listVisit = listVisit;
        this.material = material;
        this.structure = structure;
        this.mounting = mounting;
        this.conclusion = conclusion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDniCuit() {
        return dniCuit;
    }

    public void setDniCuit(String dniCuit) {
        this.dniCuit = dniCuit;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDestination_use() {
        return destination_use;
    }

    public void setDestination_use(String destination_use) {
        this.destination_use = destination_use;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public Conclusion getConclusion() {
        return conclusion;
    }

    public void setConclusion(Conclusion conclusion) {
        this.conclusion = conclusion;
    }
    

    
}
