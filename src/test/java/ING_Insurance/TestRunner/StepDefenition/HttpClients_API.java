package ING_Insurance.TestRunner.StepDefenition;
import ING_Insurance.HttpClientsAPI.API_HttpClients;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class HttpClients_API {
	
	API_HttpClients clientClass = new API_HttpClients();

	
	@Given("^Base URI for get call is (.*)$")
	public void base_URI_for_get_call_is(String URI) {
		clientClass.baseURI(URI);
	}
	
	@Then("^Request URI is (.*)$")
	public void request_URI_is(String reqURI) {
		clientClass.reqURI(reqURI);
	}
	
	@Then("^Hit api with httpClient Get call$")
	public void Hit_api_with_httpClient_Get_call() {
		clientClass.getCallReq();
	}
	
	@Then("^Store the reponse in file (.*)$")
	public void store_the_reponse_in_file(String filePath) {
		clientClass.storing_reponseInFile(filePath);
	}
}
