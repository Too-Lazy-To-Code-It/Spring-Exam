package com.example.rafrafadam.Repositories;

import com.example.rafrafadam.Entities.Company;
import com.example.rafrafadam.Entities.Donation;
import com.example.rafrafadam.Entities.DonationType;
import com.example.rafrafadam.Entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Set;

@Repository
public interface DonationRepo extends JpaRepository<Donation,Long> {

    Set<Donation> getDonationsByTypeOrderByDate(DonationType Type);

    Long countDonationsByEmployeAndDate(Employe employe, Month localDate);
}
