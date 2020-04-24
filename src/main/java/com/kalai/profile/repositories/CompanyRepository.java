package com.kalai.profile.repositories;

import com.kalai.profile.models.Companies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Companies, Integer> {}
