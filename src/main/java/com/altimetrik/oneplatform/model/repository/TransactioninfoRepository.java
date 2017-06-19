package com.altimetrik.oneplatform.model.repository;

import com.altimetrik.oneplatform.model.*;

import com.altimetrik.oneplatform.model.Pmtinf;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TransactioninfoRepository extends JpaRepository<Transactioninfo, Integer>{

}



