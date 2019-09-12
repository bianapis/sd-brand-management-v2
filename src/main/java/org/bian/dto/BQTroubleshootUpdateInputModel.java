package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootUpdateInputModel
 */
public class BQTroubleshootUpdateInputModel   {
  private String brandManagementPlanInstanceReference = null;

  private String troubleshootInstanceReference = null;

  private Object troubleshootUpdateActionTaskRecord = null;

  private String troubleshootUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Brand Management Plan instance 
   * @return brandManagementPlanInstanceReference
  **/

  public String getBrandManagementPlanInstanceReference() {
    return brandManagementPlanInstanceReference;
  }

  public void setBrandManagementPlanInstanceReference(String brandManagementPlanInstanceReference) {
    this.brandManagementPlanInstanceReference = brandManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Troubleshoot instance 
   * @return troubleshootInstanceReference
  **/

  public String getTroubleshootInstanceReference() {
    return troubleshootInstanceReference;
  }

  public void setTroubleshootInstanceReference(String troubleshootInstanceReference) {
    this.troubleshootInstanceReference = troubleshootInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return troubleshootUpdateActionTaskRecord
  **/

  public Object getTroubleshootUpdateActionTaskRecord() {
    return troubleshootUpdateActionTaskRecord;
  }

  public void setTroubleshootUpdateActionTaskRecord(Object troubleshootUpdateActionTaskRecord) {
    this.troubleshootUpdateActionTaskRecord = troubleshootUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return troubleshootUpdateActionRequest
  **/

  public String getTroubleshootUpdateActionRequest() {
    return troubleshootUpdateActionRequest;
  }

  public void setTroubleshootUpdateActionRequest(String troubleshootUpdateActionRequest) {
    this.troubleshootUpdateActionRequest = troubleshootUpdateActionRequest;
  }


}

