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
public class Beneficiary  {
  
  
   
  
  @Id
   
  
  private Long id = null;
  
   
   
  
  private String accountNumber = null;
  
   
   
  
  private String address = null;
  
   
   
  
  private String bank = null;
  
   
   
  
  private String bcAgent = null;
  
   
   
  
  private String beneficiaryEmailId = null;
  
   
   
  
  private String beneficiaryMobileNumber = null;
  
   
   
  
  private String beneficiaryName = null;
  
   
   
  
  private String branch = null;
  
   
   
  
  private String city = null;
  
   
   
  
  private String clientName = null;
  
   
   
  
  private Integer flag = null;
  
   
   
  
  private String ifscCode = null;
  
   
   
  
  private Integer mmid = null;
  
   
   
  
  private Integer relationshipId = null;
  
   
   
  
  private String remitterId = null;
  
   
   
  
  private String sessionToken = null;
  
   
   
  
  private String state = null;
  
   
   
  
  private String status = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  
  /**
   * {}
   **/
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * {}
   **/
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }

  
  /**
   * {}
   **/
  public String getBcAgent() {
    return bcAgent;
  }
  public void setBcAgent(String bcAgent) {
    this.bcAgent = bcAgent;
  }

  
  /**
   * {}
   **/
  public String getBeneficiaryEmailId() {
    return beneficiaryEmailId;
  }
  public void setBeneficiaryEmailId(String beneficiaryEmailId) {
    this.beneficiaryEmailId = beneficiaryEmailId;
  }

  
  /**
   * {}
   **/
  public String getBeneficiaryMobileNumber() {
    return beneficiaryMobileNumber;
  }
  public void setBeneficiaryMobileNumber(String beneficiaryMobileNumber) {
    this.beneficiaryMobileNumber = beneficiaryMobileNumber;
  }

  
  /**
   * {}
   **/
  public String getBeneficiaryName() {
    return beneficiaryName;
  }
  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  
  /**
   * {}
   **/
  public String getBranch() {
    return branch;
  }
  public void setBranch(String branch) {
    this.branch = branch;
  }

  
  /**
   * {}
   **/
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * {}
   **/
  public String getClientName() {
    return clientName;
  }
  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  
  /**
   * {}
   **/
  public Integer getFlag() {
    return flag;
  }
  public void setFlag(Integer flag) {
    this.flag = flag;
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

  
  /**
   * {}
   **/
  public Integer getMmid() {
    return mmid;
  }
  public void setMmid(Integer mmid) {
    this.mmid = mmid;
  }

  
  /**
   * {}
   **/
  public Integer getRelationshipId() {
    return relationshipId;
  }
  public void setRelationshipId(Integer relationshipId) {
    this.relationshipId = relationshipId;
  }

  
  /**
   * {}
   **/
  public String getRemitterId() {
    return remitterId;
  }
  public void setRemitterId(String remitterId) {
    this.remitterId = remitterId;
  }

  
  /**
   * {}
   **/
  public String getSessionToken() {
    return sessionToken;
  }
  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }

  
  /**
   * {}
   **/
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
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
    Beneficiary beneficiary = (Beneficiary) o;
    return Objects.equals(id, beneficiary.id) &&
        Objects.equals(accountNumber, beneficiary.accountNumber) &&
        Objects.equals(address, beneficiary.address) &&
        Objects.equals(bank, beneficiary.bank) &&
        Objects.equals(bcAgent, beneficiary.bcAgent) &&
        Objects.equals(beneficiaryEmailId, beneficiary.beneficiaryEmailId) &&
        Objects.equals(beneficiaryMobileNumber, beneficiary.beneficiaryMobileNumber) &&
        Objects.equals(beneficiaryName, beneficiary.beneficiaryName) &&
        Objects.equals(branch, beneficiary.branch) &&
        Objects.equals(city, beneficiary.city) &&
        Objects.equals(clientName, beneficiary.clientName) &&
        Objects.equals(flag, beneficiary.flag) &&
        Objects.equals(ifscCode, beneficiary.ifscCode) &&
        Objects.equals(mmid, beneficiary.mmid) &&
        Objects.equals(relationshipId, beneficiary.relationshipId) &&
        Objects.equals(remitterId, beneficiary.remitterId) &&
        Objects.equals(sessionToken, beneficiary.sessionToken) &&
        Objects.equals(state, beneficiary.state) &&
        Objects.equals(status, beneficiary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNumber, address, bank, bcAgent, beneficiaryEmailId, beneficiaryMobileNumber, beneficiaryName, branch, city, clientName, flag, ifscCode, mmid, relationshipId, remitterId, sessionToken, state, status);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beneficiary {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  accountNumber: ").append(accountNumber).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  bank: ").append(bank).append("\n");
    sb.append("  bcAgent: ").append(bcAgent).append("\n");
    sb.append("  beneficiaryEmailId: ").append(beneficiaryEmailId).append("\n");
    sb.append("  beneficiaryMobileNumber: ").append(beneficiaryMobileNumber).append("\n");
    sb.append("  beneficiaryName: ").append(beneficiaryName).append("\n");
    sb.append("  branch: ").append(branch).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  clientName: ").append(clientName).append("\n");
    sb.append("  flag: ").append(flag).append("\n");
    sb.append("  ifscCode: ").append(ifscCode).append("\n");
    sb.append("  mmid: ").append(mmid).append("\n");
    sb.append("  relationshipId: ").append(relationshipId).append("\n");
    sb.append("  remitterId: ").append(remitterId).append("\n");
    sb.append("  sessionToken: ").append(sessionToken).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

