package tn.esprit.twin3.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin3.entities.Universite;
import tn.esprit.twin3.respositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor()
public class UniversiteService implements IUniversiteService{

    private UniversiteRepository repo;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return (repo.findAll().isEmpty()) ? null : repo.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return repo.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return repo.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        return repo.findById(idUniversity).orElse(null);
    }
}
