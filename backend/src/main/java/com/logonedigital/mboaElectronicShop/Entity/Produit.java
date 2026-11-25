package com.logonedigital.mboaElectronicShop.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduit;
    private String nomProduit;
    private String description;
    private Double prix;
    private Integer qteStock;
    private String statut;

    @OneToMany
    private List<LignePanier> lignePaniers = new ArrayList<>();

    @OneToMany
    private List<LigneCommande> ligneCommandes = new ArrayList<>();

    @ManyToOne
    private Categorie categorie;
    public Produit() {
    }
    @OneToMany
    private List<Avis> avis = new ArrayList<>();

    public Produit(Integer idProduit, String nomProduit, String description, Double prix, Integer qteStock, String statut) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.description = description;
        this.prix = prix;
        this.qteStock = qteStock;
        this.statut = statut;
    }

    public Integer getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getQteStock() {
        return qteStock;
    }

    public void setQteStock(Integer qteStock) {
        this.qteStock = qteStock;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


}
