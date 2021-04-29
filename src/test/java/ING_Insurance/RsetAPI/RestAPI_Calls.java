package ING_Insurance.RsetAPI;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

import io.cucumber.datatable.DataTable;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAPI_Calls {
	
	String baseuri;
	String reqURL;
	long responseTime;
	int responseStatusCode;
	String responsebody;
	Map<String, Object> map;
	
	
	public void baseURI(String baseURI) {
		baseuri = baseURI;
	}
	
	
	public void reqURI(String URI) {
		reqURL = URI;
	}
	
	public void getCall() {
		
		RestAssured.baseURI = baseuri;
		Response response = RestAssured.get(reqURL);
		responseTime = response.getTime();
		responseStatusCode = response.getStatusCode();
		responsebody = response.getBody().asString(); 
	}
	
	
	public void storing_ResponseOfGetcall(String filePath) {
		try {
			File file = new File(System.getProperty("user.dir")+filePath);
		
				FileOutputStream fileOT = new FileOutputStream(file);
				PrintWriter pr = new PrintWriter(fileOT);
				pr.println("Response time: "+responseTime);
				pr.println("Status code: "+responseStatusCode);
				pr.println("Body: "+responsebody);
				pr.flush();
				pr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public void postCallReq(DataTable payLoad) {
		List<Map<String, String>> payL = payLoad.asMaps();
		
		map = new HashMap<String, Object>();
		for(int i=0; i<payL.size(); i++) {
			map.put((String) payL.get(i).get("Key"), payL.get(i).get("Value"));
		}
	}
	
	public void jsonPayloadForpostCallReq(String id, String Car_Name, String Type, String Transmission, String Fuel_Type, String Colour, String Customer_Name) {
		map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("Car Name", Car_Name);
		map.put("Type", Type);
		map.put("Transmission", Transmission);
		map.put("Fuel Type", Fuel_Type);
		map.put("Colour", Colour);
		map.put("Customer Name", Customer_Name);
	}
	
	public void jsonPayloadForDeletecallReq(String id) {
		map = new HashMap<String, Object>();
		map.put("id", id);
	}
	public void postCallRequest() {
		JSONObject json = new JSONObject(map);
		
		RestAssured.baseURI = baseuri;
		RequestSpecification apiRequest = RestAssured.given();
		apiRequest.body(json.toJSONString());
		apiRequest. header("ContentType","application/json");
		apiRequest.contentType(ContentType.JSON).accept(ContentType.JSON);
		Response response = apiRequest.post(reqURL);    
		  
			
		responseTime = response.getTime();
		responseStatusCode = response.getStatusCode();
		
		   
	}
	
	public void deleteCallRequest(String id) {
		JSONObject json = new JSONObject(map);
		
		RestAssured.baseURI = baseuri;
		RequestSpecification apiRequest = RestAssured.given();
		
		apiRequest.body(json.toJSONString());
		apiRequest.header("ContentType", "application/json");
		apiRequest.contentType(ContentType.JSON).accept(ContentType.JSON);
		Response response  = apiRequest.delete(reqURL+"/"+id);
		
		responseStatusCode = response.getStatusCode();
	}
	
	public void storingPostCallResponse(String filePath) {
		
		try {
		File file = new File(System.getProperty("user.dir")+filePath);
		FileOutputStream fileIO = new FileOutputStream(file, true);
		PrintWriter pr = new PrintWriter(fileIO);
		pr.println("Response for PostCall");
		pr.println("Response time: "+responseTime);
		pr.println("Response Status: "+responseStatusCode);
		pr.flush();
		pr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
public void storingDeleteCallResponse(String filePath,String id) {
		
		try {
		File file = new File(System.getProperty("user.dir")+filePath);
		FileOutputStream fileIO = new FileOutputStream(file, true);
		PrintWriter pr = new PrintWriter(fileIO);
		pr.println("Response for DeleteCall for id: "+id);
		pr.println("Response Status: "+responseStatusCode);
		pr.flush();
		pr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
