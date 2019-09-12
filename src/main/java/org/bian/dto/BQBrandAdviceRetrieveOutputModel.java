package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceAnalysis;
import org.bian.dto.BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBrandAdviceRetrieveOutputModel
 */
public class BQBrandAdviceRetrieveOutputModel   {
  private String brandAdviceRetrieveActionTaskReference = null;

  private Object brandAdviceRetrieveActionTaskRecord = null;

  private String brandAdviceRetrieveActionResponse = null;

  private BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceReport brandAdviceInstanceReport = null;

  private BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceAnalysis brandAdviceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Brand Advice instance retrieve service call 
   * @return brandAdviceRetrieveActionTaskReference
  **/

  public String getBrandAdviceRetrieveActionTaskReference() {
    return brandAdviceRetrieveActionTaskReference;
  }

  public void setBrandAdviceRetrieveActionTaskReference(String brandAdviceRetrieveActionTaskReference) {
    this.brandAdviceRetrieveActionTaskReference = brandAdviceRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return brandAdviceRetrieveActionResponse
  **/

  public String getBrandAdviceRetrieveActionResponse() {
    return brandAdviceRetrieveActionResponse;
  }

  public void setBrandAdviceRetrieveActionResponse(String brandAdviceRetrieveActionResponse) {
    this.brandAdviceRetrieveActionResponse = brandAdviceRetrieveActionResponse;
  }


  /**
   * Get brandAdviceInstanceReport
   * @return brandAdviceInstanceReport
  **/

  public BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceReport getBrandAdviceInstanceReport() {
    return brandAdviceInstanceReport;
  }

  public void setBrandAdviceInstanceReport(BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceReport brandAdviceInstanceReport) {
    this.brandAdviceInstanceReport = brandAdviceInstanceReport;
  }


  /**
   * Get brandAdviceInstanceAnalysis
   * @return brandAdviceInstanceAnalysis
  **/

  public BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceAnalysis getBrandAdviceInstanceAnalysis() {
    return brandAdviceInstanceAnalysis;
  }

  public void setBrandAdviceInstanceAnalysis(BQBrandAdviceRetrieveOutputModelBrandAdviceInstanceAnalysis brandAdviceInstanceAnalysis) {
    this.brandAdviceInstanceAnalysis = brandAdviceInstanceAnalysis;
  }


}

