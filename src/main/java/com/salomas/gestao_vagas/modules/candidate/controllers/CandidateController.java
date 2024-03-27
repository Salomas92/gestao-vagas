package com.salomas.gestao_vagas.modules.candidate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salomas.gestao_vagas.modules.candidate.CadidateEntity;
import com.salomas.gestao_vagas.modules.candidate.CandidateRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

  @Autowired
  private CandidateRepository candidateRepository;

  @PostMapping("/")
  public CadidateEntity create(@Valid @RequestBody CadidateEntity cadidateEntity){

    return this.candidateRepository.save(cadidateEntity);

  }
  
}
