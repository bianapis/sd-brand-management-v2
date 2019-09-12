package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceAnalysis
 */
public class CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceAnalysis   {
  private String brandManagementPlanInstanceAnalysisReference = null;

  private String brandManagementPlanInstanceAnalysisReportType = null;

  private String brandManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return brandManagementPlanInstanceAnalysisReference
  **/

  public String getBrandManagementPlanInstanceAnalysisReference() {
    return brandManagementPlanInstanceAnalysisReference;
  }

  public void setBrandManagementPlanInstanceAnalysisReference(String brandManagementPlanInstanceAnalysisReference) {
    this.brandManagementPlanInstanceAnalysisReference = brandManagementPlanInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return brandManagementPlanInstanceAnalysisParameters
  **/

  public String getBrandManagementPlanInstanceAnalysisParameters() {
    return brandManagementPlanInstanceAnalysisParameters;
  }

  public void setBrandManagementPlanInstanceAnalysisParameters(String brandManagementPlanInstanceAnalysisParameters) {
    this.brandManagementPlanInstanceAnalysisParameters = brandManagementPlanInstanceAnalysisParameters;
  }


}

