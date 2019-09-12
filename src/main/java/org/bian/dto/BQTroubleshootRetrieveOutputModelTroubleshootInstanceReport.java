package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootRetrieveOutputModelTroubleshootInstanceReport
 */
public class BQTroubleshootRetrieveOutputModelTroubleshootInstanceReport   {
  private Object troubleshootInstanceReportRecord = null;

  private String troubleshootInstanceReportType = null;

  private String troubleshootInstanceReportParameters = null;

  private Object troubleshootInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return troubleshootInstanceReportRecord
  **/

  public Object getTroubleshootInstanceReportRecord() {
    return troubleshootInstanceReportRecord;
  }

  public void setTroubleshootInstanceReportRecord(Object troubleshootInstanceReportRecord) {
    this.troubleshootInstanceReportRecord = troubleshootInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return troubleshootInstanceReportType
  **/

  public String getTroubleshootInstanceReportType() {
    return troubleshootInstanceReportType;
  }

  public void setTroubleshootInstanceReportType(String troubleshootInstanceReportType) {
    this.troubleshootInstanceReportType = troubleshootInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return troubleshootInstanceReportParameters
  **/

  public String getTroubleshootInstanceReportParameters() {
    return troubleshootInstanceReportParameters;
  }

  public void setTroubleshootInstanceReportParameters(String troubleshootInstanceReportParameters) {
    this.troubleshootInstanceReportParameters = troubleshootInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return troubleshootInstanceReport
  **/

  public Object getTroubleshootInstanceReport() {
    return troubleshootInstanceReport;
  }

  public void setTroubleshootInstanceReport(Object troubleshootInstanceReport) {
    this.troubleshootInstanceReport = troubleshootInstanceReport;
  }


}

