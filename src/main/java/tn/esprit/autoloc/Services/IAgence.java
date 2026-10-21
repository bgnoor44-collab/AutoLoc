package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Agence;

import java.util.List;
import java.util.Set;

public interface IAgence {
    Agence ajouterAgence(Agence agencet);
    void supprimerAgence(Long id);
    Agence modifierAgence(Agence agence);
    List<Agence> recupererAgences();
    Set<Agence> findAgence();
    Agence recupererAgenceByid(Long id);
}
