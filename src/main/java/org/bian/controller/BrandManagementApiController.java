/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class BrandManagementApiController {

	@Autowired
	BrandManagementApiService service;
	
	@Manage.Activate
	public BianResponse<SDBrandManagementActivateOutputModel> activate(@RequestBody BianRequest<SDBrandManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Manage.Configure
	public BianResponse<SDBrandManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBrandManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("brandadvice")
	@Manage.Exchange
	public BianResponse<BQBrandAdviceExchangeOutputModel> exchangeBrandadvice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBrandAdviceExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeBrandadvice(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Feedback
	public BianResponse<SDBrandManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBrandManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Grant
	public BianResponse<CRBrandManagementPlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBrandManagementPlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("brandadvice")
	@Manage.Initiate
	public BianResponse<BQBrandAdviceInitiateOutputModel> initiateBrandadvice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQBrandAdviceInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateBrandadvice(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshoot")
	@Manage.Initiate
	public BianResponse<BQTroubleshootInitiateOutputModel> initiateTroubleshoot(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTroubleshootInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTroubleshoot(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("brandadvice")
	@Manage.Request
	public BianResponse<BQBrandAdviceRequestOutputModel> requestBrandadvice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBrandAdviceRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestBrandadvice(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshoot")
	@Manage.Request
	public BianResponse<BQTroubleshootRequestOutputModel> requestTroubleshoot(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTroubleshoot(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Request
	public BianResponse<CRBrandManagementPlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBrandManagementPlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Retrieve
	public BianResponse<CRBrandManagementPlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("brandadvice")
	@Manage.Retrieve
	public BianResponse<BQBrandAdviceRetrieveOutputModel> retrieveBrandadvice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBrandadvice(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("troubleshoot")
	@Manage.Retrieve
	public BianResponse<BQTroubleshootRetrieveOutputModel> retrieveTroubleshoot(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTroubleshoot(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Manage.RetrieveSD
	public BianResponse<SDBrandManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Manage.Update
	public BianResponse<CRBrandManagementPlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBrandManagementPlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("brandadvice")
	@Manage.Update
	public BianResponse<BQBrandAdviceUpdateOutputModel> updateBrandadvice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBrandAdviceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBrandadvice(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshoot")
	@Manage.Update
	public BianResponse<BQTroubleshootUpdateOutputModel> updateTroubleshoot(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTroubleshoot(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
