package com.prince.ApplicationManagementSystem.Repository;

import com.prince.ApplicationManagementSystem.Entity.Applicant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationPaggingSortingRepo extends PagingAndSortingRepository<Applicant , Long> {
}
