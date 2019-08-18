package com.techmisal.forme.controller;

import com.techmisal.forme.databaseModels.Companies;
import com.techmisal.forme.models.response.CompaniesResponse;
import com.techmisal.forme.services.FeedMe;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForMeController {

  @Autowired
  private FeedMe feedMe;

  /*
  * Get all the companies
  * */
  @GetMapping(value = "/companies", produces = "application/json")
  public ResponseEntity<List<Companies>> getCompaniesList(){
    List<com.techmisal.forme.databaseModels.Companies> listOfCompanies = this.feedMe.getComapnies();
    return new ResponseEntity<List<Companies>>(listOfCompanies, HttpStatus.OK);
  }


  @GetMapping(value = "/companies/{id}", produces = "application/json")
  public ResponseEntity<Optional<Companies>> getCompaniesList(@PathVariable(value = "id") UUID id){
    Optional<Companies> company = this.feedMe.getSpecificCompany(id);
    return new ResponseEntity<Optional<Companies>>(company, HttpStatus.OK);
  }


  /*
  * Add a new company
  * */
  @PostMapping(value = "/add-company")
  public boolean addCompany(@RequestBody List<CompaniesResponse> companies){
    return this.feedMe.addCompany(companies);
  }


  /*
  * Update a company
  * */
  @PutMapping(value = "/modify-company")
  public boolean modifyCompany(@RequestBody CompaniesResponse company){
    return this.feedMe.modifyCompany(company);
  }



}
