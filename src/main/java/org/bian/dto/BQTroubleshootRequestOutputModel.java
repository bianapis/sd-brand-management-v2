package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootRequestOutputModel
 */
public class BQTroubleshootRequestOutputModel   {
  private String troubleshootRequestActionTaskReference = null;

  private Object troubleshootRequestActionTaskRecord = null;

  private String troubleshootRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Troubleshoot instance request service call 
   * @return troubleshootRequestActionTaskReference
  **/

  public String getTroubleshootRequestActionTaskReference() {
    return troubleshootRequestActionTaskReference;
  }

  public void setTroubleshootRequestActionTaskReference(String troubleshootRequestActionTaskReference) {
    this.troubleshootRequestActionTaskReference = troubleshootRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return troubleshootRequestActionTaskRecord
  **/

  public Object getTroubleshootRequestActionTaskRecord() {
    return troubleshootRequestActionTaskRecord;
  }

  public void setTroubleshootRequestActionTaskRecord(Object troubleshootRequestActionTaskRecord) {
    this.troubleshootRequestActionTaskRecord = troubleshootRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Troubleshoot service request record 
   * @return troubleshootRequestRecordReference
  **/

  public String getTroubleshootRequestRecordReference() {
    return troubleshootRequestRecordReference;
  }

  public void setTroubleshootRequestRecordReference(String troubleshootRequestRecordReference) {
    this.troubleshootRequestRecordReference = troubleshootRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

