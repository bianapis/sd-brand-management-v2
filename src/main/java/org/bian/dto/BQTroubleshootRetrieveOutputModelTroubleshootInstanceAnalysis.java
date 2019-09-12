package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootRetrieveOutputModelTroubleshootInstanceAnalysis
 */
public class BQTroubleshootRetrieveOutputModelTroubleshootInstanceAnalysis   {
  private Object troubleshootInstanceAnalysisRecord = null;

  private String troubleshootInstanceAnalysisReportType = null;

  private String troubleshootInstanceAnalysisParameters = null;

  private Object troubleshootInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return troubleshootInstanceAnalysisRecord
  **/

  public Object getTroubleshootInstanceAnalysisRecord() {
    return troubleshootInstanceAnalysisRecord;
  }

  public void setTroubleshootInstanceAnalysisRecord(Object troubleshootInstanceAnalysisRecord) {
    this.troubleshootInstanceAnalysisRecord = troubleshootInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return troubleshootInstanceAnalysisReportType
  **/

  public String getTroubleshootInstanceAnalysisReportType() {
    return troubleshootInstanceAnalysisReportType;
  }

  public void setTroubleshootInstanceAnalysisReportType(String troubleshootInstanceAnalysisReportType) {
    this.troubleshootInstanceAnalysisReportType = troubleshootInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return troubleshootInstanceAnalysisParameters
  **/

  public String getTroubleshootInstanceAnalysisParameters() {
    return troubleshootInstanceAnalysisParameters;
  }

  public void setTroubleshootInstanceAnalysisParameters(String troubleshootInstanceAnalysisParameters) {
    this.troubleshootInstanceAnalysisParameters = troubleshootInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return troubleshootInstanceAnalysisReport
  **/

  public Object getTroubleshootInstanceAnalysisReport() {
    return troubleshootInstanceAnalysisReport;
  }

  public void setTroubleshootInstanceAnalysisReport(Object troubleshootInstanceAnalysisReport) {
    this.troubleshootInstanceAnalysisReport = troubleshootInstanceAnalysisReport;
  }


}

