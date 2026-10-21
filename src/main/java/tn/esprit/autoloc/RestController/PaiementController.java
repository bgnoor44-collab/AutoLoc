package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Paiement;
import tn.esprit.autoloc.Services.IPaiement;

import java.util.List;

@RestController
@RequestMapping("/api/Paiement")
@RequiredArgsConstructor
public class PaiementController {

    private final IPaiement iPaiement;

    @PostMapping("/AddPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return iPaiement.ajouterPaiement(paiement);
    }

    @GetMapping("/GetALL")
    public List<Paiement> getAll() {
        return iPaiement.recupererPaiements();
    }

    @GetMapping("/GetPaiement/{id}")
    public Paiement getPaiement(@PathVariable Long id) {
        return iPaiement.recupererPaiementById(id);
    }

    @DeleteMapping("/DeletePaiement/{id}")
    public void deletePaiement(@PathVariable Long id) {
        iPaiement.supprimerPaiement(id);
    }

    @PutMapping("/UpdatePaiement")
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return iPaiement.modifierPaiement(paiement);
    }
}