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
public class Remitter  {
  
  
   
  
  @Id
   
  
  private Long id = null;
  
   
   
  
  private String addressProof = null;
  
   
   
  
  private String alternateNumber = null;
  
   
   
  
  private String bcAgent = null;
  
   
   
  
  private String cityName = null;
  
   
   
  
  private String clientName = null;
  
   
   
  
  private String idProof = null;
  
   
   
  
  private String idProofExpiryDate = null;
  
   
   
  
  private String idProofIssueDate = null;
  
   
   
  
  private String idProofIssuePlace = null;
  
   
   
  
  private String idProofNumber = null;
  
   
   
  
  private String lCityName = null;
  
   
   
  
  private String lPincode = null;
  
   
   
  
  private String lRemitterAddress = null;
  
   
   
  
  private String lStateName = null;
  
   
   
  
  private String pincode = null;
  
   
   
  
  private String remitterAddress1 = null;
  
   
   
  
  private String remitterAddress2 = null;
  
   
   
  
  private String remitterMobileNumber = null;
  
   
   
  
  private String remitterName = null;
  
   
   
  
  private String sessionToken = null;
  
   
   
  
  private String stateName = null;
  
   
   
  
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
  public String getAddressProof() {
    return addressProof;
  }
  public void setAddressProof(String addressProof) {
    this.addressProof = addressProof;
  }

  
  /**
   * {}
   **/
  public String getAlternateNumber() {
    return alternateNumber;
  }
  public void setAlternateNumber(String alternateNumber) {
    this.alternateNumber = alternateNumber;
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
  public String getCityName() {
    return cityName;
  }
  public void setCityName(String cityName) {
    this.cityName = cityName;
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
  public String getIdProof() {
    return idProof;
  }
  public void setIdProof(String idProof) {
    this.idProof = idProof;
  }

  
  /**
   * {}
   **/
  public String getIdProofExpiryDate() {
    return idProofExpiryDate;
  }
  public void setIdProofExpiryDate(String idProofExpiryDate) {
    this.idProofExpiryDate = idProofExpiryDate;
  }

  
  /**
   * {}
   **/
  public String getIdProofIssueDate() {
    return idProofIssueDate;
  }
  public void setIdProofIssueDate(String idProofIssueDate) {
    this.idProofIssueDate = idProofIssueDate;
  }

  
  /**
   * {}
   **/
  public String getIdProofIssuePlace() {
    return idProofIssuePlace;
  }
  public void setIdProofIssuePlace(String idProofIssuePlace) {
    this.idProofIssuePlace = idProofIssuePlace;
  }

  
  /**
   * {}
   **/
  public String getIdProofNumber() {
    return idProofNumber;
  }
  public void setIdProofNumber(String idProofNumber) {
    this.idProofNumber = idProofNumber;
  }

  
  /**
   * {}
   **/
  public String getLCityName() {
    return lCityName;
  }
  public void setLCityName(String lCityName) {
    this.lCityName = lCityName;
  }

  
  /**
   * {}
   **/
  public String getLPincode() {
    return lPincode;
  }
  public void setLPincode(String lPincode) {
    this.lPincode = lPincode;
  }

  
  /**
   * {}
   **/
  public String getLRemitterAddress() {
    return lRemitterAddress;
  }
  public void setLRemitterAddress(String lRemitterAddress) {
    this.lRemitterAddress = lRemitterAddress;
  }

  
  /**
   * {}
   **/
  public String getLStateName() {
    return lStateName;
  }
  public void setLStateName(String lStateName) {
    this.lStateName = lStateName;
  }

  
  /**
   * {}
   **/
  public String getPincode() {
    return pincode;
  }
  public void setPincode(String pincode) {
    this.pincode = pincode;
  }

  
  /**
   * {}
   **/
  public String getRemitterAddress1() {
    return remitterAddress1;
  }
  public void setRemitterAddress1(String remitterAddress1) {
    this.remitterAddress1 = remitterAddress1;
  }

  
  /**
   * {}
   **/
  public String getRemitterAddress2() {
    return remitterAddress2;
  }
  public void setRemitterAddress2(String remitterAddress2) {
    this.remitterAddress2 = remitterAddress2;
  }

  
  /**
   * {}
   **/
  public String getRemitterMobileNumber() {
    return remitterMobileNumber;
  }
  public void setRemitterMobileNumber(String remitterMobileNumber) {
    this.remitterMobileNumber = remitterMobileNumber;
  }

  
  /**
   * {}
   **/
  public String getRemitterName() {
    return remitterName;
  }
  public void setRemitterName(String remitterName) {
    this.remitterName = remitterName;
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
  public String getStateName() {
    return stateName;
  }
  public void setStateName(String stateName) {
    this.stateName = stateName;
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
    Remitter remitter = (Remitter) o;
    return Objects.equals(id, remitter.id) &&
        Objects.equals(addressProof, remitter.addressProof) &&
        Objects.equals(alternateNumber, remitter.alternateNumber) &&
        Objects.equals(bcAgent, remitter.bcAgent) &&
        Objects.equals(cityName, remitter.cityName) &&
        Objects.equals(clientName, remitter.clientName) &&
        Objects.equals(idProof, remitter.idProof) &&
        Objects.equals(idProofExpiryDate, remitter.idProofExpiryDate) &&
        Objects.equals(idProofIssueDate, remitter.idProofIssueDate) &&
        Objects.equals(idProofIssuePlace, remitter.idProofIssuePlace) &&
        Objects.equals(idProofNumber, remitter.idProofNumber) &&
        Objects.equals(lCityName, remitter.lCityName) &&
        Objects.equals(lPincode, remitter.lPincode) &&
        Objects.equals(lRemitterAddress, remitter.lRemitterAddress) &&
        Objects.equals(lStateName, remitter.lStateName) &&
        Objects.equals(pincode, remitter.pincode) &&
        Objects.equals(remitterAddress1, remitter.remitterAddress1) &&
        Objects.equals(remitterAddress2, remitter.remitterAddress2) &&
        Objects.equals(remitterMobileNumber, remitter.remitterMobileNumber) &&
        Objects.equals(remitterName, remitter.remitterName) &&
        Objects.equals(sessionToken, remitter.sessionToken) &&
        Objects.equals(stateName, remitter.stateName) &&
        Objects.equals(status, remitter.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addressProof, alternateNumber, bcAgent, cityName, clientName, idProof, idProofExpiryDate, idProofIssueDate, idProofIssuePlace, idProofNumber, lCityName, lPincode, lRemitterAddress, lStateName, pincode, remitterAddress1, remitterAddress2, remitterMobileNumber, remitterName, sessionToken, stateName, status);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Remitter {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  addressProof: ").append(addressProof).append("\n");
    sb.append("  alternateNumber: ").append(alternateNumber).append("\n");
    sb.append("  bcAgent: ").append(bcAgent).append("\n");
    sb.append("  cityName: ").append(cityName).append("\n");
    sb.append("  clientName: ").append(clientName).append("\n");
    sb.append("  idProof: ").append(idProof).append("\n");
    sb.append("  idProofExpiryDate: ").append(idProofExpiryDate).append("\n");
    sb.append("  idProofIssueDate: ").append(idProofIssueDate).append("\n");
    sb.append("  idProofIssuePlace: ").append(idProofIssuePlace).append("\n");
    sb.append("  idProofNumber: ").append(idProofNumber).append("\n");
    sb.append("  lCityName: ").append(lCityName).append("\n");
    sb.append("  lPincode: ").append(lPincode).append("\n");
    sb.append("  lRemitterAddress: ").append(lRemitterAddress).append("\n");
    sb.append("  lStateName: ").append(lStateName).append("\n");
    sb.append("  pincode: ").append(pincode).append("\n");
    sb.append("  remitterAddress1: ").append(remitterAddress1).append("\n");
    sb.append("  remitterAddress2: ").append(remitterAddress2).append("\n");
    sb.append("  remitterMobileNumber: ").append(remitterMobileNumber).append("\n");
    sb.append("  remitterName: ").append(remitterName).append("\n");
    sb.append("  sessionToken: ").append(sessionToken).append("\n");
    sb.append("  stateName: ").append(stateName).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

