import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.given;



import java.rmi.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;
import io.restassured.specification.RequestSpecification;

public class CP1 {

	
	@SuppressWarnings("unchecked")
	@Test
	public void postdata() {

		RestAssured.baseURI = "http://172.223.0.46:9000";
             
		 String requestBody = "{\r\n"
		 		+ "  \r\n"
		 		+ "  \"password\": \"Marutik10@\",\r\n"
		 		+ "  \"userName\": \"ckumar@prescienthg.com\"\r\n"
		 		+ "}";
		 
		
		  RequestSpecification httpRequest=RestAssured.given();


		 // Response response=httpRequest.request(Method.POST,"/v1/user/login");

		//RequestSpecification request = RestAssured.given();
		  
		  
		  //httpRequest.header("Content-Type", "application/json"); 
			
		  //httpRequest.header("Accept", "application/json"); 
		  
		  
		  Response response1 = null;
		  
	        try {
	            response1 = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .body(requestBody)
	                .post("v1/user/login");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

		//JSONObject requestParams = new JSONObject();
		//requestParams.put("password","Marutik10@");
		//requestParams.put("userName","ckumar@prescienthg.com");

		//System.out.println(requestParams);
		//System.out.println(requestParams.toJSONString());

	/*	given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(requestParams.toJSONString()).
		when().
		post("http://172.223.0.46:7070/v1/user/login").
		then().
		statusCode(200);
		
		*/
	//	String responseBody=response.getBody().asString();
		//  System.out.println("Response Body is:" +responseBody);
		  
		  
		//  System.out.println(response.getStatusCode());
		  


		}
	
	
	
	
	
	
}
