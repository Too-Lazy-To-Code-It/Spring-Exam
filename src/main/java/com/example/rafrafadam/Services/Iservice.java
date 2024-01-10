package com.example.rafrafadam.Services;

import com.example.rafrafadam.Entities.Company;
import com.example.rafrafadam.Entities.Donation;
import com.example.rafrafadam.Entities.DonationType;
import com.example.rafrafadam.Entities.Employe;

import java.util.List;
import java.util.Set;

public interface Iservice {

    public Company AddComapny(Company company);

    public Employe addEmployeAndAssignToCompany(Employe employe,String campanyName);

    public Donation addDonation(Donation donation);

    public Set<Donation>getDonationsByType(DonationType type);

    public void getEmployeByDonation();

    public List<Employe> getEmployeByArea(String CompanyName, String Area);
}
