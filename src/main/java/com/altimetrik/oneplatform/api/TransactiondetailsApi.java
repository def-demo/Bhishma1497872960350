package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.TransactiondetailsApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Transactiondetails;

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
public class TransactiondetailsApi {

   @Autowired
   private TransactiondetailsApiService service;
  

  @RequestMapping(value = "/transactiondetails", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Transactiondetails>> findAllTransactiondetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Transactiondetails>>(service.findAllTransactiondetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transactiondetails", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Transactiondetails> updateTransactiondetails(@RequestBody Transactiondetails transactiondetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Transactiondetails>(service.updateTransactiondetails(transactiondetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transactiondetails", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Transactiondetails> addTransactiondetails(@RequestBody Transactiondetails transactiondetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Transactiondetails>(service.addTransactiondetails(transactiondetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transactiondetails/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Transactiondetails> findByIdTransactiondetails(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Transactiondetails>(service.findByIdTransactiondetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transactiondetails/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteTransactiondetails(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deleteTransactiondetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
