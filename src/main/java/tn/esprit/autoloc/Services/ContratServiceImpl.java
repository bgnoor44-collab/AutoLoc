package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import tn.esprit.autoloc.Entities.Contrat;
import tn.esprit.autoloc.Repositories.ContratRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@RequiredArgsConstructor
public class ContratServiceImpl implements IContrat {
    private final ContratRepository contratRepository;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void supprimerContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> recupererContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Set<Contrat> findContrats() {
        return new HashSet<>(contratRepository.findAll());
    }

    @Override
    public Contrat recupererContratById(Long id) {
        return contratRepository.findById(id).orElseThrow();
    }
}