package org.example.eventclub.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private String type;

    private LocalDate date;
    private LocalTime heure;
    private String lieu;
    private Integer capacite;
    private String image;

    @Enumerated(EnumType.STRING)
    private EventStatus status;

    @OneToMany(mappedBy = "evenement", cascade = CascadeType.ALL)
    private List<InscriptionEvenement> inscriptions;
}
