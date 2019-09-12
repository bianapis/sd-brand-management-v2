package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceUpdateInputModel
 */
public class BQBrandAdviceUpdateInputModel   {
  private String brandManagementPlanInstanceReference = null;

  private String brandAdviceInstanceReference = null;

  private Object brandAdviceUpdateActionTaskRecord = null;

  private String brandAdviceUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return brandAdviceUpdateActionTaskRecord
  **/

  public Object getBrandAdviceUpdateActionTaskRecord() {
    return brandAdviceUpdateActionTaskRecord;
  }

  public void setBrandAdviceUpdateActionTaskRecord(Object brandAdviceUpdateActionTaskRecord) {
    this.brandAdviceUpdateActionTaskRecord = brandAdviceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return brandAdviceUpdateActionRequest
  **/

  public String getBrandAdviceUpdateActionRequest() {
    return brandAdviceUpdateActionRequest;
  }

  public void setBrandAdviceUpdateActionRequest(String brandAdviceUpdateActionRequest) {
    this.brandAdviceUpdateActionRequest = brandAdviceUpdateActionRequest;
  }


}

