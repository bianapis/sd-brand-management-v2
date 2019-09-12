package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceUpdateOutputModel
 */
public class BQBrandAdviceUpdateOutputModel   {
  private String brandAdviceUpdateActionTaskReference = null;

  private Object brandAdviceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return brandAdviceUpdateActionTaskReference
  **/

  public String getBrandAdviceUpdateActionTaskReference() {
    return brandAdviceUpdateActionTaskReference;
  }

  public void setBrandAdviceUpdateActionTaskReference(String brandAdviceUpdateActionTaskReference) {
    this.brandAdviceUpdateActionTaskReference = brandAdviceUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

