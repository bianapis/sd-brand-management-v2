package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBrandManagementRetrieveInputModelServiceDomainOfferedService;
import org.bian.dto.SDBrandManagementRetrieveInputModelServiceDomainRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBrandManagementRetrieveInputModel
 */
public class SDBrandManagementRetrieveInputModel   {
  private Object serviceDomainRetrieveActionTaskRecord = null;

  private String serviceDomainRetrieveActionRequest = null;

  private SDBrandManagementRetrieveInputModelServiceDomainRetrieveActionRecord serviceDomainRetrieveActionRecord = null;

  private SDBrandManagementRetrieveInputModelServiceDomainOfferedService serviceDomainOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceDomainRetrieveActionTaskRecord
  **/

  public Object getServiceDomainRetrieveActionTaskRecord() {
    return serviceDomainRetrieveActionTaskRecord;
  }

  public void setServiceDomainRetrieveActionTaskRecord(Object serviceDomainRetrieveActionTaskRecord) {
    this.serviceDomainRetrieveActionTaskRecord = serviceDomainRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return serviceDomainRetrieveActionRequest
  **/

  public String getServiceDomainRetrieveActionRequest() {
    return serviceDomainRetrieveActionRequest;
  }

  public void setServiceDomainRetrieveActionRequest(String serviceDomainRetrieveActionRequest) {
    this.serviceDomainRetrieveActionRequest = serviceDomainRetrieveActionRequest;
  }


  /**
   * Get serviceDomainRetrieveActionRecord
   * @return serviceDomainRetrieveActionRecord
  **/

  public SDBrandManagementRetrieveInputModelServiceDomainRetrieveActionRecord getServiceDomainRetrieveActionRecord() {
    return serviceDomainRetrieveActionRecord;
  }

  public void setServiceDomainRetrieveActionRecord(SDBrandManagementRetrieveInputModelServiceDomainRetrieveActionRecord serviceDomainRetrieveActionRecord) {
    this.serviceDomainRetrieveActionRecord = serviceDomainRetrieveActionRecord;
  }


  /**
   * Get serviceDomainOfferedService
   * @return serviceDomainOfferedService
  **/

  public SDBrandManagementRetrieveInputModelServiceDomainOfferedService getServiceDomainOfferedService() {
    return serviceDomainOfferedService;
  }

  public void setServiceDomainOfferedService(SDBrandManagementRetrieveInputModelServiceDomainOfferedService serviceDomainOfferedService) {
    this.serviceDomainOfferedService = serviceDomainOfferedService;
  }


}

