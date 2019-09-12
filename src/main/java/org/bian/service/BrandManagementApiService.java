/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface BrandManagementApiService {

	SDBrandManagementActivateOutputModel activate(SDBrandManagementActivateInputModel request);
	
	SDBrandManagementConfigureOutputModel configure(String sdReferenceId, SDBrandManagementConfigureInputModel request);
	
	BQBrandAdviceExchangeOutputModel exchangeBrandadvice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBrandAdviceExchangeInputModel request);
	
	SDBrandManagementFeedbackOutputModel feedback(String sdReferenceId, SDBrandManagementFeedbackInputModel request);
	
	CRBrandManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBrandManagementPlanGrantInputModel request);
	
	BQBrandAdviceInitiateOutputModel initiateBrandadvice(String sdReferenceId, String crReferenceId, BQBrandAdviceInitiateInputModel request);
	
	BQTroubleshootInitiateOutputModel initiateTroubleshoot(String sdReferenceId, String crReferenceId, BQTroubleshootInitiateInputModel request);
	
	BQBrandAdviceRequestOutputModel requestBrandadvice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBrandAdviceRequestInputModel request);
	
	BQTroubleshootRequestOutputModel requestTroubleshoot(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootRequestInputModel request);
	
	CRBrandManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBrandManagementPlanRequestInputModel request);
	
	CRBrandManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQBrandAdviceRetrieveOutputModel retrieveBrandadvice(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTroubleshootRetrieveOutputModel retrieveTroubleshoot(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDBrandManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRBrandManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBrandManagementPlanUpdateInputModel request);
	
	BQBrandAdviceUpdateOutputModel updateBrandadvice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBrandAdviceUpdateInputModel request);
	
	BQTroubleshootUpdateOutputModel updateTroubleshoot(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootUpdateInputModel request);
	
}
