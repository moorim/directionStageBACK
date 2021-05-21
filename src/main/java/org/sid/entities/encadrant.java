package org.sid.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
public class encadrant implements Serializable {

    @Id @GeneratedValue
    private Long id ;
    private String nom;
    private String prenom;
    private String email;
    private Long tel;
    private String post;
    @JsonManagedReference(value = "etud")
    @OneToMany(mappedBy = "encadrant",cascade = CascadeType.ALL,orphanRemoval=true)

    private Collection<etudiant> etudiants;
    @JsonBackReference(value = "encad")
    @ManyToOne(fetch = FetchType.LAZY,optional=true)
    @JoinColumn(name = "codeSociete" ,insertable = true,updatable = true)

    private societe societe;
    @JsonManagedReference(value = "stage1")
    @OneToMany(mappedBy = "encadrant",cascade = CascadeType.ALL,orphanRemoval=true)

    private Collection<stage> stages;

    public encadrant() {
    }

    public Collection<etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Collection<etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public org.sid.entities.societe getSociete() {
        return societe;
    }

    public void setSociete(org.sid.entities.societe societe) {
        this.societe = societe;
    }

    public Collection<stage> getStages() {
        return stages;
    }

    public void setStages(Collection<stage> stages) {
        this.stages = stages;
    }

    public encadrant(Long id, String nom, String prenom, String email, Long tel, String post, Collection<etudiant> etudiants, org.sid.entities.societe societe, Collection<stage> stages) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.post = post;
        this.etudiants = etudiants;
        this.societe = societe;
        this.stages = stages;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
