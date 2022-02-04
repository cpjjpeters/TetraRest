package com.example.tetra.TetraRestDemo.service;

import com.example.tetra.TetraRestDemo.model.Audit;
import com.example.tetra.TetraRestDemo.repo.AuditRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AuditService {
    private final AuditRepository auditRepository;

    public AuditService(AuditRepository auditRepository) {
        this.auditRepository = auditRepository;
    }
    public List<Audit> findAllAudits(){
        return this.auditRepository.findAll();
    }
}
