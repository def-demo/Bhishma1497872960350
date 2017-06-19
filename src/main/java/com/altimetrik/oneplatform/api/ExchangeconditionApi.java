package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.ExchangeconditionApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Exchangecondition;

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
public class ExchangeconditionApi {

   @Autowired
   private ExchangeconditionApiService service;
  

  @RequestMapping(value = "/exchangecondition", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Exchangecondition>> findAllExchangecondition()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Exchangecondition>>(service.findAllExchangecondition(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/exchangecondition", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Exchangecondition> updateExchangecondition(@RequestBody Exchangecondition exchangecondition
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Exchangecondition>(service.updateExchangecondition(exchangecondition), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/exchangecondition", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Exchangecondition> addExchangecondition(@RequestBody Exchangecondition exchangecondition
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Exchangecondition>(service.addExchangecondition(exchangecondition), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/exchangecondition/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Exchangecondition> findByIdExchangecondition(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Exchangecondition>(service.findByIdExchangecondition(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/exchangecondition/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteExchangecondition(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteExchangecondition(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
