package com.kalai.profile.service;

import com.kalai.profile.model.Companies;
import com.kalai.profile.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

  @Autowired private CompanyRepository companyRepo;

  public Iterable<Companies> getAll() {
    return companyRepo.findAll();
  }

  public Iterable<Companies> add(Companies company) {
    companyRepo.save(company);

    return companyRepo.findAll();
  }

  public Iterable<Companies> delete(Integer id) {
    companyRepo.deleteById(id);
    return companyRepo.findAll();
  }

  public Iterable<Companies> update(Companies company) {
    companyRepo.save(company);
    return companyRepo.findAll();
  }
}
