package tn.esprit.twin3.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;

    @Enumerated
    private TypeChambre typeC;

    @ManyToOne
    @JoinColumn(name="bloc_id", referencedColumnName = "idBloc")
    private Bloc bloc;

}
