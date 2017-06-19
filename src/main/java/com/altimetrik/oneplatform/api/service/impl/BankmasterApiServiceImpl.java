package com.altimetrik.oneplatform.api.service.impl;

import com.altimetrik.oneplatform.api.service.*;
import com.altimetrik.oneplatform.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.oneplatform.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.oneplatform.model.Bankmaster;

import java.util.List;
import com.altimetrik.oneplatform.exception.NotFoundException;

@Service
@Transactional
public class BankmasterApiServiceImpl implements BankmasterApiService {
		  	  
	  @Autowired
	
  	  private BankmasterRepository  bankmasterRepository ;
	   
  
  
				
			
      @Override
      public List<Bankmaster> findAllBankmaster()
      throws NotFoundException {
      
        
  		
  		
  			return bankmasterRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Bankmaster updateBankmaster(Bankmaster bankmaster)
      throws NotFoundException {
      
         
        	return bankmasterRepository.save(bankmaster);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Bankmaster addBankmaster(Bankmaster bankmaster)
      throws NotFoundException {
      
         
        	return bankmasterRepository.save(bankmaster);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Bankmaster findByIdBankmaster(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return bankmasterRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteBankmaster(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}
