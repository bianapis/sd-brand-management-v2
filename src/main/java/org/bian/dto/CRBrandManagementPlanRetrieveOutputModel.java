package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceAnalysis;
import org.bian.dto.CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceReportRecord;
import org.bian.dto.CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanRetrieveOutputModel
 */
public class CRBrandManagementPlanRetrieveOutputModel   {
  private CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord brandManagementPlanInstanceRecord = null;

  private String brandManagementPlanRetrieveActionTaskReference = null;

  private Object brandManagementPlanRetrieveActionTaskRecord = null;

  private String brandManagementPlanRetrieveActionResponse = null;

  private CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceReportRecord brandManagementPlanInstanceReportRecord = null;

  private CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceAnalysis brandManagementPlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Brand Management Plan instance retrieve service call 
   * @return brandManagementPlanRetrieveActionTaskReference
  **/

  public String getBrandManagementPlanRetrieveActionTaskReference() {
    return brandManagementPlanRetrieveActionTaskReference;
  }

  public void setBrandManagementPlanRetrieveActionTaskReference(String brandManagementPlanRetrieveActionTaskReference) {
    this.brandManagementPlanRetrieveActionTaskReference = brandManagementPlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return brandManagementPlanRetrieveActionTaskRecord
  **/

  public Object getBrandManagementPlanRetrieveActionTaskRecord() {
    return brandManagementPlanRetrieveActionTaskRecord;
  }

  public void setBrandManagementPlanRetrieveActionTaskRecord(Object brandManagementPlanRetrieveActionTaskRecord) {
    this.brandManagementPlanRetrieveActionTaskRecord = brandManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return brandManagementPlanRetrieveActionResponse
  **/

  public String getBrandManagementPlanRetrieveActionResponse() {
    return brandManagementPlanRetrieveActionResponse;
  }

  public void setBrandManagementPlanRetrieveActionResponse(String brandManagementPlanRetrieveActionResponse) {
    this.brandManagementPlanRetrieveActionResponse = brandManagementPlanRetrieveActionResponse;
  }


  /**
   * Get brandManagementPlanInstanceReportRecord
   * @return brandManagementPlanInstanceReportRecord
  **/

  public CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceReportRecord getBrandManagementPlanInstanceReportRecord() {
    return brandManagementPlanInstanceReportRecord;
  }

  public void setBrandManagementPlanInstanceReportRecord(CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceReportRecord brandManagementPlanInstanceReportRecord) {
    this.brandManagementPlanInstanceReportRecord = brandManagementPlanInstanceReportRecord;
  }


  /**
   * Get brandManagementPlanInstanceAnalysis
   * @return brandManagementPlanInstanceAnalysis
  **/

  public CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceAnalysis getBrandManagementPlanInstanceAnalysis() {
    return brandManagementPlanInstanceAnalysis;
  }

  public void setBrandManagementPlanInstanceAnalysis(CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceAnalysis brandManagementPlanInstanceAnalysis) {
    this.brandManagementPlanInstanceAnalysis = brandManagementPlanInstanceAnalysis;
  }


}

