package com.prince.ApplicationManagementSystem.Repository;

import com.prince.ApplicationManagementSystem.Entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
