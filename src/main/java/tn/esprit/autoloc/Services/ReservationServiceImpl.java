package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Reservation;
import tn.esprit.autoloc.Repositories.ReservationRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service

@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservation {
    private final ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> recupererReservations() {
        return reservationRepository.findAll();
    }
    @Override
    public Reservation modifierReservation(Reservation reservation) {
        if (reservationRepository.existsById(reservation.getIdReservation())) {
            return reservationRepository.save(reservation);
        }
        throw new RuntimeException("Reservation introuvable avec l'id : " + reservation.getIdReservation());
    }

    @Override
    public Set<Reservation> findReservations() {
        return new HashSet<>(reservationRepository.findAll());
    }

    @Override
    public Reservation recupererReservationById(Long id) {
        return reservationRepository.findById(id).orElseThrow();
    }
}