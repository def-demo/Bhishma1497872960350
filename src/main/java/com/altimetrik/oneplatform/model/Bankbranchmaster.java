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
public class Bankbranchmaster  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private Integer branchId = null;
  
   
   
  
  private Integer bankId = null;
  
   
   
  
  private String branchName = null;
  
   
   
  
  private String branchCode = null;
  
   
   
  
  private String ifscCode = null;

  
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
  public Integer getBranchId() {
    return branchId;
  }
  public void setBranchId(Integer branchId) {
    this.branchId = branchId;
  }

  
  /**
   * {}
   **/
  public Integer getBankId() {
    return bankId;
  }
  public void setBankId(Integer bankId) {
    this.bankId = bankId;
  }

  
  /**
   * {}
   **/
  public String getBranchName() {
    return branchName;
  }
  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  
  /**
   * {}
   **/
  public String getBranchCode() {
    return branchCode;
  }
  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  
  /**
   * {}
   **/
  public String getIfscCode() {
    return ifscCode;
  }
  public void setIfscCode(String ifscCode) {
    this.ifscCode = ifscCode;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bankbranchmaster bankbranchmaster = (Bankbranchmaster) o;
    return Objects.equals(id, bankbranchmaster.id) &&
        Objects.equals(branchId, bankbranchmaster.branchId) &&
        Objects.equals(bankId, bankbranchmaster.bankId) &&
        Objects.equals(branchName, bankbranchmaster.branchName) &&
        Objects.equals(branchCode, bankbranchmaster.branchCode) &&
        Objects.equals(ifscCode, bankbranchmaster.ifscCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, branchId, bankId, branchName, branchCode, ifscCode);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bankbranchmaster {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  branchId: ").append(branchId).append("\n");
    sb.append("  bankId: ").append(bankId).append("\n");
    sb.append("  branchName: ").append(branchName).append("\n");
    sb.append("  branchCode: ").append(branchCode).append("\n");
    sb.append("  ifscCode: ").append(ifscCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

