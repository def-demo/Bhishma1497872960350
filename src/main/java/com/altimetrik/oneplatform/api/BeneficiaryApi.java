package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.BeneficiaryApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Beneficiary;

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
public class BeneficiaryApi {

   @Autowired
   private BeneficiaryApiService service;
  

  @RequestMapping(value = "/beneficiary", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Beneficiary>> findAllBeneficiary()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Beneficiary>>(service.findAllBeneficiary(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/beneficiary", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Beneficiary> updateBeneficiary(@RequestBody Beneficiary beneficiary
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Beneficiary>(service.updateBeneficiary(beneficiary), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/beneficiary", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Beneficiary> addBeneficiary(@RequestBody Beneficiary beneficiary
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Beneficiary>(service.addBeneficiary(beneficiary), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/beneficiary/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Beneficiary> findByIdBeneficiary(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Beneficiary>(service.findByIdBeneficiary(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/beneficiary/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteBeneficiary(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteBeneficiary(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
