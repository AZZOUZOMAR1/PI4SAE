package org.example.eventclub.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class PostClub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenu;
    private LocalDate datePost;
    private Long idAuteur;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;
}
