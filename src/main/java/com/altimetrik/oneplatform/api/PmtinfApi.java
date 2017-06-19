package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.api.service.PmtinfApiService;

import com.altimetrik.oneplatform.exception.NotFoundException;

import com.altimetrik.oneplatform.model.Pmtinf;

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
public class PmtinfApi {

   @Autowired
   private PmtinfApiService service;
  

  @RequestMapping(value = "/pmtinf", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Pmtinf>> findAllPmtinf()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Pmtinf>>(service.findAllPmtinf(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pmtinf", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Pmtinf> updatePmtinf(@RequestBody Pmtinf pmtinf
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Pmtinf>(service.updatePmtinf(pmtinf), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pmtinf", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Pmtinf> addPmtinf(@RequestBody Pmtinf pmtinf
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Pmtinf>(service.addPmtinf(pmtinf), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pmtinf/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Pmtinf> findByIdPmtinf(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Pmtinf>(service.findByIdPmtinf(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pmtinf/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePmtinf(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deletePmtinf(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
