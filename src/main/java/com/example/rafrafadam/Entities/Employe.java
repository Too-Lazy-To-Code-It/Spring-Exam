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
public class Employe  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeID;

    private String lastName;
    private String firstName;
    private String position;

    @OneToMany(mappedBy = "employe")
    //@JsonIgnore
    List<Donation>donationList;

    @ManyToOne
    @JsonIgnore
    Company company;



}
