package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.model.Beneficiary;

import com.altimetrik.oneplatform.exception.NotFoundException;
import java.util.List;
public interface BeneficiaryApiService {
  
      List<Beneficiary> findAllBeneficiary()
      throws NotFoundException;
  
      Beneficiary updateBeneficiary(Beneficiary beneficiary)
      throws NotFoundException;
  
      Beneficiary addBeneficiary(Beneficiary beneficiary)
      throws NotFoundException;
  
      Beneficiary findByIdBeneficiary(Long id)
      throws NotFoundException;
  
      void deleteBeneficiary(Long id)
      throws NotFoundException;
  
}
