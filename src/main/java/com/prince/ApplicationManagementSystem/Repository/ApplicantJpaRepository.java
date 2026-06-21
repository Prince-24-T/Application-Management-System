package com.prince.ApplicationManagementSystem.Repository;

import com.prince.ApplicationManagementSystem.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ApplicantJpaRepository extends JpaRepository<Applicant , Long> {

   List<Applicant> findByStatus(String status);
   List<Applicant> findByNameAndStatus(String name, String status);

   @Query("Select a from Applicant a where a.name like %:name% ")
   List<Applicant> findApplicantByPartialName(@Param("name") String name);
}
