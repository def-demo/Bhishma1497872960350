package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.RulecriteriaApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Rulecriteria;

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
public class RulecriteriaApi {

   @Autowired
   private RulecriteriaApiService service;
  

  @RequestMapping(value = "/rulecriteria", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Rulecriteria>> findAllRulecriteria()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Rulecriteria>>(service.findAllRulecriteria(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/rulecriteria", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Rulecriteria> updateRulecriteria(@RequestBody Rulecriteria rulecriteria
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Rulecriteria>(service.updateRulecriteria(rulecriteria), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/rulecriteria", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Rulecriteria> addRulecriteria(@RequestBody Rulecriteria rulecriteria
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Rulecriteria>(service.addRulecriteria(rulecriteria), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/rulecriteria/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Rulecriteria> findByIdRulecriteria(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Rulecriteria>(service.findByIdRulecriteria(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/rulecriteria/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteRulecriteria(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteRulecriteria(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
