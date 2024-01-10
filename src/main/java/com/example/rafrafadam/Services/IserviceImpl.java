package com.example.rafrafadam.Services;

import com.example.rafrafadam.Entities.Company;
import com.example.rafrafadam.Entities.Donation;
import com.example.rafrafadam.Entities.DonationType;
import com.example.rafrafadam.Entities.Employe;
import com.example.rafrafadam.Repositories.ComapanyRepo;
import com.example.rafrafadam.Repositories.DonationRepo;
import com.example.rafrafadam.Repositories.EmployeRepo;
import com.example.rafrafadam.Repositories.TestRepo;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class IserviceImpl implements Iservice {
    ComapanyRepo comapanyRepo;
    EmployeRepo employeRepo;
    DonationRepo donationRepo;

    @Override
    public Company AddComapny(Company company) {
        return comapanyRepo.save(company);
    }

    @Override
    public Employe addEmployeAndAssignToCompany(Employe employe, String campanyName) {
        Company c = comapanyRepo.getCompanyByCampanyname(campanyName);
        employe.setCompany(c);
        return employeRepo.save(employe);

    }

    @Override
    public Donation addDonation(Donation donation) {

        if (!donation.getType().equals("MONETARY")) {
            if (donation.getAmount()==0)
                donation.setAmount(0);
        }
        return donationRepo.save(donation);
    }

    @Override
    public Set<Donation> getDonationsByType(DonationType type) {
        return donationRepo.getDonationsByTypeOrderByDate(type);
    }

    @Scheduled(cron = "*/5 * * * * *")
    @Override
    public void getEmployeByDonation() {
        LocalDate currentDate = LocalDate.now();
        Employe e=new Employe();
       List<Employe> employelist=employeRepo.findAll();
        for (Employe employe : employelist) {
            if(employe.getDonationList().size()>e.getDonationList().size())
                e=employe;

        }


    }

    @Override
    public List<Employe> getEmployeByArea(String CompanyName, String Area) {
        return null;
    }

}

