package com.kalai.profile.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Companies {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "c_id")
  private Integer cId;

  @Column(name = "c_name")
  private String companyName;

  @Column(name = "startDate")
  private Date startDate;

  @Column(name = "endDate")
  private Date endDate;

  @Column(name = "createdBy")
  private Integer createdBy;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "c_id", insertable = false, updatable = false)
  @Fetch(FetchMode.JOIN)
  private Set<Projects> projects;

  public Set<Projects> getProjects() {
    return projects;
  }

  public void setProjects(Set<Projects> projects) {
    this.projects = projects;
  }

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

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }
}
