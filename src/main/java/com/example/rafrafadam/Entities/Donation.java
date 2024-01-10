package com.example.rafrafadam.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Donation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donID;
    private float amount;
    private LocalDate date;
    @Enumerated(EnumType.STRING)

    private DonationType type;

    @ManyToOne
   @JsonIgnore
    private Employe employe;
}
