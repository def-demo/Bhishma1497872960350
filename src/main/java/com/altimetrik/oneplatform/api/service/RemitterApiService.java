package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.model.Remitter;

import com.altimetrik.oneplatform.exception.NotFoundException;
import java.util.List;
public interface RemitterApiService {
  
      List<Remitter> findAllRemitter()
      throws NotFoundException;
  
      Remitter updateRemitter(Remitter remitter)
      throws NotFoundException;
  
      Remitter addRemitter(Remitter remitter)
      throws NotFoundException;
  
      Remitter findByIdRemitter(Long id)
      throws NotFoundException;
  
      void deleteRemitter(Long id)
      throws NotFoundException;
  
}
