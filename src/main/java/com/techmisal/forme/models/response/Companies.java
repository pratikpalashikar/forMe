package com.techmisal.forme.models.response;

import java.util.UUID;

/*
  This class is used to render the ui model
 */
public class Companies {

  private String CompanyName;
  private String status;
  private String result;



  public String getCompanyName() {
    return CompanyName;
  }

  public void setCompanyName(String companyName) {
    CompanyName = companyName;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
