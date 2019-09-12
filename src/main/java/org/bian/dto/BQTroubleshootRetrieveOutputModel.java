package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootRetrieveOutputModelTroubleshootInstanceAnalysis;
import org.bian.dto.BQTroubleshootRetrieveOutputModelTroubleshootInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTroubleshootRetrieveOutputModel
 */
public class BQTroubleshootRetrieveOutputModel   {
  private String troubleshootRetrieveActionTaskReference = null;

  private Object troubleshootRetrieveActionTaskRecord = null;

  private String troubleshootRetrieveActionResponse = null;

  private BQTroubleshootRetrieveOutputModelTroubleshootInstanceReport troubleshootInstanceReport = null;

  private BQTroubleshootRetrieveOutputModelTroubleshootInstanceAnalysis troubleshootInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Troubleshoot instance retrieve service call 
   * @return troubleshootRetrieveActionTaskReference
  **/

  public String getTroubleshootRetrieveActionTaskReference() {
    return troubleshootRetrieveActionTaskReference;
  }

  public void setTroubleshootRetrieveActionTaskReference(String troubleshootRetrieveActionTaskReference) {
    this.troubleshootRetrieveActionTaskReference = troubleshootRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return troubleshootRetrieveActionResponse
  **/

  public String getTroubleshootRetrieveActionResponse() {
    return troubleshootRetrieveActionResponse;
  }

  public void setTroubleshootRetrieveActionResponse(String troubleshootRetrieveActionResponse) {
    this.troubleshootRetrieveActionResponse = troubleshootRetrieveActionResponse;
  }


  /**
   * Get troubleshootInstanceReport
   * @return troubleshootInstanceReport
  **/

  public BQTroubleshootRetrieveOutputModelTroubleshootInstanceReport getTroubleshootInstanceReport() {
    return troubleshootInstanceReport;
  }

  public void setTroubleshootInstanceReport(BQTroubleshootRetrieveOutputModelTroubleshootInstanceReport troubleshootInstanceReport) {
    this.troubleshootInstanceReport = troubleshootInstanceReport;
  }


  /**
   * Get troubleshootInstanceAnalysis
   * @return troubleshootInstanceAnalysis
  **/

  public BQTroubleshootRetrieveOutputModelTroubleshootInstanceAnalysis getTroubleshootInstanceAnalysis() {
    return troubleshootInstanceAnalysis;
  }

  public void setTroubleshootInstanceAnalysis(BQTroubleshootRetrieveOutputModelTroubleshootInstanceAnalysis troubleshootInstanceAnalysis) {
    this.troubleshootInstanceAnalysis = troubleshootInstanceAnalysis;
  }


}

