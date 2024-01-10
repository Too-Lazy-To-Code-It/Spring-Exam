package com.example.rafrafadam.Repositories;

import com.example.rafrafadam.Entities.Company;
import com.example.rafrafadam.Entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepo extends JpaRepository<Employe,Long> {

}
