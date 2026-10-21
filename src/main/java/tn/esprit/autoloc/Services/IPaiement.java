package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Paiement;

import java.util.List;
import java.util.Set;

public interface IPaiement {
    Paiement ajouterPaiement(Paiement paiement);
    void supprimerPaiement(Long id);
    Paiement modifierPaiement(Paiement paiement);
    List<Paiement> recupererPaiements();
    Set<Paiement> findPaiements();
    Paiement recupererPaiementById(Long id);
}