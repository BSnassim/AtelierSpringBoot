package tn.esprit.twin3.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.twin3.entities.Universite;
import tn.esprit.twin3.services.IUniversiteService;

import java.util.List;

@RequestMapping("/universite")
@RestController
public class UniversiteEndpoint {
    @Autowired
    private IUniversiteService service;

    @GetMapping("")
    public List<Universite> findAllArticles() {
        return service.retrieveAllUniversities();
    }
}
