package com.example.demo.company;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company")
    void blabla(){

        Company company = new Company();
        company.setName("comp");
        companyService.saveCompany(company);
    }


}
