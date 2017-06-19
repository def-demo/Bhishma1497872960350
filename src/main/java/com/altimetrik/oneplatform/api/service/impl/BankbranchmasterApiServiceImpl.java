package com.altimetrik.oneplatform.api.service.impl;

import com.altimetrik.oneplatform.api.service.*;
import com.altimetrik.oneplatform.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.oneplatform.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.oneplatform.model.Bankbranchmaster;

import java.util.List;
import com.altimetrik.oneplatform.exception.NotFoundException;

@Service
@Transactional
public class BankbranchmasterApiServiceImpl implements BankbranchmasterApiService {
		  	  
	  @Autowired
	
  	  private BankbranchmasterRepository  bankbranchmasterRepository ;
	   
  
  
				
			
      @Override
      public List<Bankbranchmaster> findAllBankbranchmaster()
      throws NotFoundException {
      
        
  		
  		
  			return bankbranchmasterRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Bankbranchmaster updateBankbranchmaster(Bankbranchmaster bankbranchmaster)
      throws NotFoundException {
      
         
        	return bankbranchmasterRepository.save(bankbranchmaster);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Bankbranchmaster addBankbranchmaster(Bankbranchmaster bankbranchmaster)
      throws NotFoundException {
      
         
        	return bankbranchmasterRepository.save(bankbranchmaster);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Bankbranchmaster findByIdBankbranchmaster(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return bankbranchmasterRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteBankbranchmaster(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}
