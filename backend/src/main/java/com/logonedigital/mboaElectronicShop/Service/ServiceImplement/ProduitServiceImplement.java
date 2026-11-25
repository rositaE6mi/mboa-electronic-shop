package com.logonedigital.mboaElectronicShop.Service.ServiceImplement;

import com.logonedigital.mboaElectronicShop.Entity.Produit;
import com.logonedigital.mboaElectronicShop.Repository.ProduitRepository;
import com.logonedigital.mboaElectronicShop.Service.ServiceInterface.ProduitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImplement implements ProduitService {

    private final ProduitRepository produitRepository;

    public ProduitServiceImplement(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> getProduits() {
        return produitRepository.findAll();
    }

    @Override
    public void deleteById(Integer idProduit) {
        produitRepository.deleteById(idProduit);
    }
}
