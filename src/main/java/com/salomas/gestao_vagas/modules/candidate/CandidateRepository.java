package com.salomas.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateRepository, UUID> {

  
}
