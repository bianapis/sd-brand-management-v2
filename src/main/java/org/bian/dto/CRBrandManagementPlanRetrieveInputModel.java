package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceAnalysis;
import org.bian.dto.CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanRetrieveInputModel
 */
public class CRBrandManagementPlanRetrieveInputModel   {
  private Object brandManagementPlanRetrieveActionTaskRecord = null;

  private String brandManagementPlanRetrieveActionRequest = null;

  private CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceReportRecord brandManagementPlanInstanceReportRecord = null;

  private CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceAnalysis brandManagementPlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return brandManagementPlanRetrieveActionRequest
  **/

  public String getBrandManagementPlanRetrieveActionRequest() {
    return brandManagementPlanRetrieveActionRequest;
  }

  public void setBrandManagementPlanRetrieveActionRequest(String brandManagementPlanRetrieveActionRequest) {
    this.brandManagementPlanRetrieveActionRequest = brandManagementPlanRetrieveActionRequest;
  }


  /**
   * Get brandManagementPlanInstanceReportRecord
   * @return brandManagementPlanInstanceReportRecord
  **/

  public CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceReportRecord getBrandManagementPlanInstanceReportRecord() {
    return brandManagementPlanInstanceReportRecord;
  }

  public void setBrandManagementPlanInstanceReportRecord(CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceReportRecord brandManagementPlanInstanceReportRecord) {
    this.brandManagementPlanInstanceReportRecord = brandManagementPlanInstanceReportRecord;
  }


  /**
   * Get brandManagementPlanInstanceAnalysis
   * @return brandManagementPlanInstanceAnalysis
  **/

  public CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceAnalysis getBrandManagementPlanInstanceAnalysis() {
    return brandManagementPlanInstanceAnalysis;
  }

  public void setBrandManagementPlanInstanceAnalysis(CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceAnalysis brandManagementPlanInstanceAnalysis) {
    this.brandManagementPlanInstanceAnalysis = brandManagementPlanInstanceAnalysis;
  }


}

