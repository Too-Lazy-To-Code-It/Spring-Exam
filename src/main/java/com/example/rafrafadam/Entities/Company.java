package com.example.rafrafadam.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
public class Company  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long camapanyID;
    @NotNull
    private String campanyname;

    private String address;

    @OneToMany(mappedBy = "company")
    List<Employe>employeList;

}
