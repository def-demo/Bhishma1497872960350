package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.model.Test;

import com.altimetrik.oneplatform.exception.NotFoundException;
import java.util.List;
public interface TestApiService {
  
      List<Test> findAllTest()
      throws NotFoundException;
  
      Test updateTest(Test test)
      throws NotFoundException;
  
      Test addTest(Test test)
      throws NotFoundException;
  
      Test findByIdTest(Integer id)
      throws NotFoundException;
  
      void deleteTest(Integer id)
      throws NotFoundException;
  
}
