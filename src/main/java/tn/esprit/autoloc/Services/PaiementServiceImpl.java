package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Paiement;
import tn.esprit.autoloc.Repositories.PaiementRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service

@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiement {
    private final PaiementRepository paiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void supprimerPaiement(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public List<Paiement> recupererPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Set<Paiement> findPaiements() {
        return new HashSet<>(paiementRepository.findAll());
    }

    @Override
    public Paiement recupererPaiementById(Long id) {
        return paiementRepository.findById(id).orElseThrow();
    }
    @Override
    public Paiement modifierPaiement(Paiement paiement) {
        if (paiementRepository.existsById(paiement.getIdPaiement())) {
            return paiementRepository.save(paiement);
        }
        throw new RuntimeException("Paiement introuvable avec l'id : " + paiement.getIdPaiement());
    }
}