package com.aria.sdk.classes;


import java.util.Map;


public class Aria_1 {

	public static void main(String[] args) throws Exception {
		
		
		/*REST CALL*/
	    BaseAriaBillingDTO baseAriaBillingDTO = new BaseAriaBillingDTO(
	                "https://secure.future.stage.ariasystems.net/api/ws/api_ws_class_dispatcher.php", "logger",
	                false/* Debug */, CallType.REST, OutPutFormat.OUTPUT_JSON, LibraryType.OBJECT_QUERY);


	    AriaBillingComplete ariaBillingComplete = AriaBillingBuilder.getAriaSDK(baseAriaBillingDTO);

	    AriaBillingIntegration ariaBillingIntegration = AriaBillingBuilder.getAriaObjectSDK(baseAriaBillingDTO);

	    
	    
	    com.aria.common.shared.EventListRow eventListRow1 = new com.aria.common.shared.EventListRow();
	    eventListRow1.setEventList(120L);
	    com.aria.common.shared.EventListRow eventListRow2 = new com.aria.common.shared.EventListRow();
	    eventListRow2.setEventList(130L);
	    com.aria.common.shared.EventListArray eventListArray = new com.aria.common.shared.EventListArray();
	    eventListArray.getEventListRow().add(eventListRow1);
	    eventListArray.getEventListRow().add(eventListRow2);

	    // Call the API
	    Map<String,Object> hashMapReturnValues = ariaBillingComplete.subscribeEvents(100L,"zzzz", eventListArray);
	
	    
	    // Read the output from the map as below.
	    System.out.println("error_code: " + hashMapReturnValues.get("error_code"));
	    System.out.println("error_msg: " + hashMapReturnValues.get("error_msg"));

	}

}
