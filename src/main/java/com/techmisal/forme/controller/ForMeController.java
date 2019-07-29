package com.techmisal.forme.controller;

import com.techmisal.forme.models.Companies;
import com.techmisal.forme.services.FeedMe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForMeController {

  @Autowired
  private FeedMe feedMe;

  //Get the list of Companies
  @GetMapping("/companies")
  public List<Companies> getCompaniesList(){

    List<Companies> listOfCompanies = this.feedMe.getComapnies();
    return listOfCompanies;

  }

}
