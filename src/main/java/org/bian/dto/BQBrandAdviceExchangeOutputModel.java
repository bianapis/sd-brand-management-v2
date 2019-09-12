package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceExchangeOutputModel
 */
public class BQBrandAdviceExchangeOutputModel   {
  private String brandAdviceExchangeActionTaskReference = null;

  private Object brandAdviceExchangeActionTaskRecord = null;

  private String brandAdviceExchangeActionResponse = null;

  private String brandAdviceInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Brand Advice instance exchange service call 
   * @return brandAdviceExchangeActionTaskReference
  **/

  public String getBrandAdviceExchangeActionTaskReference() {
    return brandAdviceExchangeActionTaskReference;
  }

  public void setBrandAdviceExchangeActionTaskReference(String brandAdviceExchangeActionTaskReference) {
    this.brandAdviceExchangeActionTaskReference = brandAdviceExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return brandAdviceExchangeActionResponse
  **/

  public String getBrandAdviceExchangeActionResponse() {
    return brandAdviceExchangeActionResponse;
  }

  public void setBrandAdviceExchangeActionResponse(String brandAdviceExchangeActionResponse) {
    this.brandAdviceExchangeActionResponse = brandAdviceExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Brand Advice instance (e.g. accepted, rejected, verified) 
   * @return brandAdviceInstanceStatus
  **/

  public String getBrandAdviceInstanceStatus() {
    return brandAdviceInstanceStatus;
  }

  public void setBrandAdviceInstanceStatus(String brandAdviceInstanceStatus) {
    this.brandAdviceInstanceStatus = brandAdviceInstanceStatus;
  }


}

