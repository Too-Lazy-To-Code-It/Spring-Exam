package com.example.rafrafadam.Controllers;

import com.example.rafrafadam.Entities.Company;
import com.example.rafrafadam.Entities.Donation;
import com.example.rafrafadam.Entities.DonationType;
import com.example.rafrafadam.Entities.Employe;
import com.example.rafrafadam.Services.IserviceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
public class Controller {
    IserviceImpl service;

    @PostMapping("/AddCompany")
    public Company AddCompany(@RequestBody Company company){return service.AddComapny(company);}
    @PostMapping("/AddEmploye/{companyName}")
    public Employe addEmployeAndAssignToCompany(@RequestBody Employe employe,@PathVariable("companyName") String campanyName){return service.addEmployeAndAssignToCompany(employe,campanyName);}
    @PostMapping("/AddDonation")
    public Donation addDonation(@RequestBody Donation donation){return  service.addDonation(donation);}
    @GetMapping("/GetDonation/{type}")
    public Set<Donation> getDonationsByType(@PathVariable("type") DonationType type) {return service.getDonationsByType(type);}
    @GetMapping("/getEmploye")
    public List<Employe> getEmployeByArea(String CompanyName, String Area){return service.getEmployeByArea(CompanyName,Area);}


}
