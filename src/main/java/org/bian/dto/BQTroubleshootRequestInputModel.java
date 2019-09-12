package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQTroubleshootRequestInputModel
 */
public class BQTroubleshootRequestInputModel   {
  private String brandManagementPlanInstanceReference = null;

  private String troubleshootInstanceReference = null;

  private Object troubleshootRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return troubleshootRequestActionTaskRecord
  **/

  public Object getTroubleshootRequestActionTaskRecord() {
    return troubleshootRequestActionTaskRecord;
  }

  public void setTroubleshootRequestActionTaskRecord(Object troubleshootRequestActionTaskRecord) {
    this.troubleshootRequestActionTaskRecord = troubleshootRequestActionTaskRecord;
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

