package com.kalai.profile.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Integer id;

    @Column(name = "p_title")
    private String title;

    @Column(name = "p_desc")
    private String description;

    @Column(name = "p_role")
    private String role;

    @Column(name = "p_responsibilities")
    private String responsibilities;

    @Column(name = "p_env")
    private String env;

    @Column(name = "p_image")
    private String image;

    @Column(name = "p_link")
    private String link;

    @Column(name = "p_is_free_lance")
    private Integer isFreelance;

    @Column(name = "p_period")
    private String period;

    @Column(name = "p_client")
    private  String client;

    @Column(name = "p_location")
    private String location;

    @Column(name = "p_created_date")
    private Date createdDate;

    @Column(name = "p_status")
    private Integer status;

    @Column(name = "c_id")
    private Integer companyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getIsFreelance() {
        return isFreelance;
    }

    public void setIsFreelance(Integer isFreelance) {
        this.isFreelance = isFreelance;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
