package org.example.eventclub.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private String type;
    private String image;
    private String statut;
    private LocalDate dateCreation;

    private Long idResponsable;

    @OneToMany(mappedBy = "club", cascade = CascadeType.ALL)
    private List<ReunionClub> reunions;

    @OneToMany(mappedBy = "club", cascade = CascadeType.ALL)
    private List<PostClub> posts;

}
