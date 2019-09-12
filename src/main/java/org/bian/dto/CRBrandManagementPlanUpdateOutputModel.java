package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanUpdateOutputModel
 */
public class CRBrandManagementPlanUpdateOutputModel   {
  private CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord brandManagementPlanInstanceRecord = null;

  private String brandManagementPlanUpdateActionTaskReference = null;

  private Object brandManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return brandManagementPlanUpdateActionTaskReference
  **/

  public String getBrandManagementPlanUpdateActionTaskReference() {
    return brandManagementPlanUpdateActionTaskReference;
  }

  public void setBrandManagementPlanUpdateActionTaskReference(String brandManagementPlanUpdateActionTaskReference) {
    this.brandManagementPlanUpdateActionTaskReference = brandManagementPlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return brandManagementPlanUpdateActionTaskRecord
  **/

  public Object getBrandManagementPlanUpdateActionTaskRecord() {
    return brandManagementPlanUpdateActionTaskRecord;
  }

  public void setBrandManagementPlanUpdateActionTaskRecord(Object brandManagementPlanUpdateActionTaskRecord) {
    this.brandManagementPlanUpdateActionTaskRecord = brandManagementPlanUpdateActionTaskRecord;
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

