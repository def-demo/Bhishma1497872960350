package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.model.Exchangecondition;

import com.altimetrik.oneplatform.exception.NotFoundException;
import java.util.List;
public interface ExchangeconditionApiService {
  
      List<Exchangecondition> findAllExchangecondition()
      throws NotFoundException;
  
      Exchangecondition updateExchangecondition(Exchangecondition exchangecondition)
      throws NotFoundException;
  
      Exchangecondition addExchangecondition(Exchangecondition exchangecondition)
      throws NotFoundException;
  
      Exchangecondition findByIdExchangecondition(Integer id)
      throws NotFoundException;
  
      void deleteExchangecondition(Integer id)
      throws NotFoundException;
  
}
