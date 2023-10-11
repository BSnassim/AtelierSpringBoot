package tn.esprit.twin3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin3.entities.Reservation;
import tn.esprit.twin3.respositories.ReservationRepository;

import java.util.List;

@Service
public class ReservationService implements IReservationService{
    @Autowired
    ReservationRepository repo;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return (repo.findAll().isEmpty()) ? null : repo.findAll();
    }

    @Override
    public Reservation addReservation(Reservation res) {
        return repo.save(res);
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return repo.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return repo.findById(idReservation).orElse(null);
    }
}
