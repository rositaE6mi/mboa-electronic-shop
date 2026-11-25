package com.logonedigital.mboaElectronicShop.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLigneCommande;
    private Integer quantite;
    private Double prixUnitaire;
    private Double sousTotal;

    public LigneCommande() {
    }

    public LigneCommande(Integer idLigneCommande, Integer quantite, Double prixUnitaire, Double sousTotal) {
        this.idLigneCommande = idLigneCommande;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.sousTotal = sousTotal;
    }

    public Integer getIdLigneCommande() {
        return idLigneCommande;
    }

    public void setIdLigneCommande(Integer idLigneCommande) {
        this.idLigneCommande = idLigneCommande;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Double getSousTotal() {
        return sousTotal;
    }

    public void setSousTotal(Double sousTotal) {
        this.sousTotal = sousTotal;
    }
}
