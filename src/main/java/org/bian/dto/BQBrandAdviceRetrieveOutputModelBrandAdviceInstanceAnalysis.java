package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceAnalysis
 */
public class BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceAnalysis   {
  private Object brandAdviceInstanceAnalysisRecord = null;

  private String brandAdviceInstanceAnalysisReportType = null;

  private String brandAdviceInstanceAnalysisParameters = null;

  private Object brandAdviceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return brandAdviceInstanceAnalysisRecord
  **/

  public Object getBrandAdviceInstanceAnalysisRecord() {
    return brandAdviceInstanceAnalysisRecord;
  }

  public void setBrandAdviceInstanceAnalysisRecord(Object brandAdviceInstanceAnalysisRecord) {
    this.brandAdviceInstanceAnalysisRecord = brandAdviceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return brandAdviceInstanceAnalysisReportType
  **/

  public String getBrandAdviceInstanceAnalysisReportType() {
    return brandAdviceInstanceAnalysisReportType;
  }

  public void setBrandAdviceInstanceAnalysisReportType(String brandAdviceInstanceAnalysisReportType) {
    this.brandAdviceInstanceAnalysisReportType = brandAdviceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return brandAdviceInstanceAnalysisParameters
  **/

  public String getBrandAdviceInstanceAnalysisParameters() {
    return brandAdviceInstanceAnalysisParameters;
  }

  public void setBrandAdviceInstanceAnalysisParameters(String brandAdviceInstanceAnalysisParameters) {
    this.brandAdviceInstanceAnalysisParameters = brandAdviceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return brandAdviceInstanceAnalysisReport
  **/

  public Object getBrandAdviceInstanceAnalysisReport() {
    return brandAdviceInstanceAnalysisReport;
  }

  public void setBrandAdviceInstanceAnalysisReport(Object brandAdviceInstanceAnalysisReport) {
    this.brandAdviceInstanceAnalysisReport = brandAdviceInstanceAnalysisReport;
  }


}

