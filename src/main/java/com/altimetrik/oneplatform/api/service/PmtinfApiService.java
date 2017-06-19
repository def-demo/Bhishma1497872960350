package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.model.Pmtinf;

import com.altimetrik.oneplatform.exception.NotFoundException;
import java.util.List;
public interface PmtinfApiService {
  
      List<Pmtinf> findAllPmtinf()
      throws NotFoundException;
  
      Pmtinf updatePmtinf(Pmtinf pmtinf)
      throws NotFoundException;
  
      Pmtinf addPmtinf(Pmtinf pmtinf)
      throws NotFoundException;
  
      Pmtinf findByIdPmtinf(Integer id)
      throws NotFoundException;
  
      void deletePmtinf(Integer id)
      throws NotFoundException;
  
}
