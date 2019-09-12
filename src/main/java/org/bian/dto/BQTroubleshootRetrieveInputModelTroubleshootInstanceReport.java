package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootRetrieveInputModelTroubleshootInstanceReport
 */
public class BQTroubleshootRetrieveInputModelTroubleshootInstanceReport   {
  private String troubleshootInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return troubleshootInstanceReportReference
  **/

  public String getTroubleshootInstanceReportReference() {
    return troubleshootInstanceReportReference;
  }

  public void setTroubleshootInstanceReportReference(String troubleshootInstanceReportReference) {
    this.troubleshootInstanceReportReference = troubleshootInstanceReportReference;
  }


}

