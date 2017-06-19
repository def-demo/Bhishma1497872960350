package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.BankmasterApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Bankmaster;

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
public class BankmasterApi {

   @Autowired
   private BankmasterApiService service;
  

  @RequestMapping(value = "/bankmaster", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Bankmaster>> findAllBankmaster()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Bankmaster>>(service.findAllBankmaster(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankmaster", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Bankmaster> updateBankmaster(@RequestBody Bankmaster bankmaster
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Bankmaster>(service.updateBankmaster(bankmaster), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankmaster", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Bankmaster> addBankmaster(@RequestBody Bankmaster bankmaster
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Bankmaster>(service.addBankmaster(bankmaster), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankmaster/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Bankmaster> findByIdBankmaster(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Bankmaster>(service.findByIdBankmaster(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankmaster/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteBankmaster(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteBankmaster(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
