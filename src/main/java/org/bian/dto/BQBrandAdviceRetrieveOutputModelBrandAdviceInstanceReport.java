package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceReport
 */
public class BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceReport   {
  private Object brandAdviceInstanceReportRecord = null;

  private String brandAdviceInstanceReportType = null;

  private String brandAdviceInstanceReportParameters = null;

  private Object brandAdviceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return brandAdviceInstanceReportRecord
  **/

  public Object getBrandAdviceInstanceReportRecord() {
    return brandAdviceInstanceReportRecord;
  }

  public void setBrandAdviceInstanceReportRecord(Object brandAdviceInstanceReportRecord) {
    this.brandAdviceInstanceReportRecord = brandAdviceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return brandAdviceInstanceReportType
  **/

  public String getBrandAdviceInstanceReportType() {
    return brandAdviceInstanceReportType;
  }

  public void setBrandAdviceInstanceReportType(String brandAdviceInstanceReportType) {
    this.brandAdviceInstanceReportType = brandAdviceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return brandAdviceInstanceReportParameters
  **/

  public String getBrandAdviceInstanceReportParameters() {
    return brandAdviceInstanceReportParameters;
  }

  public void setBrandAdviceInstanceReportParameters(String brandAdviceInstanceReportParameters) {
    this.brandAdviceInstanceReportParameters = brandAdviceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return brandAdviceInstanceReport
  **/

  public Object getBrandAdviceInstanceReport() {
    return brandAdviceInstanceReport;
  }

  public void setBrandAdviceInstanceReport(Object brandAdviceInstanceReport) {
    this.brandAdviceInstanceReport = brandAdviceInstanceReport;
  }


}

