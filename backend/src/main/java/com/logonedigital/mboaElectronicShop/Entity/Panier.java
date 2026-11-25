package com.logonedigital.mboaElectronicShop.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPanier;
    private LocalDateTime dateCreation;

    @OneToMany
    private List<LignePanier> lignePaniers = new ArrayList<>();

    public Panier() {
    }

    public Panier(Integer idPanier, LocalDateTime dateCreation) {
        this.idPanier = idPanier;
        this.dateCreation = dateCreation;
    }

    public Integer getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(Integer idPanier) {
        this.idPanier = idPanier;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }







}
