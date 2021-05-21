package org.sid.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class societe implements Serializable {
    @Id @GeneratedValue
    private Long rais_soc;
    private String adresse;
    private String libelle;
    private String domaine;
    private String type;
    @JsonManagedReference(value = "encad")
    @OneToMany(mappedBy = "societe",cascade = CascadeType.ALL,orphanRemoval=true)
    private Collection<encadrant> encadrants;
    @JsonManagedReference(value = "stage2")
    @OneToMany(mappedBy = "societe",cascade = CascadeType.ALL,orphanRemoval=true)
    private Collection<stage> stages;
    public societe() {
    }

    public Collection<encadrant> getEncadrants() {
        return encadrants;
    }

    public void setEncadrants(Collection<encadrant> encadrants) {
        this.encadrants = encadrants;
    }

    public Collection<stage> getStages() {
        return stages;
    }

    public void setStages(Collection<stage> stages) {
        this.stages = stages;
    }

    public societe(Long rais_soc, String adresse, String libelle, String domaine, String type, Collection<encadrant> encadrants, Collection<stage> stages) {
        this.rais_soc = rais_soc;
        this.adresse = adresse;
        this.libelle = libelle;
        this.domaine = domaine;
        this.type = type;
        this.encadrants = encadrants;
        this.stages = stages;
    }

    public Long getRais_soc() {
        return rais_soc;
    }

    public void setRais_soc(Long rais_soc) {
        this.rais_soc = rais_soc;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
