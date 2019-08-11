package com.techmisal.forme.databaseModels;

import java.util.Date;
import java.util.UUID;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("companies")
public class Companies {

  @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
  private UUID id;

  @Column("company_name")
  private String CompanyName;

  @Column("status")
  private String status;

  @Column("result")
  private String result;

  @Column("created_by")
  private String createdBy;

  @Column("updated_by")
  private String updatedBy;

  @Column("create_ts")
  private Date createTs;

  public UUID getId() {
    return id;
  }

  public String getCompanyName() {
    return CompanyName;
  }

  public String getStatus() {
    return status;
  }

  public String getResult() {
    return result;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public Date getCreateTs() {
    return createTs;
  }
}
