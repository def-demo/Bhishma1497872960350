package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.model.Bankbranchmaster;

import com.altimetrik.oneplatform.exception.NotFoundException;
import java.util.List;
public interface BankbranchmasterApiService {
  
      List<Bankbranchmaster> findAllBankbranchmaster()
      throws NotFoundException;
  
      Bankbranchmaster updateBankbranchmaster(Bankbranchmaster bankbranchmaster)
      throws NotFoundException;
  
      Bankbranchmaster addBankbranchmaster(Bankbranchmaster bankbranchmaster)
      throws NotFoundException;
  
      Bankbranchmaster findByIdBankbranchmaster(Integer id)
      throws NotFoundException;
  
      void deleteBankbranchmaster(Integer id)
      throws NotFoundException;
  
}
