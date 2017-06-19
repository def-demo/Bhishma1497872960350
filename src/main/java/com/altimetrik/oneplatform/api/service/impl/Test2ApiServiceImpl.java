package com.altimetrik.oneplatform.api.service.impl;

import com.altimetrik.oneplatform.api.service.*;
import com.altimetrik.oneplatform.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.oneplatform.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.oneplatform.model.Test2;

import java.util.List;
import com.altimetrik.oneplatform.exception.NotFoundException;

@Service
@Transactional
public class Test2ApiServiceImpl implements Test2ApiService {
		  	  
	  @Autowired
	
  	  private Test2Repository  test2Repository ;
	   
  
  
				
			
      @Override
      public List<Test2> findAllTest2()
      throws NotFoundException {
      
        
  		
  		
  			return test2Repository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Test2 updateTest2(Test2 test2)
      throws NotFoundException {
      
         
        	return test2Repository.save(test2);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Test2 addTest2(Test2 test2)
      throws NotFoundException {
      
         
        	return test2Repository.save(test2);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Test2 findByIdTest2(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return test2Repository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteTest2(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}
