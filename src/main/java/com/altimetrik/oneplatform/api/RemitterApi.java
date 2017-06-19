package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.RemitterApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Remitter;

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
public class RemitterApi {

   @Autowired
   private RemitterApiService service;
  

  @RequestMapping(value = "/remitter", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Remitter>> findAllRemitter()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Remitter>>(service.findAllRemitter(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/remitter", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Remitter> updateRemitter(@RequestBody Remitter remitter
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Remitter>(service.updateRemitter(remitter), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/remitter", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Remitter> addRemitter(@RequestBody Remitter remitter
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Remitter>(service.addRemitter(remitter), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/remitter/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Remitter> findByIdRemitter(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Remitter>(service.findByIdRemitter(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/remitter/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteRemitter(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteRemitter(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
