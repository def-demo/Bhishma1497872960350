package com.altimetrik.oneplatform.model.repository;

import com.altimetrik.oneplatform.model.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TestRepository extends JpaRepository<Test, Integer>{

}



