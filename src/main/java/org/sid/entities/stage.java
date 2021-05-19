package org.sid.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

import java.sql.Date;

@Entity
public class stage implements Serializable {
    @Id
    @GeneratedValue
    private long id_stage ;
    private String titre ;
    private Date date_debut;
    private Date date_fin;
    private String domaine;
    @JsonBackReference(value = "stage1")
    @ManyToOne(fetch = FetchType.LAZY,optional=true)
    @JoinColumn(name = "codeEncadrant",insertable = true,updatable = true)
    private  encadrant encadrant;


    @JsonBackReference(value = "stage2")
    @ManyToOne(fetch = FetchType.LAZY,optional=true)
    @JoinColumn(name="codeSociete",insertable = true,updatable = true)

    private societe societe;


    public stage() {

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public org.sid.entities.encadrant getEncadrant() {
        return encadrant;
    }

    public void setEncadrant(org.sid.entities.encadrant encadrant) {
        this.encadrant = encadrant;
    }

    public societe getSociete() {
        return societe;
    }

    public void setSociete(societe societe) {
        this.societe = societe;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public stage(long id_stage, String titre, Date date_debut, Date date_fin, String domaine, encadrant encadrant, societe societe) {
        super();
        this.id_stage = id_stage;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.domaine = domaine;
        this.encadrant = encadrant;
        this.societe = societe;
        this.titre=titre;

    }

    public long getId_stage() {
        return id_stage;
    }

    public void setId_stage(long id_stage) {
        this.id_stage = id_stage;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin( Date date_fin) {
        this.date_fin = date_fin;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }
}
