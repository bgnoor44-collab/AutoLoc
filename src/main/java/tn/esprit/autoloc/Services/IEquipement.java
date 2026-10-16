package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Equipement;

import java.util.List;
import java.util.Set;

public interface IEquipement {
    Equipement ajouterEquipement(Equipement equipement);
    void supprimerEquipement(Long id);

    List<Equipement> recupererEquipements();
    Set<Equipement> findEquipements();
    Equipement recupererEquipementById(Long id);
}