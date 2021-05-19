package org.sid.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class etudiant implements Serializable {
    @Id @GeneratedValue
    private Long id ;
    private String nom;
    private String prenom;
    private String email;
    private Long tel;
    private String niveau;
    private String specialite;
    @JsonBackReference(value = "etud")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codeEncadrant",insertable = true,updatable = true)

    private encadrant encadrant;
    public etudiant() {
    }

    public etudiant(Long id, String nom, String prenom, String email, Long tel, String niveau, String specialite, org.sid.entities.encadrant encadrant) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.niveau = niveau;
        this.specialite = specialite;
        this.encadrant = encadrant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
