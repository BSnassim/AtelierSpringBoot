package tn.esprit.twin3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Foyer {
    @Id
    @Generated
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne
    @JoinColumn(name = "universite_id",referencedColumnName = "idUniversite")
    private Universite universite;
}
