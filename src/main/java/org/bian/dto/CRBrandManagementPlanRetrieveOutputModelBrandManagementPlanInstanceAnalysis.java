package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceAnalysis
 */
public class CRBrandManagementPlanRetrieveOutputModelBrandManagementPlanInstanceAnalysis   {
  private String brandManagementPlanInstanceAnalysisData = null;

  private String brandManagementPlanInstanceAnalysisReportType = null;

  private Object brandManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return brandManagementPlanInstanceAnalysisData
  **/

  public String getBrandManagementPlanInstanceAnalysisData() {
    return brandManagementPlanInstanceAnalysisData;
  }

  public void setBrandManagementPlanInstanceAnalysisData(String brandManagementPlanInstanceAnalysisData) {
    this.brandManagementPlanInstanceAnalysisData = brandManagementPlanInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return brandManagementPlanInstanceAnalysisReportType
  **/

  public String getBrandManagementPlanInstanceAnalysisReportType() {
    return brandManagementPlanInstanceAnalysisReportType;
  }

  public void setBrandManagementPlanInstanceAnalysisReportType(String brandManagementPlanInstanceAnalysisReportType) {
    this.brandManagementPlanInstanceAnalysisReportType = brandManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return brandManagementPlanInstanceAnalysisReport
  **/

  public Object getBrandManagementPlanInstanceAnalysisReport() {
    return brandManagementPlanInstanceAnalysisReport;
  }

  public void setBrandManagementPlanInstanceAnalysisReport(Object brandManagementPlanInstanceAnalysisReport) {
    this.brandManagementPlanInstanceAnalysisReport = brandManagementPlanInstanceAnalysisReport;
  }


}

