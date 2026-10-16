package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import tn.esprit.autoloc.Entities.Paiement;
import tn.esprit.autoloc.Repositories.PaiementRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
}