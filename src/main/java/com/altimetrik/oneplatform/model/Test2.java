package com.altimetrik.oneplatform.model;

import java.util.Date;


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
public class Test2  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private Integer pmtinfid = null;
  
   
   
  
  private String transactionId = null;
  
   
   
  
  private String pmtmtd = null;
  
   
   
  
  private String btchbookg = null;
  
   
   
  
  private String nboftxs = null;
  
   
   
  
  private Double ctrlsum = null;
  
   
   
  
  private String instrprty = null;
  
   
   
  
  private String svclvl = null;
  
   
   
  
  private Date reqdexctnorcolldt = null;
  
   
   
  
  private String paymenttype = null;
  
   
   
  
  private String crdrname = null;
  
   
   
  
  private String crdrmobnm = null;
  
   
   
  
  private String crdremailadr = null;
  
   
   
  
  private String crdracct = null;
  
   
   
  
  private String crdragt = null;
  
   
   
  
  private String crdragtacct = null;
  
   
   
  
  private Integer ruleId = null;
  
   
   
  
  private Date submissiontime = null;
  
   
   
  
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
  public Integer getPmtinfid() {
    return pmtinfid;
  }
  public void setPmtinfid(Integer pmtinfid) {
    this.pmtinfid = pmtinfid;
  }

  
  /**
   * {}
   **/
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   * {}
   **/
  public String getPmtmtd() {
    return pmtmtd;
  }
  public void setPmtmtd(String pmtmtd) {
    this.pmtmtd = pmtmtd;
  }

  
  /**
   * {}
   **/
  public String getBtchbookg() {
    return btchbookg;
  }
  public void setBtchbookg(String btchbookg) {
    this.btchbookg = btchbookg;
  }

  
  /**
   * {}
   **/
  public String getNboftxs() {
    return nboftxs;
  }
  public void setNboftxs(String nboftxs) {
    this.nboftxs = nboftxs;
  }

  
  /**
   * {}
   **/
  public Double getCtrlsum() {
    return ctrlsum;
  }
  public void setCtrlsum(Double ctrlsum) {
    this.ctrlsum = ctrlsum;
  }

  
  /**
   * {}
   **/
  public String getInstrprty() {
    return instrprty;
  }
  public void setInstrprty(String instrprty) {
    this.instrprty = instrprty;
  }

  
  /**
   * {}
   **/
  public String getSvclvl() {
    return svclvl;
  }
  public void setSvclvl(String svclvl) {
    this.svclvl = svclvl;
  }

  
  /**
   * {}
   **/
  public Date getReqdexctnorcolldt() {
    return reqdexctnorcolldt;
  }
  public void setReqdexctnorcolldt(Date reqdexctnorcolldt) {
    this.reqdexctnorcolldt = reqdexctnorcolldt;
  }

  
  /**
   * {}
   **/
  public String getPaymenttype() {
    return paymenttype;
  }
  public void setPaymenttype(String paymenttype) {
    this.paymenttype = paymenttype;
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
  public String getCrdrmobnm() {
    return crdrmobnm;
  }
  public void setCrdrmobnm(String crdrmobnm) {
    this.crdrmobnm = crdrmobnm;
  }

  
  /**
   * {}
   **/
  public String getCrdremailadr() {
    return crdremailadr;
  }
  public void setCrdremailadr(String crdremailadr) {
    this.crdremailadr = crdremailadr;
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
  public Integer getRuleId() {
    return ruleId;
  }
  public void setRuleId(Integer ruleId) {
    this.ruleId = ruleId;
  }

  
  /**
   * {}
   **/
  public Date getSubmissiontime() {
    return submissiontime;
  }
  public void setSubmissiontime(Date submissiontime) {
    this.submissiontime = submissiontime;
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
    Test2 test2 = (Test2) o;
    return Objects.equals(id, test2.id) &&
        Objects.equals(pmtinfid, test2.pmtinfid) &&
        Objects.equals(transactionId, test2.transactionId) &&
        Objects.equals(pmtmtd, test2.pmtmtd) &&
        Objects.equals(btchbookg, test2.btchbookg) &&
        Objects.equals(nboftxs, test2.nboftxs) &&
        Objects.equals(ctrlsum, test2.ctrlsum) &&
        Objects.equals(instrprty, test2.instrprty) &&
        Objects.equals(svclvl, test2.svclvl) &&
        Objects.equals(reqdexctnorcolldt, test2.reqdexctnorcolldt) &&
        Objects.equals(paymenttype, test2.paymenttype) &&
        Objects.equals(crdrname, test2.crdrname) &&
        Objects.equals(crdrmobnm, test2.crdrmobnm) &&
        Objects.equals(crdremailadr, test2.crdremailadr) &&
        Objects.equals(crdracct, test2.crdracct) &&
        Objects.equals(crdragt, test2.crdragt) &&
        Objects.equals(crdragtacct, test2.crdragtacct) &&
        Objects.equals(ruleId, test2.ruleId) &&
        Objects.equals(submissiontime, test2.submissiontime) &&
        Objects.equals(status, test2.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pmtinfid, transactionId, pmtmtd, btchbookg, nboftxs, ctrlsum, instrprty, svclvl, reqdexctnorcolldt, paymenttype, crdrname, crdrmobnm, crdremailadr, crdracct, crdragt, crdragtacct, ruleId, submissiontime, status);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Test2 {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  pmtinfid: ").append(pmtinfid).append("\n");
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("  pmtmtd: ").append(pmtmtd).append("\n");
    sb.append("  btchbookg: ").append(btchbookg).append("\n");
    sb.append("  nboftxs: ").append(nboftxs).append("\n");
    sb.append("  ctrlsum: ").append(ctrlsum).append("\n");
    sb.append("  instrprty: ").append(instrprty).append("\n");
    sb.append("  svclvl: ").append(svclvl).append("\n");
    sb.append("  reqdexctnorcolldt: ").append(reqdexctnorcolldt).append("\n");
    sb.append("  paymenttype: ").append(paymenttype).append("\n");
    sb.append("  crdrname: ").append(crdrname).append("\n");
    sb.append("  crdrmobnm: ").append(crdrmobnm).append("\n");
    sb.append("  crdremailadr: ").append(crdremailadr).append("\n");
    sb.append("  crdracct: ").append(crdracct).append("\n");
    sb.append("  crdragt: ").append(crdragt).append("\n");
    sb.append("  crdragtacct: ").append(crdragtacct).append("\n");
    sb.append("  ruleId: ").append(ruleId).append("\n");
    sb.append("  submissiontime: ").append(submissiontime).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

