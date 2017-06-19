package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.BankbranchmasterApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Bankbranchmaster;

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
public class BankbranchmasterApi {

   @Autowired
   private BankbranchmasterApiService service;
  

  @RequestMapping(value = "/bankbranchmaster", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Bankbranchmaster>> findAllBankbranchmaster()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Bankbranchmaster>>(service.findAllBankbranchmaster(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankbranchmaster", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Bankbranchmaster> updateBankbranchmaster(@RequestBody Bankbranchmaster bankbranchmaster
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Bankbranchmaster>(service.updateBankbranchmaster(bankbranchmaster), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankbranchmaster", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Bankbranchmaster> addBankbranchmaster(@RequestBody Bankbranchmaster bankbranchmaster
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Bankbranchmaster>(service.addBankbranchmaster(bankbranchmaster), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankbranchmaster/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Bankbranchmaster> findByIdBankbranchmaster(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Bankbranchmaster>(service.findByIdBankbranchmaster(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankbranchmaster/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteBankbranchmaster(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteBankbranchmaster(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
