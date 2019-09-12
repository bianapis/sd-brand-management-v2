package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTroubleshootInitiateOutputModel
 */
public class BQTroubleshootInitiateOutputModel   {
  private CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord brandManagementPlanInstanceRecord = null;

  private String troubleshootInstanceReference = null;

  private String troubleshootInitiateActionReference = null;

  private Object troubleshootInitiateActionRecord = null;

  private String troubleshootInstanceStatus = null;


  /**
   * Get brandManagementPlanInstanceRecord
   * @return brandManagementPlanInstanceRecord
  **/

  public CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord getBrandManagementPlanInstanceRecord() {
    return brandManagementPlanInstanceRecord;
  }

  public void setBrandManagementPlanInstanceRecord(CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord brandManagementPlanInstanceRecord) {
    this.brandManagementPlanInstanceRecord = brandManagementPlanInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return troubleshootInitiateActionReference
  **/

  public String getTroubleshootInitiateActionReference() {
    return troubleshootInitiateActionReference;
  }

  public void setTroubleshootInitiateActionReference(String troubleshootInitiateActionReference) {
    this.troubleshootInitiateActionReference = troubleshootInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return troubleshootInitiateActionRecord
  **/

  public Object getTroubleshootInitiateActionRecord() {
    return troubleshootInitiateActionRecord;
  }

  public void setTroubleshootInitiateActionRecord(Object troubleshootInitiateActionRecord) {
    this.troubleshootInitiateActionRecord = troubleshootInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Troubleshoot instance (e.g. initialised, pending, active) 
   * @return troubleshootInstanceStatus
  **/

  public String getTroubleshootInstanceStatus() {
    return troubleshootInstanceStatus;
  }

  public void setTroubleshootInstanceStatus(String troubleshootInstanceStatus) {
    this.troubleshootInstanceStatus = troubleshootInstanceStatus;
  }


}

