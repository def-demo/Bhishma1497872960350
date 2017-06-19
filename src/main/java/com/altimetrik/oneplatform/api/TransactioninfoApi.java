package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.TransactioninfoApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Transactioninfo;

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
public class TransactioninfoApi {

   @Autowired
   private TransactioninfoApiService service;
  

  @RequestMapping(value = "/transactioninfo", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Transactioninfo>> findAllTransactioninfo()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Transactioninfo>>(service.findAllTransactioninfo(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transactioninfo", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Transactioninfo> updateTransactioninfo(@RequestBody Transactioninfo transactioninfo
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Transactioninfo>(service.updateTransactioninfo(transactioninfo), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transactioninfo", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Transactioninfo> addTransactioninfo(@RequestBody Transactioninfo transactioninfo
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Transactioninfo>(service.addTransactioninfo(transactioninfo), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transactioninfo/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Transactioninfo> findByIdTransactioninfo(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Transactioninfo>(service.findByIdTransactioninfo(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transactioninfo/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteTransactioninfo(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteTransactioninfo(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
