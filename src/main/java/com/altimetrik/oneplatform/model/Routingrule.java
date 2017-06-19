package com.altimetrik.oneplatform.model;



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
public class Routingrule  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private Integer ruleId = null;
  
   
   
  
  private Integer branchId = null;
  
   
   
  
  private Integer rcId = null;
  
   
   
  
  private Integer priority = null;
  
   
   
  
  private Integer destPartnerId = null;

  
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
  public Integer getRuleId() {
    return ruleId;
  }
  public void setRuleId(Integer ruleId) {
    this.ruleId = ruleId;
  }

  
  /**
   * {}
   **/
  public Integer getBranchId() {
    return branchId;
  }
  public void setBranchId(Integer branchId) {
    this.branchId = branchId;
  }

  
  /**
   * {}
   **/
  public Integer getRcId() {
    return rcId;
  }
  public void setRcId(Integer rcId) {
    this.rcId = rcId;
  }

  
  /**
   * {}
   **/
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   * {}
   **/
  public Integer getDestPartnerId() {
    return destPartnerId;
  }
  public void setDestPartnerId(Integer destPartnerId) {
    this.destPartnerId = destPartnerId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Routingrule routingrule = (Routingrule) o;
    return Objects.equals(id, routingrule.id) &&
        Objects.equals(ruleId, routingrule.ruleId) &&
        Objects.equals(branchId, routingrule.branchId) &&
        Objects.equals(rcId, routingrule.rcId) &&
        Objects.equals(priority, routingrule.priority) &&
        Objects.equals(destPartnerId, routingrule.destPartnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ruleId, branchId, rcId, priority, destPartnerId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Routingrule {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  ruleId: ").append(ruleId).append("\n");
    sb.append("  branchId: ").append(branchId).append("\n");
    sb.append("  rcId: ").append(rcId).append("\n");
    sb.append("  priority: ").append(priority).append("\n");
    sb.append("  destPartnerId: ").append(destPartnerId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

