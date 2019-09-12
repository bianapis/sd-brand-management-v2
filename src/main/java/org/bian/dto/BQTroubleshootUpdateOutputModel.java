package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootUpdateOutputModel
 */
public class BQTroubleshootUpdateOutputModel   {
  private String troubleshootUpdateActionTaskReference = null;

  private Object troubleshootUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return troubleshootUpdateActionTaskReference
  **/

  public String getTroubleshootUpdateActionTaskReference() {
    return troubleshootUpdateActionTaskReference;
  }

  public void setTroubleshootUpdateActionTaskReference(String troubleshootUpdateActionTaskReference) {
    this.troubleshootUpdateActionTaskReference = troubleshootUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return troubleshootUpdateActionTaskRecord
  **/

  public Object getTroubleshootUpdateActionTaskRecord() {
    return troubleshootUpdateActionTaskRecord;
  }

  public void setTroubleshootUpdateActionTaskRecord(Object troubleshootUpdateActionTaskRecord) {
    this.troubleshootUpdateActionTaskRecord = troubleshootUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

