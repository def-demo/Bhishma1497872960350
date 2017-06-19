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
public class Bankmaster  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String bankId = null;
  
   
   
  
  private String bankGroupId = null;
  
   
   
  
  private String bankName = null;

  
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
  public String getBankId() {
    return bankId;
  }
  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  
  /**
   * {}
   **/
  public String getBankGroupId() {
    return bankGroupId;
  }
  public void setBankGroupId(String bankGroupId) {
    this.bankGroupId = bankGroupId;
  }

  
  /**
   * {}
   **/
  public String getBankName() {
    return bankName;
  }
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bankmaster bankmaster = (Bankmaster) o;
    return Objects.equals(id, bankmaster.id) &&
        Objects.equals(bankId, bankmaster.bankId) &&
        Objects.equals(bankGroupId, bankmaster.bankGroupId) &&
        Objects.equals(bankName, bankmaster.bankName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bankId, bankGroupId, bankName);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bankmaster {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  bankId: ").append(bankId).append("\n");
    sb.append("  bankGroupId: ").append(bankGroupId).append("\n");
    sb.append("  bankName: ").append(bankName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

