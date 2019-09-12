package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrandAdviceRetrieveInputModelBrandAdviceInstanceAnalysis;
import org.bian.dto.BQBrandAdviceRetrieveInputModelBrandAdviceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceRetrieveInputModel
 */
public class BQBrandAdviceRetrieveInputModel   {
  private Object brandAdviceRetrieveActionTaskRecord = null;

  private String brandAdviceRetrieveActionRequest = null;

  private BQBrandAdviceRetrieveInputModelBrandAdviceInstanceReport brandAdviceInstanceReport = null;

  private BQBrandAdviceRetrieveInputModelBrandAdviceInstanceAnalysis brandAdviceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return brandAdviceRetrieveActionTaskRecord
  **/

  public Object getBrandAdviceRetrieveActionTaskRecord() {
    return brandAdviceRetrieveActionTaskRecord;
  }

  public void setBrandAdviceRetrieveActionTaskRecord(Object brandAdviceRetrieveActionTaskRecord) {
    this.brandAdviceRetrieveActionTaskRecord = brandAdviceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return brandAdviceRetrieveActionRequest
  **/

  public String getBrandAdviceRetrieveActionRequest() {
    return brandAdviceRetrieveActionRequest;
  }

  public void setBrandAdviceRetrieveActionRequest(String brandAdviceRetrieveActionRequest) {
    this.brandAdviceRetrieveActionRequest = brandAdviceRetrieveActionRequest;
  }


  /**
   * Get brandAdviceInstanceReport
   * @return brandAdviceInstanceReport
  **/

  public BQBrandAdviceRetrieveInputModelBrandAdviceInstanceReport getBrandAdviceInstanceReport() {
    return brandAdviceInstanceReport;
  }

  public void setBrandAdviceInstanceReport(BQBrandAdviceRetrieveInputModelBrandAdviceInstanceReport brandAdviceInstanceReport) {
    this.brandAdviceInstanceReport = brandAdviceInstanceReport;
  }


  /**
   * Get brandAdviceInstanceAnalysis
   * @return brandAdviceInstanceAnalysis
  **/

  public BQBrandAdviceRetrieveInputModelBrandAdviceInstanceAnalysis getBrandAdviceInstanceAnalysis() {
    return brandAdviceInstanceAnalysis;
  }

  public void setBrandAdviceInstanceAnalysis(BQBrandAdviceRetrieveInputModelBrandAdviceInstanceAnalysis brandAdviceInstanceAnalysis) {
    this.brandAdviceInstanceAnalysis = brandAdviceInstanceAnalysis;
  }


}

