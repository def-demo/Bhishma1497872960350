package com.altimetrik.oneplatform.model;

import com.altimetrik.oneplatform.model.Routingrule;
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
public class Exchangecondition  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private Integer destinationPartnerId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "rule_id", insertable=false, updatable=false) 
  
  private Routingrule routingrule = null;
  
   
   
  
  private String destinationPartnerName = null;
  
   
   
  
  private String exchangeCondition = null;
  
   
   
  
  private Date submissionStarttime = null;
  
   
   
  
  private Date submissionEndtime = null;
  
   
   
  
  private String calendar = null;
  
   
   
  
  private String submissionFormat = null;
  
   
   
  
  private String serviceToInvoke = null;

  
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
  public Integer getDestinationPartnerId() {
    return destinationPartnerId;
  }
  public void setDestinationPartnerId(Integer destinationPartnerId) {
    this.destinationPartnerId = destinationPartnerId;
  }

  
  /**
   * {"foreignKeyColumn":"rule_id","relation":"OneToOne"}
   **/
  public Routingrule getRoutingrule() {
    return routingrule;
  }
  public void setRoutingrule(Routingrule routingrule) {
    this.routingrule = routingrule;
  }

  
  /**
   * {}
   **/
  public String getDestinationPartnerName() {
    return destinationPartnerName;
  }
  public void setDestinationPartnerName(String destinationPartnerName) {
    this.destinationPartnerName = destinationPartnerName;
  }

  
  /**
   * {}
   **/
  public String getExchangeCondition() {
    return exchangeCondition;
  }
  public void setExchangeCondition(String exchangeCondition) {
    this.exchangeCondition = exchangeCondition;
  }

  
  /**
   * {}
   **/
  public Date getSubmissionStarttime() {
    return submissionStarttime;
  }
  public void setSubmissionStarttime(Date submissionStarttime) {
    this.submissionStarttime = submissionStarttime;
  }

  
  /**
   * {}
   **/
  public Date getSubmissionEndtime() {
    return submissionEndtime;
  }
  public void setSubmissionEndtime(Date submissionEndtime) {
    this.submissionEndtime = submissionEndtime;
  }

  
  /**
   * {}
   **/
  public String getCalendar() {
    return calendar;
  }
  public void setCalendar(String calendar) {
    this.calendar = calendar;
  }

  
  /**
   * {}
   **/
  public String getSubmissionFormat() {
    return submissionFormat;
  }
  public void setSubmissionFormat(String submissionFormat) {
    this.submissionFormat = submissionFormat;
  }

  
  /**
   * {}
   **/
  public String getServiceToInvoke() {
    return serviceToInvoke;
  }
  public void setServiceToInvoke(String serviceToInvoke) {
    this.serviceToInvoke = serviceToInvoke;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exchangecondition exchangecondition = (Exchangecondition) o;
    return Objects.equals(id, exchangecondition.id) &&
        Objects.equals(destinationPartnerId, exchangecondition.destinationPartnerId) &&
        Objects.equals(routingrule, exchangecondition.routingrule) &&
        Objects.equals(destinationPartnerName, exchangecondition.destinationPartnerName) &&
        Objects.equals(exchangeCondition, exchangecondition.exchangeCondition) &&
        Objects.equals(submissionStarttime, exchangecondition.submissionStarttime) &&
        Objects.equals(submissionEndtime, exchangecondition.submissionEndtime) &&
        Objects.equals(calendar, exchangecondition.calendar) &&
        Objects.equals(submissionFormat, exchangecondition.submissionFormat) &&
        Objects.equals(serviceToInvoke, exchangecondition.serviceToInvoke);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, destinationPartnerId, routingrule, destinationPartnerName, exchangeCondition, submissionStarttime, submissionEndtime, calendar, submissionFormat, serviceToInvoke);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exchangecondition {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  destinationPartnerId: ").append(destinationPartnerId).append("\n");
    sb.append("  routingrule: ").append(routingrule).append("\n");
    sb.append("  destinationPartnerName: ").append(destinationPartnerName).append("\n");
    sb.append("  exchangeCondition: ").append(exchangeCondition).append("\n");
    sb.append("  submissionStarttime: ").append(submissionStarttime).append("\n");
    sb.append("  submissionEndtime: ").append(submissionEndtime).append("\n");
    sb.append("  calendar: ").append(calendar).append("\n");
    sb.append("  submissionFormat: ").append(submissionFormat).append("\n");
    sb.append("  serviceToInvoke: ").append(serviceToInvoke).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

