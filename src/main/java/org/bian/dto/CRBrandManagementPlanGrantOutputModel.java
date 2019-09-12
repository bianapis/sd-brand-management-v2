package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanGrantOutputModel
 */
public class CRBrandManagementPlanGrantOutputModel   {
  private String brandManagementPlanGrantActionTaskReference = null;

  private Object brandManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRBrandManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Brand Management Plan instance grant service call 
   * @return brandManagementPlanGrantActionTaskReference
  **/

  public String getBrandManagementPlanGrantActionTaskReference() {
    return brandManagementPlanGrantActionTaskReference;
  }

  public void setBrandManagementPlanGrantActionTaskReference(String brandManagementPlanGrantActionTaskReference) {
    this.brandManagementPlanGrantActionTaskReference = brandManagementPlanGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return brandManagementPlanGrantActionTaskRecord
  **/

  public Object getBrandManagementPlanGrantActionTaskRecord() {
    return brandManagementPlanGrantActionTaskRecord;
  }

  public void setBrandManagementPlanGrantActionTaskRecord(Object brandManagementPlanGrantActionTaskRecord) {
    this.brandManagementPlanGrantActionTaskRecord = brandManagementPlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRBrandManagementPlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRBrandManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

