import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CP {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
RestAssured.baseURI = "http://172.223.0.46:9000";
		
		//RestAssured.basePath ="/v1/user/login";
		//RestAssured.baseURI = "http://172.223.0.46:9000";
		RequestSpecification request = RestAssured.given();

	//Response response = request.get();

	//	System.out.println(response.asString());
		
	
		JSONObject requestParams = new JSONObject(); 
		//requestParams.put("password","Marutik10@"); 
		requestParams.put("confirmPassword", "Chiragk10@")	;

		requestParams.put("userName","ckumar@prescienthg.com");
		requestParams.put("orgCode", "PHG001")	;
		requestParams.put("oldPassword", "Maruti10@")	;
		requestParams.put("newPassword", "Chiragk10@")	;
	//	requestParams.put("confirmPassword", "Chiragk10@")	;
		request.header("Content-Type", "application/json"); 
		
		request.header("Accept", "application/json"); 
		
	//	request.header("orgCode","PHG001");
		
	//	request.header("projectCode","PROJECT000041");
		
	//	request.header("teamCode","team");
		
		
		// Add the Json to the body of the request 
		request.body(requestParams.toJSONString()); 
		
		Response response = request.post("/v1/user/changePassword"); 
	

		System.out.println("The status received: " + response.statusLine());
		System.out.println(response.asString());
		
		int statusCode = response.getStatusCode();

	//	given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
	//	body(request.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
		// Assert that correct status code is returned.
	//	Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
		
		
		
		
		
		
		
		
		
	}

}
