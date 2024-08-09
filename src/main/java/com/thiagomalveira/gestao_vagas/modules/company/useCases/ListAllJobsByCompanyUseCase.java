package com.thiagomalveira.gestao_vagas.modules.company.useCases;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagomalveira.gestao_vagas.modules.company.entities.JobEntity;
import com.thiagomalveira.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class ListAllJobsByCompanyUseCase {

    @Autowired
    private JobRepository jobRepository;

    public List<JobEntity> execute(UUID companyId){
        return this.jobRepository.findByCompanyId(companyId);
    }

}