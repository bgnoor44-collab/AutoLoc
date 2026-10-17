package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Maintenance;
import tn.esprit.autoloc.Repositories.MaintenanceRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service

@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenance {
    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void supprimerMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> recupererMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Set<Maintenance> findMaintenances() {
        return new HashSet<>(maintenanceRepository.findAll());
    }

    @Override
    public Maintenance recupererMaintenanceById(Long id) {
        return maintenanceRepository.findById(id).orElseThrow();
    }
}