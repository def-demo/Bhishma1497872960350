package com.altimetrik.oneplatform.model;

import com.altimetrik.oneplatform.model.Transactiondetails;
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
public class Pmtinf  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private Integer pmtinfid = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "transaction_id", insertable=false, updatable=false) 
  
  private Transactiondetails transactiondetails = null;
  
   
   
  
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
   * {"foreignKeyColumn":"transaction_id","relation":"OneToOne"}
   **/
  public Transactiondetails getTransactiondetails() {
    return transactiondetails;
  }
  public void setTransactiondetails(Transactiondetails transactiondetails) {
    this.transactiondetails = transactiondetails;
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
    Pmtinf pmtinf = (Pmtinf) o;
    return Objects.equals(id, pmtinf.id) &&
        Objects.equals(pmtinfid, pmtinf.pmtinfid) &&
        Objects.equals(transactiondetails, pmtinf.transactiondetails) &&
        Objects.equals(pmtmtd, pmtinf.pmtmtd) &&
        Objects.equals(btchbookg, pmtinf.btchbookg) &&
        Objects.equals(nboftxs, pmtinf.nboftxs) &&
        Objects.equals(ctrlsum, pmtinf.ctrlsum) &&
        Objects.equals(instrprty, pmtinf.instrprty) &&
        Objects.equals(svclvl, pmtinf.svclvl) &&
        Objects.equals(reqdexctnorcolldt, pmtinf.reqdexctnorcolldt) &&
        Objects.equals(paymenttype, pmtinf.paymenttype) &&
        Objects.equals(crdrname, pmtinf.crdrname) &&
        Objects.equals(crdrmobnm, pmtinf.crdrmobnm) &&
        Objects.equals(crdremailadr, pmtinf.crdremailadr) &&
        Objects.equals(crdracct, pmtinf.crdracct) &&
        Objects.equals(crdragt, pmtinf.crdragt) &&
        Objects.equals(crdragtacct, pmtinf.crdragtacct) &&
        Objects.equals(ruleId, pmtinf.ruleId) &&
        Objects.equals(submissiontime, pmtinf.submissiontime) &&
        Objects.equals(status, pmtinf.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pmtinfid, transactiondetails, pmtmtd, btchbookg, nboftxs, ctrlsum, instrprty, svclvl, reqdexctnorcolldt, paymenttype, crdrname, crdrmobnm, crdremailadr, crdracct, crdragt, crdragtacct, ruleId, submissiontime, status);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pmtinf {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  pmtinfid: ").append(pmtinfid).append("\n");
    sb.append("  transactiondetails: ").append(transactiondetails).append("\n");
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

