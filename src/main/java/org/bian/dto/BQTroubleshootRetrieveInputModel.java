package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootRetrieveInputModelTroubleshootInstanceAnalysis;
import org.bian.dto.BQTroubleshootRetrieveInputModelTroubleshootInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTroubleshootRetrieveInputModel
 */
public class BQTroubleshootRetrieveInputModel   {
  private Object troubleshootRetrieveActionTaskRecord = null;

  private String troubleshootRetrieveActionRequest = null;

  private BQTroubleshootRetrieveInputModelTroubleshootInstanceReport troubleshootInstanceReport = null;

  private BQTroubleshootRetrieveInputModelTroubleshootInstanceAnalysis troubleshootInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return troubleshootRetrieveActionTaskRecord
  **/

  public Object getTroubleshootRetrieveActionTaskRecord() {
    return troubleshootRetrieveActionTaskRecord;
  }

  public void setTroubleshootRetrieveActionTaskRecord(Object troubleshootRetrieveActionTaskRecord) {
    this.troubleshootRetrieveActionTaskRecord = troubleshootRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return troubleshootRetrieveActionRequest
  **/

  public String getTroubleshootRetrieveActionRequest() {
    return troubleshootRetrieveActionRequest;
  }

  public void setTroubleshootRetrieveActionRequest(String troubleshootRetrieveActionRequest) {
    this.troubleshootRetrieveActionRequest = troubleshootRetrieveActionRequest;
  }


  /**
   * Get troubleshootInstanceReport
   * @return troubleshootInstanceReport
  **/

  public BQTroubleshootRetrieveInputModelTroubleshootInstanceReport getTroubleshootInstanceReport() {
    return troubleshootInstanceReport;
  }

  public void setTroubleshootInstanceReport(BQTroubleshootRetrieveInputModelTroubleshootInstanceReport troubleshootInstanceReport) {
    this.troubleshootInstanceReport = troubleshootInstanceReport;
  }


  /**
   * Get troubleshootInstanceAnalysis
   * @return troubleshootInstanceAnalysis
  **/

  public BQTroubleshootRetrieveInputModelTroubleshootInstanceAnalysis getTroubleshootInstanceAnalysis() {
    return troubleshootInstanceAnalysis;
  }

  public void setTroubleshootInstanceAnalysis(BQTroubleshootRetrieveInputModelTroubleshootInstanceAnalysis troubleshootInstanceAnalysis) {
    this.troubleshootInstanceAnalysis = troubleshootInstanceAnalysis;
  }


}

