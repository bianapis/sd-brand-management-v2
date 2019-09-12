package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrandAdviceExchangeInputModelBrandAdviceExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceExchangeInputModel
 */
public class BQBrandAdviceExchangeInputModel   {
  private String brandManagementPlanInstanceReference = null;

  private String brandAdviceInstanceReference = null;

  private Object brandAdviceExchangeActionTaskRecord = null;

  private BQBrandAdviceExchangeInputModelBrandAdviceExchangeActionRequest brandAdviceExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return brandAdviceExchangeActionTaskRecord
  **/

  public Object getBrandAdviceExchangeActionTaskRecord() {
    return brandAdviceExchangeActionTaskRecord;
  }

  public void setBrandAdviceExchangeActionTaskRecord(Object brandAdviceExchangeActionTaskRecord) {
    this.brandAdviceExchangeActionTaskRecord = brandAdviceExchangeActionTaskRecord;
  }


  /**
   * Get brandAdviceExchangeActionRequest
   * @return brandAdviceExchangeActionRequest
  **/

  public BQBrandAdviceExchangeInputModelBrandAdviceExchangeActionRequest getBrandAdviceExchangeActionRequest() {
    return brandAdviceExchangeActionRequest;
  }

  public void setBrandAdviceExchangeActionRequest(BQBrandAdviceExchangeInputModelBrandAdviceExchangeActionRequest brandAdviceExchangeActionRequest) {
    this.brandAdviceExchangeActionRequest = brandAdviceExchangeActionRequest;
  }


}

