package com.techmisal.forme.services;

import com.techmisal.forme.repository.CompanyRepository;
import java.util.List;
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

}
