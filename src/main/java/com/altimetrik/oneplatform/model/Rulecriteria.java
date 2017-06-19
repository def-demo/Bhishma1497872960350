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
public class Rulecriteria  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private Integer rcId = null;
  
   
   
  
  private String criteria = null;
  
   
   
  
  private String value = null;

  
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
  public Integer getRcId() {
    return rcId;
  }
  public void setRcId(Integer rcId) {
    this.rcId = rcId;
  }

  
  /**
   * {}
   **/
  public String getCriteria() {
    return criteria;
  }
  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }

  
  /**
   * {}
   **/
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rulecriteria rulecriteria = (Rulecriteria) o;
    return Objects.equals(id, rulecriteria.id) &&
        Objects.equals(rcId, rulecriteria.rcId) &&
        Objects.equals(criteria, rulecriteria.criteria) &&
        Objects.equals(value, rulecriteria.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rcId, criteria, value);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rulecriteria {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  rcId: ").append(rcId).append("\n");
    sb.append("  criteria: ").append(criteria).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

