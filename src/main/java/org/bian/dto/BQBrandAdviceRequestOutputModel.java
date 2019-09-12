package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceRequestOutputModel
 */
public class BQBrandAdviceRequestOutputModel   {
  private String brandAdviceRequestActionTaskReference = null;

  private Object brandAdviceRequestActionTaskRecord = null;

  private String brandAdviceRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Brand Advice instance request service call 
   * @return brandAdviceRequestActionTaskReference
  **/

  public String getBrandAdviceRequestActionTaskReference() {
    return brandAdviceRequestActionTaskReference;
  }

  public void setBrandAdviceRequestActionTaskReference(String brandAdviceRequestActionTaskReference) {
    this.brandAdviceRequestActionTaskReference = brandAdviceRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return brandAdviceRequestActionTaskRecord
  **/

  public Object getBrandAdviceRequestActionTaskRecord() {
    return brandAdviceRequestActionTaskRecord;
  }

  public void setBrandAdviceRequestActionTaskRecord(Object brandAdviceRequestActionTaskRecord) {
    this.brandAdviceRequestActionTaskRecord = brandAdviceRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Brand Advice service request record 
   * @return brandAdviceRequestRecordReference
  **/

  public String getBrandAdviceRequestRecordReference() {
    return brandAdviceRequestRecordReference;
  }

  public void setBrandAdviceRequestRecordReference(String brandAdviceRequestRecordReference) {
    this.brandAdviceRequestRecordReference = brandAdviceRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

