package com.example.rafrafadam.Repositories;

import com.example.rafrafadam.Entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<Company,Long> {

}
