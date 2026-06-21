package com.prince.ApplicationManagementSystem.Repository;

import com.prince.ApplicationManagementSystem.Entity.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationCrudRepository extends CrudRepository<Applicant, Long> {
}
