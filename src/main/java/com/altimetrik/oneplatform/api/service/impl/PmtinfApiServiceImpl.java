package com.altimetrik.oneplatform.api.service.impl;

import com.altimetrik.oneplatform.api.service.*;
import com.altimetrik.oneplatform.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.oneplatform.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.oneplatform.model.Pmtinf;

import java.util.List;
import com.altimetrik.oneplatform.exception.NotFoundException;

@Service
@Transactional
public class PmtinfApiServiceImpl implements PmtinfApiService {
		  	  
	  @Autowired
	
  	  private PmtinfRepository  pmtinfRepository ;
	   
  
  
				
			
      @Override
      public List<Pmtinf> findAllPmtinf()
      throws NotFoundException {
      
        
  		
  		
  			return pmtinfRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Pmtinf updatePmtinf(Pmtinf pmtinf)
      throws NotFoundException {
      
         
        	return pmtinfRepository.save(pmtinf);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Pmtinf addPmtinf(Pmtinf pmtinf)
      throws NotFoundException {
      
         
        	return pmtinfRepository.save(pmtinf);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Pmtinf findByIdPmtinf(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pmtinfRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePmtinf(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}
