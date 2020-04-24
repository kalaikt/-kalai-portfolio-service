package com.kalai.profile.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Companies {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "c_id")
  private Integer cId;

  @Column(name = "c_name")
  private String companyName;

  @Column(name = "start_date")
  private Date start_date;

  @Column(name = "end_date")
  private Date end_date;

  @Column(name = "created_by")
  private Integer created_by;

  public Integer getcId() {
    return cId;
  }

  public void setcId(Integer cId) {
    this.cId = cId;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Date getStart_date() {
    return start_date;
  }

  public void setStart_date(Date start_date) {
    this.start_date = start_date;
  }

  public Date getEnd_date() {
    return end_date;
  }

  public void setEnd_date(Date end_date) {
    this.end_date = end_date;
  }

  public Integer getCreated_by() {
    return created_by;
  }

  public void setCreated_by(Integer created_by) {
    this.created_by = created_by;
  }
}
