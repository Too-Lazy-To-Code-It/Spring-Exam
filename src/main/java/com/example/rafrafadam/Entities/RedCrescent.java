package com.example.rafrafadam.Entities;

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
public class RedCrescent  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long redCID;

    private String area;

    @OneToMany
    List<Donation>donationList;


}
