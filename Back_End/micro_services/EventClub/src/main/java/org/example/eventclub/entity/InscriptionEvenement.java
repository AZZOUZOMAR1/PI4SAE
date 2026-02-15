package org.example.eventclub.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class InscriptionEvenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idEtudiant;

    private LocalDate dateInscription;

    @ManyToOne
    @JoinColumn(name = "evenement_id")
    private Evenement evenement;
}
