package com.logonedigital.mboaElectronicShop.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Avis {
    @Id
    @GeneratedValue
    private Integer idAvis;
    private Integer note;
    private String commentaire;

@ManyToOne
    private Produit produit;
    public Avis() {
    }

    public Avis(Integer idAvis, Integer note, String commentaire) {
        this.idAvis = idAvis;
        this.note = note;
        this.commentaire = commentaire;
    }

    public Integer getIdAvis() {
        return idAvis;
    }

    public void setIdAvis(Integer idAvis) {
        this.idAvis = idAvis;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
