package com.example.demo.company;

import com.example.demo.Adress;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    CompanyService companyService;


    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company")
    public void blabla(){
        Adress adress = new Adress("fsdgs",32555,"fsdfsdgg", "gfsdgfdshdfh");
        Company company = new Company();
        company.setName("comp");
        company.setAdress(adress);
        companyService.saveCompany(company);
    }

}
