package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTroubleshootInitiateInputModel
 */
public class BQTroubleshootInitiateInputModel   {
  private CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord brandManagementPlanInstanceRecord = null;

  private String brandManagementPlanInstanceReference = null;

  private Object troubleshootInitiateActionRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return troubleshootInitiateActionRecord
  **/

  public Object getTroubleshootInitiateActionRecord() {
    return troubleshootInitiateActionRecord;
  }

  public void setTroubleshootInitiateActionRecord(Object troubleshootInitiateActionRecord) {
    this.troubleshootInitiateActionRecord = troubleshootInitiateActionRecord;
  }


}

