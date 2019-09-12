package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord
 */
public class CRBrandManagementPlanUpdateInputModelBrandManagementPlanInstanceRecord   {
  private String brandDefinition = null;

  private String brandValueAssessment = null;

  private String brandUsage = null;

  private String brandDevelopmentSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the brand, including how it is to be represented in different media and contexts 
   * @return brandDefinition
  **/

  public String getBrandDefinition() {
    return brandDefinition;
  }

  public void setBrandDefinition(String brandDefinition) {
    this.brandDefinition = brandDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An analysis of the brand value based on comparative market research 
   * @return brandValueAssessment
  **/

  public String getBrandValueAssessment() {
    return brandValueAssessment;
  }

  public void setBrandValueAssessment(String brandValueAssessment) {
    this.brandValueAssessment = brandValueAssessment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An inventory of situations where the brand is incorporated or exposed in business development activity - these situations may require on-going exposure monitoring or assessment 
   * @return brandUsage
  **/

  public String getBrandUsage() {
    return brandUsage;
  }

  public void setBrandUsage(String brandUsage) {
    this.brandUsage = brandUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule of any brand development related activities, includes usage and exposure tracking and impact analysis activities 
   * @return brandDevelopmentSchedule
  **/

  public String getBrandDevelopmentSchedule() {
    return brandDevelopmentSchedule;
  }

  public void setBrandDevelopmentSchedule(String brandDevelopmentSchedule) {
    this.brandDevelopmentSchedule = brandDevelopmentSchedule;
  }


}

