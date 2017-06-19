package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.model.Transactiondetails;

import com.altimetrik.oneplatform.exception.NotFoundException;
import java.util.List;
public interface TransactiondetailsApiService {
  
      List<Transactiondetails> findAllTransactiondetails()
      throws NotFoundException;
  
      Transactiondetails updateTransactiondetails(Transactiondetails transactiondetails)
      throws NotFoundException;
  
      Transactiondetails addTransactiondetails(Transactiondetails transactiondetails)
      throws NotFoundException;
  
      Transactiondetails findByIdTransactiondetails(String id)
      throws NotFoundException;
  
      void deleteTransactiondetails(String id)
      throws NotFoundException;
  
}
