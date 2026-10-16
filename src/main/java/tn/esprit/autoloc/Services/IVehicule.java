package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Vehicule;

import java.util.List;
import java.util.Set;

public interface IVehicule {
    Vehicule ajouterVehicule(Vehicule vehicule);
    void supprimerVehicule(Long id);

    List<Vehicule> recupererVehicules();
    Set<Vehicule> findVehicules();
    Vehicule recupererVehiculeById(Long id);
}