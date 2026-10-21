package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Repositories.AgenceRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service

@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgence{
    private final AgenceRepository agenceRepository;
    @Override
    public Agence ajouterAgence(Agence client) {
        return agenceRepository.save(client);
    }

    @Override
    public void supprimerAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> recupererAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Set<Agence> findAgence() {
        return new HashSet<>(agenceRepository.findAll());
    }

    @Override
    public Agence recupererAgenceByid(Long id) {
        return agenceRepository.findById(id).orElseThrow();
    }
    @Override
    public Agence modifierAgence(Agence agence) {
        if (agenceRepository.existsById(agence.getIdAgence())) {
            return agenceRepository.save(agence);
        }
        throw new RuntimeException("Agence introuvable avec l'id : " + agence.getIdAgence());
    }
}
