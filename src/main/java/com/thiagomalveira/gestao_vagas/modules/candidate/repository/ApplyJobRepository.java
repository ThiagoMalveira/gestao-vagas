package com.thiagomalveira.gestao_vagas.modules.candidate.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomalveira.gestao_vagas.modules.candidate.entities.ApplyJobEntity;


public interface ApplyJobRepository extends JpaRepository<ApplyJobEntity, UUID> {
    
}

