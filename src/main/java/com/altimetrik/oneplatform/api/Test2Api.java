package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.Test2ApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )
public class Test2Api {

   @Autowired
   private Test2ApiService service;
  

  @RequestMapping(value = "/test2", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Test2>> findAllTest2()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Test2>>(service.findAllTest2(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/test2", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Test2> updateTest2(@RequestBody Test2 test2
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Test2>(service.updateTest2(test2), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/test2", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Test2> addTest2(@RequestBody Test2 test2
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Test2>(service.addTest2(test2), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/test2/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Test2> findByIdTest2(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Test2>(service.findByIdTest2(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/test2/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteTest2(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteTest2(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
