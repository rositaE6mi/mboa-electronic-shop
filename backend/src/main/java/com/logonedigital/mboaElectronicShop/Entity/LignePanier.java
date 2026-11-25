package com.logonedigital.mboaElectronicShop.Entity;

import jakarta.persistence.*;

@Entity
public class LignePanier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLignePanier;
    private Integer quantitePanier;

    @ManyToOne
    private Panier panier;

    public LignePanier() {
    }

    public LignePanier(Integer idLignePanier, Integer quantitePanier) {
        this.idLignePanier = idLignePanier;
        this.quantitePanier = quantitePanier;
    }

    public Integer getIdLignePanier() {
        return idLignePanier;
    }

    public void setIdLignePanier(Integer idLignePanier) {
        this.idLignePanier = idLignePanier;
    }

    public Integer getQuantitePanier() {
        return quantitePanier;
    }

    public void setQuantitePanier(Integer quantitePanier) {
        this.quantitePanier = quantitePanier;
    }
}
