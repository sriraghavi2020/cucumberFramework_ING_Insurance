package ING_Insurance.TestRunner.StepDefenition;



import ING_Insurance.RsetAPI.RestAPI_Calls;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class restAPIStepDef {
	
	RestAPI_Calls restApicalls = new RestAPI_Calls();
		
	@Given("^The base Uri is (.*)$")
	public void The_base_Uri_is(String baseURI) {
		
		restApicalls.baseURI(baseURI);
	}
	
	@Then("^The request URI is (.*)$")
	public void The_request_URI_is(String URI) {
		restApicalls.reqURI(URI);
	}
	
	
	@Then("^Hit the API with get call$")
	public void Hit_the_API_with_get_call() {
		restApicalls.getCall();
	}
	
	
	@Then("^Get the response from call and store in file (.*)$")
	public void Get_the_response_from_call_and_store_in_file(String filePath) {
		
		restApicalls.storing_ResponseOfGetcall(filePath);
		
	}
	@Then("^jsonBody for post call request$")
	public void jsonBody_for_post_call_request(DataTable payLoad) {
		restApicalls.postCallReq(payLoad);	
		// if we pass pay load as a data table when we post, it post as a map with 'map' word and the whole array
	}
	
	@Then("^Hit the API with Post call request$")
	public void Hit_the_API_with_post_call_request() {
		restApicalls.postCallRequest();
	}
	
	@Then("^jsonBody for post call request (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
	public void jsonBody_for_post_call_request(String id, String Car_Name, String Type, String Transmission, String Fuel_Type, String Colour, String Customer_Name) {
		restApicalls.jsonPayloadForpostCallReq(id, Car_Name, Type, Transmission, Fuel_Type, Colour, Customer_Name);
		//if we pass pay load as every single object, we can then map them and post a proper json payload 
	}
	@Then("^Store the post call response in file (.*)$")
	public void Store_the_post_call_response_in_file(String filePath) {
		restApicalls.storingPostCallResponse(filePath);
	}
	
	@Then("^jsonBody for delete call request (.*)$")
	public void jsonBody_for_delete_call_request(String id) {
		restApicalls.jsonPayloadForDeletecallReq(id);
	}
	
	@Then("^Hit the API with delete call request (.*)$")
	public void Hit_the_API_with_delete_call_request(String id) {
		restApicalls.deleteCallRequest(id);
	}
	
	@Then("^Store the delete call response in file (.*) (.*)$")
	public void Store_the_delete_call_response_in_file(String filePath, String id) {
		restApicalls.storingDeleteCallResponse(filePath, id);
	}

}
