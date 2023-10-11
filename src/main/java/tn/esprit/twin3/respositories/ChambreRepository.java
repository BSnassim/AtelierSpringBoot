package tn.esprit.twin3.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin3.entities.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
