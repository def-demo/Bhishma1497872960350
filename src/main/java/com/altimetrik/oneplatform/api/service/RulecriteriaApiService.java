package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.model.Rulecriteria;

import com.altimetrik.oneplatform.exception.NotFoundException;
import java.util.List;
public interface RulecriteriaApiService {
  
      List<Rulecriteria> findAllRulecriteria()
      throws NotFoundException;
  
      Rulecriteria updateRulecriteria(Rulecriteria rulecriteria)
      throws NotFoundException;
  
      Rulecriteria addRulecriteria(Rulecriteria rulecriteria)
      throws NotFoundException;
  
      Rulecriteria findByIdRulecriteria(Integer id)
      throws NotFoundException;
  
      void deleteRulecriteria(Integer id)
      throws NotFoundException;
  
}
