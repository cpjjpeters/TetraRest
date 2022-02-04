package com.example.tetra.TetraRestDemo.repo;

import com.example.tetra.TetraRestDemo.model.Audit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;


public interface AuditRepository extends JpaRepository<Audit, Long> {
}
