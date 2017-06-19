package com.altimetrik.oneplatform.api.service.impl;

import com.altimetrik.oneplatform.api.service.*;
import com.altimetrik.oneplatform.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.oneplatform.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.oneplatform.model.Exchangecondition;

import java.util.List;
import com.altimetrik.oneplatform.exception.NotFoundException;

@Service
@Transactional
public class ExchangeconditionApiServiceImpl implements ExchangeconditionApiService {
		  	  
	  @Autowired
	
  	  private ExchangeconditionRepository  exchangeconditionRepository ;
	   
  
  
				
			
      @Override
      public List<Exchangecondition> findAllExchangecondition()
      throws NotFoundException {
      
        
  		
  		
  			return exchangeconditionRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Exchangecondition updateExchangecondition(Exchangecondition exchangecondition)
      throws NotFoundException {
      
         
        	return exchangeconditionRepository.save(exchangecondition);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Exchangecondition addExchangecondition(Exchangecondition exchangecondition)
      throws NotFoundException {
      
         
        	return exchangeconditionRepository.save(exchangecondition);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Exchangecondition findByIdExchangecondition(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return exchangeconditionRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteExchangecondition(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}
