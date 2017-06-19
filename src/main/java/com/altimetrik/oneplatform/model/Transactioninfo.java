package com.altimetrik.oneplatform.model;

import com.altimetrik.oneplatform.model.Pmtinf;


import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;




@Entity
public class Transactioninfo  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private Integer txinfid = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "pmtinfid", insertable=false, updatable=false) 
  
  private Pmtinf pmtinf = null;
  
   
   
  
  private String crdrind = null;
  
   
   
  
  private String endtoendid = null;
  
   
   
  
  private Double instdamt = null;
  
   
   
  
  private String crdragt = null;
  
   
   
  
  private String crdragtacct = null;
  
   
   
  
  private String crdrname = null;
  
   
   
  
  private String mobnm = null;
  
   
   
  
  private String emailadr = null;
  
   
   
  
  private String crdracct = null;
  
   
   
  
  private String status = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public Integer getTxinfid() {
    return txinfid;
  }
  public void setTxinfid(Integer txinfid) {
    this.txinfid = txinfid;
  }

  
  /**
   * {"foreignKeyColumn":"pmtinfid","relation":"OneToOne"}
   **/
  public Pmtinf getPmtinf() {
    return pmtinf;
  }
  public void setPmtinf(Pmtinf pmtinf) {
    this.pmtinf = pmtinf;
  }

  
  /**
   * {}
   **/
  public String getCrdrind() {
    return crdrind;
  }
  public void setCrdrind(String crdrind) {
    this.crdrind = crdrind;
  }

  
  /**
   * {}
   **/
  public String getEndtoendid() {
    return endtoendid;
  }
  public void setEndtoendid(String endtoendid) {
    this.endtoendid = endtoendid;
  }

  
  /**
   * {}
   **/
  public Double getInstdamt() {
    return instdamt;
  }
  public void setInstdamt(Double instdamt) {
    this.instdamt = instdamt;
  }

  
  /**
   * {}
   **/
  public String getCrdragt() {
    return crdragt;
  }
  public void setCrdragt(String crdragt) {
    this.crdragt = crdragt;
  }

  
  /**
   * {}
   **/
  public String getCrdragtacct() {
    return crdragtacct;
  }
  public void setCrdragtacct(String crdragtacct) {
    this.crdragtacct = crdragtacct;
  }

  
  /**
   * {}
   **/
  public String getCrdrname() {
    return crdrname;
  }
  public void setCrdrname(String crdrname) {
    this.crdrname = crdrname;
  }

  
  /**
   * {}
   **/
  public String getMobnm() {
    return mobnm;
  }
  public void setMobnm(String mobnm) {
    this.mobnm = mobnm;
  }

  
  /**
   * {}
   **/
  public String getEmailadr() {
    return emailadr;
  }
  public void setEmailadr(String emailadr) {
    this.emailadr = emailadr;
  }

  
  /**
   * {}
   **/
  public String getCrdracct() {
    return crdracct;
  }
  public void setCrdracct(String crdracct) {
    this.crdracct = crdracct;
  }

  
  /**
   * {}
   **/
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transactioninfo transactioninfo = (Transactioninfo) o;
    return Objects.equals(id, transactioninfo.id) &&
        Objects.equals(txinfid, transactioninfo.txinfid) &&
        Objects.equals(pmtinf, transactioninfo.pmtinf) &&
        Objects.equals(crdrind, transactioninfo.crdrind) &&
        Objects.equals(endtoendid, transactioninfo.endtoendid) &&
        Objects.equals(instdamt, transactioninfo.instdamt) &&
        Objects.equals(crdragt, transactioninfo.crdragt) &&
        Objects.equals(crdragtacct, transactioninfo.crdragtacct) &&
        Objects.equals(crdrname, transactioninfo.crdrname) &&
        Objects.equals(mobnm, transactioninfo.mobnm) &&
        Objects.equals(emailadr, transactioninfo.emailadr) &&
        Objects.equals(crdracct, transactioninfo.crdracct) &&
        Objects.equals(status, transactioninfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, txinfid, pmtinf, crdrind, endtoendid, instdamt, crdragt, crdragtacct, crdrname, mobnm, emailadr, crdracct, status);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transactioninfo {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  txinfid: ").append(txinfid).append("\n");
    sb.append("  pmtinf: ").append(pmtinf).append("\n");
    sb.append("  crdrind: ").append(crdrind).append("\n");
    sb.append("  endtoendid: ").append(endtoendid).append("\n");
    sb.append("  instdamt: ").append(instdamt).append("\n");
    sb.append("  crdragt: ").append(crdragt).append("\n");
    sb.append("  crdragtacct: ").append(crdragtacct).append("\n");
    sb.append("  crdrname: ").append(crdrname).append("\n");
    sb.append("  mobnm: ").append(mobnm).append("\n");
    sb.append("  emailadr: ").append(emailadr).append("\n");
    sb.append("  crdracct: ").append(crdracct).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

