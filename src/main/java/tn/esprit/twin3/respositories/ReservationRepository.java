package tn.esprit.twin3.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin3.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
}
