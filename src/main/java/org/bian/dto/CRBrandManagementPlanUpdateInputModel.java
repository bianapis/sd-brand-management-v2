package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanUpdateInputModel
 */
public class CRBrandManagementPlanUpdateInputModel   {
  private String brandManagementServicingSessionReference = null;

  private String brandManagementPlanInstanceReference = null;

  private CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord brandManagementPlanInstanceRecord = null;

  private Object brandManagementPlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return brandManagementServicingSessionReference
  **/

  public String getBrandManagementServicingSessionReference() {
    return brandManagementServicingSessionReference;
  }

  public void setBrandManagementServicingSessionReference(String brandManagementServicingSessionReference) {
    this.brandManagementServicingSessionReference = brandManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Brand Management Plan instance 
   * @return brandManagementPlanInstanceReference
  **/

  public String getBrandManagementPlanInstanceReference() {
    return brandManagementPlanInstanceReference;
  }

  public void setBrandManagementPlanInstanceReference(String brandManagementPlanInstanceReference) {
    this.brandManagementPlanInstanceReference = brandManagementPlanInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return brandManagementPlanUpdateActionTaskRecord
  **/

  public Object getBrandManagementPlanUpdateActionTaskRecord() {
    return brandManagementPlanUpdateActionTaskRecord;
  }

  public void setBrandManagementPlanUpdateActionTaskRecord(Object brandManagementPlanUpdateActionTaskRecord) {
    this.brandManagementPlanUpdateActionTaskRecord = brandManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

