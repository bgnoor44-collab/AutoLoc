package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Maintenance;

import java.util.List;
import java.util.Set;

public interface IMaintenance {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    void supprimerMaintenance(Long id);
    Maintenance modifierMaintenance(Maintenance maintenance);
    List<Maintenance> recupererMaintenances();
    Set<Maintenance> findMaintenances();
    Maintenance recupererMaintenanceById(Long id);
}