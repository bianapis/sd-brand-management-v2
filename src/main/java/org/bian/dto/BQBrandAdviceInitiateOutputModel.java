package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceInitiateOutputModel
 */
public class BQBrandAdviceInitiateOutputModel   {
  private CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord brandManagementPlanInstanceRecord = null;

  private String brandAdviceInstanceReference = null;

  private String brandAdviceInitiateActionReference = null;

  private Object brandAdviceInitiateActionRecord = null;

  private String brandAdviceInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Brand Advice instance 
   * @return brandAdviceInstanceReference
  **/

  public String getBrandAdviceInstanceReference() {
    return brandAdviceInstanceReference;
  }

  public void setBrandAdviceInstanceReference(String brandAdviceInstanceReference) {
    this.brandAdviceInstanceReference = brandAdviceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return brandAdviceInitiateActionReference
  **/

  public String getBrandAdviceInitiateActionReference() {
    return brandAdviceInitiateActionReference;
  }

  public void setBrandAdviceInitiateActionReference(String brandAdviceInitiateActionReference) {
    this.brandAdviceInitiateActionReference = brandAdviceInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return brandAdviceInitiateActionRecord
  **/

  public Object getBrandAdviceInitiateActionRecord() {
    return brandAdviceInitiateActionRecord;
  }

  public void setBrandAdviceInitiateActionRecord(Object brandAdviceInitiateActionRecord) {
    this.brandAdviceInitiateActionRecord = brandAdviceInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Brand Advice instance (e.g. initialised, pending, active) 
   * @return brandAdviceInstanceStatus
  **/

  public String getBrandAdviceInstanceStatus() {
    return brandAdviceInstanceStatus;
  }

  public void setBrandAdviceInstanceStatus(String brandAdviceInstanceStatus) {
    this.brandAdviceInstanceStatus = brandAdviceInstanceStatus;
  }


}

