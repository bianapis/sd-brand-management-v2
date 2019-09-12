package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceRequestInputModel
 */
public class BQBrandAdviceRequestInputModel   {
  private String brandManagementPlanInstanceReference = null;

  private String brandAdviceInstanceReference = null;

  private Object brandAdviceRequestActionTaskRecord = null;

  private CRBrandManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRBrandManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRBrandManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

