package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceReportRecord
 */
public class CRBrandManagementPlanRetrieveInputModelBrandManagementPlanInstanceReportRecord   {
  private String brandManagementPlanInstanceReportReference = null;

  private String brandManagementPlanInstanceReportType = null;

  private String brandManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return brandManagementPlanInstanceReportReference
  **/

  public String getBrandManagementPlanInstanceReportReference() {
    return brandManagementPlanInstanceReportReference;
  }

  public void setBrandManagementPlanInstanceReportReference(String brandManagementPlanInstanceReportReference) {
    this.brandManagementPlanInstanceReportReference = brandManagementPlanInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return brandManagementPlanInstanceReportParameters
  **/

  public String getBrandManagementPlanInstanceReportParameters() {
    return brandManagementPlanInstanceReportParameters;
  }

  public void setBrandManagementPlanInstanceReportParameters(String brandManagementPlanInstanceReportParameters) {
    this.brandManagementPlanInstanceReportParameters = brandManagementPlanInstanceReportParameters;
  }


}

