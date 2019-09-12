package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceReportRecord
 */
public class CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceReportRecord   {
  private String brandManagementPlanInstanceReportData = null;

  private String brandManagementPlanInstanceReportType = null;

  private Object brandManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return brandManagementPlanInstanceReportData
  **/

  public String getBrandManagementPlanInstanceReportData() {
    return brandManagementPlanInstanceReportData;
  }

  public void setBrandManagementPlanInstanceReportData(String brandManagementPlanInstanceReportData) {
    this.brandManagementPlanInstanceReportData = brandManagementPlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return brandManagementPlanInstanceReportType
  **/

  public String getBrandManagementPlanInstanceReportType() {
    return brandManagementPlanInstanceReportType;
  }

  public void setBrandManagementPlanInstanceReportType(String brandManagementPlanInstanceReportType) {
    this.brandManagementPlanInstanceReportType = brandManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return brandManagementPlanInstanceReport
  **/

  public Object getBrandManagementPlanInstanceReport() {
    return brandManagementPlanInstanceReport;
  }

  public void setBrandManagementPlanInstanceReport(Object brandManagementPlanInstanceReport) {
    this.brandManagementPlanInstanceReport = brandManagementPlanInstanceReport;
  }


}

