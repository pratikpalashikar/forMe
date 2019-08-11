package com.techmisal.forme.services;

import com.techmisal.forme.models.response.Companies;
import com.techmisal.forme.repository.CompanyRepository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedMe {

  @Autowired
  private CompanyRepository companyRepository;

  public List<com.techmisal.forme.databaseModels.Companies> getComapnies() {
    List<com.techmisal.forme.databaseModels.Companies> companies = companyRepository.findAll();
    return companies;
  }

  public boolean addCompany(Companies companies) {

    Long timeVar = new Date().getTime();
    com.techmisal.forme.databaseModels.Companies companiesData = new com.techmisal.forme.databaseModels.Companies();
    companiesData.setCompanyName(companies.getCompanyName());
    companiesData.setResult(companies.getResult());
    companiesData.setStatus(companies.getStatus());
    companiesData.setCreatedBy("Pratik");
    companiesData.setUpdatedBy("Pratik");
    companiesData.setId(UUID.randomUUID());
    companiesData.setCreateTs(new Timestamp(timeVar));
    com.techmisal.forme.databaseModels.Companies result = companyRepository.save(companiesData);
    if(result != null) return true;

    return false;
  }
}
