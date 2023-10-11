package tn.esprit.twin3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin3.entities.Chambre;
import tn.esprit.twin3.respositories.ChambreRepository;

import java.util.List;

@Service
public class ChambreService implements IChambreService{
    @Autowired
    private ChambreRepository repo;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return (repo.findAll().isEmpty()) ? null : repo.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return repo.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return repo.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return repo.findById(idChambre).orElse(null);
    }
}
