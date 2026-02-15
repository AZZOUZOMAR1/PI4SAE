package org.example.eventclub.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class ReunionClub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private LocalTime heure;
    private String lieu;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;
}
