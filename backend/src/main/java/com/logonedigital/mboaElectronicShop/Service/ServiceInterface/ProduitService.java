package com.logonedigital.mboaElectronicShop.Service.ServiceInterface;

import com.logonedigital.mboaElectronicShop.Entity.Produit;

import java.util.List;

public interface ProduitService {
    Produit addProduit(Produit produit);
    Produit updateProduit(Produit produit);
    List<Produit> getProduits();
    void deleteById(Integer idProduit);
}
