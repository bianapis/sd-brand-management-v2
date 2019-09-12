package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanGrantInputModel
 */
public class CRBrandManagementPlanGrantInputModel   {
  private String brandManagementServicingSessionReference = null;

  private String brandManagementPlanInstanceReference = null;

  private Object brandManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRBrandManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return brandManagementServicingSessionReference
  **/

  public String getBrandManagementServicingSessionReference() {
    return brandManagementServicingSessionReference;
  }

  public void setBrandManagementServicingSessionReference(String brandManagementServicingSessionReference) {
    this.brandManagementServicingSessionReference = brandManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Brand Management Plan instance 
   * @return brandManagementPlanInstanceReference
  **/

  public String getBrandManagementPlanInstanceReference() {
    return brandManagementPlanInstanceReference;
  }

  public void setBrandManagementPlanInstanceReference(String brandManagementPlanInstanceReference) {
    this.brandManagementPlanInstanceReference = brandManagementPlanInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRBrandManagementPlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRBrandManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

