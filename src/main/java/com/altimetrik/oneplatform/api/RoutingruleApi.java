package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.RoutingruleApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Routingrule;

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
public class RoutingruleApi {

   @Autowired
   private RoutingruleApiService service;
  

  @RequestMapping(value = "/routingrule", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Routingrule>> findAllRoutingrule()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Routingrule>>(service.findAllRoutingrule(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/routingrule", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Routingrule> updateRoutingrule(@RequestBody Routingrule routingrule
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Routingrule>(service.updateRoutingrule(routingrule), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/routingrule", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Routingrule> addRoutingrule(@RequestBody Routingrule routingrule
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Routingrule>(service.addRoutingrule(routingrule), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/routingrule/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Routingrule> findByIdRoutingrule(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Routingrule>(service.findByIdRoutingrule(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/routingrule/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteRoutingrule(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteRoutingrule(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
