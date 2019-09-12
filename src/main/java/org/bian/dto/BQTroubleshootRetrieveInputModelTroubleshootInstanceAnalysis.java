package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootRetrieveInputModelTroubleshootInstanceAnalysis
 */
public class BQTroubleshootRetrieveInputModelTroubleshootInstanceAnalysis   {
  private String troubleshootInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return troubleshootInstanceAnalysisReference
  **/

  public String getTroubleshootInstanceAnalysisReference() {
    return troubleshootInstanceAnalysisReference;
  }

  public void setTroubleshootInstanceAnalysisReference(String troubleshootInstanceAnalysisReference) {
    this.troubleshootInstanceAnalysisReference = troubleshootInstanceAnalysisReference;
  }


}

