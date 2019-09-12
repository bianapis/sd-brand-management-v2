/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class BrandManagementApiServiceImpl implements BrandManagementApiService {

	public SDBrandManagementActivateOutputModel activate(SDBrandManagementActivateInputModel request){
		return JsonReader.read("activate-SDBrandManagementActivateOutputModel.json",new TypeReference<SDBrandManagementActivateOutputModel>(){});
	}
	
	public SDBrandManagementConfigureOutputModel configure(String sdReferenceId, SDBrandManagementConfigureInputModel request){
		return JsonReader.read("configure-SDBrandManagementConfigureOutputModel.json",new TypeReference<SDBrandManagementConfigureOutputModel>(){});
	}
	
	public BQBrandAdviceExchangeOutputModel exchangeBrandadvice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBrandAdviceExchangeInputModel request){
		return JsonReader.read("exchange-BQBrandAdviceExchangeOutputModel.json",new TypeReference<BQBrandAdviceExchangeOutputModel>(){});
	}
	
	public SDBrandManagementFeedbackOutputModel feedback(String sdReferenceId, SDBrandManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDBrandManagementFeedbackOutputModel.json",new TypeReference<SDBrandManagementFeedbackOutputModel>(){});
	}
	
	public CRBrandManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBrandManagementPlanGrantInputModel request){
		return JsonReader.read("grant-CRBrandManagementPlanGrantOutputModel.json",new TypeReference<CRBrandManagementPlanGrantOutputModel>(){});
	}
	
	public BQBrandAdviceInitiateOutputModel initiateBrandadvice(String sdReferenceId, String crReferenceId, BQBrandAdviceInitiateInputModel request){
		return JsonReader.read("initiate-BQBrandAdviceInitiateOutputModel.json",new TypeReference<BQBrandAdviceInitiateOutputModel>(){});
	}
	
	public BQTroubleshootInitiateOutputModel initiateTroubleshoot(String sdReferenceId, String crReferenceId, BQTroubleshootInitiateInputModel request){
		return JsonReader.read("initiate-BQTroubleshootInitiateOutputModel.json",new TypeReference<BQTroubleshootInitiateOutputModel>(){});
	}
	
	public BQBrandAdviceRequestOutputModel requestBrandadvice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBrandAdviceRequestInputModel request){
		return JsonReader.read("request-BQBrandAdviceRequestOutputModel.json",new TypeReference<BQBrandAdviceRequestOutputModel>(){});
	}
	
	public BQTroubleshootRequestOutputModel requestTroubleshoot(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootRequestInputModel request){
		return JsonReader.read("request-BQTroubleshootRequestOutputModel.json",new TypeReference<BQTroubleshootRequestOutputModel>(){});
	}
	
	public CRBrandManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBrandManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRBrandManagementPlanRequestOutputModel.json",new TypeReference<CRBrandManagementPlanRequestOutputModel>(){});
	}
	
	public CRBrandManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRBrandManagementPlanRetrieveOutputModel.json",new TypeReference<CRBrandManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQBrandAdviceRetrieveOutputModel retrieveBrandadvice(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBrandAdviceRetrieveOutputModel.json",new TypeReference<BQBrandAdviceRetrieveOutputModel>(){});
	}
	
	public BQTroubleshootRetrieveOutputModel retrieveTroubleshoot(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTroubleshootRetrieveOutputModel.json",new TypeReference<BQTroubleshootRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDBrandManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDBrandManagementRetrieveOutputModel.json",new TypeReference<SDBrandManagementRetrieveOutputModel>(){});
	}
	
	public CRBrandManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBrandManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRBrandManagementPlanUpdateOutputModel.json",new TypeReference<CRBrandManagementPlanUpdateOutputModel>(){});
	}
	
	public BQBrandAdviceUpdateOutputModel updateBrandadvice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBrandAdviceUpdateInputModel request){
		return JsonReader.read("update-BQBrandAdviceUpdateOutputModel.json",new TypeReference<BQBrandAdviceUpdateOutputModel>(){});
	}
	
	public BQTroubleshootUpdateOutputModel updateTroubleshoot(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootUpdateInputModel request){
		return JsonReader.read("update-BQTroubleshootUpdateOutputModel.json",new TypeReference<BQTroubleshootUpdateOutputModel>(){});
	}
	
}
