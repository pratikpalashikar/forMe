package com.techmisal.forme.services;

import com.techmisal.forme.databaseModels.Companies;
import com.techmisal.forme.models.response.CompaniesResponse;
import com.techmisal.forme.repository.CompanyRepository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;
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

  public boolean addCompany(List<CompaniesResponse> companies) {

    for(CompaniesResponse company : companies) {
      Long timeVar = new Date().getTime();
      com.techmisal.forme.databaseModels.Companies companiesData =
          new com.techmisal.forme.databaseModels.Companies();
      companiesData.setCompanyName(company.getCompanyName());
      companiesData.setResult(company.getResult());
      companiesData.setStatus(company.getStatus());
      companiesData.setCreatedBy("Pratik");
      companiesData.setUpdatedBy("Pratik");
      companiesData.setId(UUID.randomUUID());
      companiesData.setCreateTs(new Timestamp(timeVar));
      com.techmisal.forme.databaseModels.Companies result = companyRepository.save(companiesData);
      if (result == null) return false;
    }
    return true;
  }

  public boolean modifyCompany(UUID id, CompaniesResponse company) {
    Optional<Companies> res = companyRepository.findById(id);
    if(res.isPresent()){
      Companies updateCompany = new Companies();
      updateCompany.setUpdatedBy(res.get().getUpdatedBy());
      updateCompany.setId(id);
      updateCompany.setStatus(company.getStatus());
      updateCompany.setResult(company.getResult());
      updateCompany.setCompanyName(res.get().getCompanyName());
      updateCompany.setCreateTs(res.get().getCreateTs());
      updateCompany.setCreatedBy(res.get().getCreatedBy());
      companyRepository.save(updateCompany);
      return true;
    }
    return false;
  }

  public Optional<Companies> getSpecificCompany(UUID id) {
    return companyRepository.findById(id);
  }
}
