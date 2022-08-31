import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		RestAssured.baseURI = "http://172.223.0.46:9000";
		
		//RestAssured.basePath ="/v1/user/login";
		//RestAssured.baseURI = "http://172.223.0.46:9000";
		RequestSpecification request = RestAssured.given();

//	Response response = request.get();

	//	System.out.println(response.asString());
		
	
		JSONObject requestParams = new JSONObject(); 
		requestParams.put("password","Marutik10@"); 
		requestParams.put("userName","ckumar@prescienthg.com"); 
		

		
		request.header("Content-Type", "application/json"); 
		
		request.header("Accept", "application/json"); 
		
	//	request.header("orgCode","PHG001");
		
	//	request.header("projectCode","PROJECT000041");
		
	//	request.header("teamCode","team");
		
		
		// Add the Json to the body of the request 
		request.body(requestParams.toJSONString()); 
		
	        Response response = request.post("/v1/user/login"); 
	

		System.out.println("The status received: " + response.statusLine());
		System.out.println(response.asString());
		
		int statusCode = response.getStatusCode();
		
		 given().queryParam("userName","ckumar@prescienthg.com")
         .queryParam("password","Marutik10@")
         .when().post("http://172.223.0.46:9000/v1/user/login").getStatusCode();
 System.out.println("The response status is "+statusCode);

	//	given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
	//	body(request.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
		// Assert that correct status code is returned.
	//	Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
		
	}
		
		
		
		
		
		
	}


