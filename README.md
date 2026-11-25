# MBOA Electronic Shop

Application e-commerce de vente de produits électroniques.

## Structure

- `backend/` : API Spring Boot (Java, Spring Data JPA, MySQL)
- `frontend/` : à venir

## Avancement du backend

- [x] Entités (Produit, Catégorie, Panier, LignePanier, LigneCommande, Avis)
- [x] Repository
- [x] Services
- [ ] Contrôleurs
- [ ] DTO
- [ ] Validation et gestion des erreurs

## Lancer le backend

Prérequis : Java, MySQL avec une base `mboaelectronicshop`.

```bash
cd backend
./mvnw spring-boot:run
```

L'API démarre sur le port `8081`.
