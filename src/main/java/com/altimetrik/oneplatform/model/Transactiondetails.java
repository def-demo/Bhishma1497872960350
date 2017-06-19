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
public class Transactiondetails  {
  
  
   
   
  
  private Integer id = null;
  
   
  
  @Id
   
  
  private String transactionId = null;
  
   
   
  
  private String hdrFromFininstid = null;
  
   
   
  
  private String hdrToFininstid = null;
  
   
   
  
  private String hdrBussMesid = null;
  
   
   
  
  private String hdrMesDefid = null;
  
   
   
  
  private Date hdrCreationDate = null;
  
   
   
  
  private String msgId = null;
  
   
   
  
  private String msgFormat = null;
  
   
   
  
  private Date credttm = null;
  
   
   
  
  private String authstn = null;
  
   
   
  
  private String nboftxs = null;
  
   
   
  
  private Double ctrlsum = null;
  
   
   
  
  private String initgpty = null;
  
   
   
  
  private String payloadmessage = null;
  
   
   
  
  private String unifiedmessage = null;
  
   
   
  
  private String status = null;

  
  /**
   * {}
   **/
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * {"primaryKey":true}
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
  public String getHdrFromFininstid() {
    return hdrFromFininstid;
  }
  public void setHdrFromFininstid(String hdrFromFininstid) {
    this.hdrFromFininstid = hdrFromFininstid;
  }

  
  /**
   * {}
   **/
  public String getHdrToFininstid() {
    return hdrToFininstid;
  }
  public void setHdrToFininstid(String hdrToFininstid) {
    this.hdrToFininstid = hdrToFininstid;
  }

  
  /**
   * {}
   **/
  public String getHdrBussMesid() {
    return hdrBussMesid;
  }
  public void setHdrBussMesid(String hdrBussMesid) {
    this.hdrBussMesid = hdrBussMesid;
  }

  
  /**
   * {}
   **/
  public String getHdrMesDefid() {
    return hdrMesDefid;
  }
  public void setHdrMesDefid(String hdrMesDefid) {
    this.hdrMesDefid = hdrMesDefid;
  }

  
  /**
   * {}
   **/
  public Date getHdrCreationDate() {
    return hdrCreationDate;
  }
  public void setHdrCreationDate(Date hdrCreationDate) {
    this.hdrCreationDate = hdrCreationDate;
  }

  
  /**
   * {}
   **/
  public String getMsgId() {
    return msgId;
  }
  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }

  
  /**
   * {}
   **/
  public String getMsgFormat() {
    return msgFormat;
  }
  public void setMsgFormat(String msgFormat) {
    this.msgFormat = msgFormat;
  }

  
  /**
   * {}
   **/
  public Date getCredttm() {
    return credttm;
  }
  public void setCredttm(Date credttm) {
    this.credttm = credttm;
  }

  
  /**
   * {}
   **/
  public String getAuthstn() {
    return authstn;
  }
  public void setAuthstn(String authstn) {
    this.authstn = authstn;
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
  public String getInitgpty() {
    return initgpty;
  }
  public void setInitgpty(String initgpty) {
    this.initgpty = initgpty;
  }

  
  /**
   * {}
   **/
  public String getPayloadmessage() {
    return payloadmessage;
  }
  public void setPayloadmessage(String payloadmessage) {
    this.payloadmessage = payloadmessage;
  }

  
  /**
   * {}
   **/
  public String getUnifiedmessage() {
    return unifiedmessage;
  }
  public void setUnifiedmessage(String unifiedmessage) {
    this.unifiedmessage = unifiedmessage;
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
    Transactiondetails transactiondetails = (Transactiondetails) o;
    return Objects.equals(id, transactiondetails.id) &&
        Objects.equals(transactionId, transactiondetails.transactionId) &&
        Objects.equals(hdrFromFininstid, transactiondetails.hdrFromFininstid) &&
        Objects.equals(hdrToFininstid, transactiondetails.hdrToFininstid) &&
        Objects.equals(hdrBussMesid, transactiondetails.hdrBussMesid) &&
        Objects.equals(hdrMesDefid, transactiondetails.hdrMesDefid) &&
        Objects.equals(hdrCreationDate, transactiondetails.hdrCreationDate) &&
        Objects.equals(msgId, transactiondetails.msgId) &&
        Objects.equals(msgFormat, transactiondetails.msgFormat) &&
        Objects.equals(credttm, transactiondetails.credttm) &&
        Objects.equals(authstn, transactiondetails.authstn) &&
        Objects.equals(nboftxs, transactiondetails.nboftxs) &&
        Objects.equals(ctrlsum, transactiondetails.ctrlsum) &&
        Objects.equals(initgpty, transactiondetails.initgpty) &&
        Objects.equals(payloadmessage, transactiondetails.payloadmessage) &&
        Objects.equals(unifiedmessage, transactiondetails.unifiedmessage) &&
        Objects.equals(status, transactiondetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionId, hdrFromFininstid, hdrToFininstid, hdrBussMesid, hdrMesDefid, hdrCreationDate, msgId, msgFormat, credttm, authstn, nboftxs, ctrlsum, initgpty, payloadmessage, unifiedmessage, status);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transactiondetails {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("  hdrFromFininstid: ").append(hdrFromFininstid).append("\n");
    sb.append("  hdrToFininstid: ").append(hdrToFininstid).append("\n");
    sb.append("  hdrBussMesid: ").append(hdrBussMesid).append("\n");
    sb.append("  hdrMesDefid: ").append(hdrMesDefid).append("\n");
    sb.append("  hdrCreationDate: ").append(hdrCreationDate).append("\n");
    sb.append("  msgId: ").append(msgId).append("\n");
    sb.append("  msgFormat: ").append(msgFormat).append("\n");
    sb.append("  credttm: ").append(credttm).append("\n");
    sb.append("  authstn: ").append(authstn).append("\n");
    sb.append("  nboftxs: ").append(nboftxs).append("\n");
    sb.append("  ctrlsum: ").append(ctrlsum).append("\n");
    sb.append("  initgpty: ").append(initgpty).append("\n");
    sb.append("  payloadmessage: ").append(payloadmessage).append("\n");
    sb.append("  unifiedmessage: ").append(unifiedmessage).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

