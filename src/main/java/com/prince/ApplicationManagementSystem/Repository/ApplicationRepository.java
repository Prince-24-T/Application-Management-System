package com.prince.ApplicationManagementSystem.Repository;

import com.prince.ApplicationManagementSystem.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application , Long> {
}
