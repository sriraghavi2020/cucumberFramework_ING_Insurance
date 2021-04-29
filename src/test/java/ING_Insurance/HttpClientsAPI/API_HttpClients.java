package ING_Insurance.HttpClientsAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;


public class API_HttpClients {
	
	
	String baseURI;
	String reqURI;
	
	String URL;
	
	int statusCode;
	String getcallresponse_JsonString;
	JSONArray json;
	public void baseURI(String uri) {
		
		baseURI = uri;
	}
	
	public void reqURI(String uri) {
		reqURI = uri;
		URL = baseURI+"/"+reqURI;
	}
	
	public void getCallReq() {
		
		CloseableHttpClient link = HttpClients.createDefault();
		HttpGet getReq = new HttpGet(URL);
		try {
			CloseableHttpResponse response = link.execute(getReq);
			statusCode = response.getStatusLine().getStatusCode();
			getcallresponse_JsonString = EntityUtils.toString(response.getEntity(), "UTF-8");
			json = new JSONArray(getcallresponse_JsonString);
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void storing_reponseInFile(String filePath) {
		try {
		File file = new File(System.getProperty("user.dir")+filePath);
			FileOutputStream fileIO = new FileOutputStream(file, true);
			PrintWriter pr = new PrintWriter(fileIO);
			pr.println("GetCall Response");
			pr.println("StatusCode: "+statusCode);
			pr.println("Response body as JsonString: "+getcallresponse_JsonString);
			pr.println("Response body as Json Array: "+json);
			pr.close();
			pr.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
