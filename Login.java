import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import io.restassured.matcher.RestAssuredMatchers;
import static io.restassured.RestAssured.*;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;
public class Login {

	@Test
	public void post() {

	    RequestSpecification myreq = RestAssured.given();

		 Header h1= new Header("Accept", "*/*");
		    Header h2 = new Header("orgCode", "PHG001");
		    Header h3 = new Header("projectCode", "PROJECT000041");
		    Header h4 = new Header("teamCode", "team");
		    List<Header> list = new ArrayList<Header>();
		    list.add(h1);
		    list.add(h2);
		    list.add(h3);
		    list.add(h4);
		    
		    Headers header = new Headers(list);
		    
		    myreq.headers(header);
		

		JSONObject request=new JSONObject();
		
	
		
		request.put("password","Marutik10@");
		request.put("username", "ckumar@prescienthg.com");
		
         // System.out.println(request);
		
		System.out.println(request.toJSONString());
		
		

		
		//given().header("orgCode","PHG001").header("projectCode","PROJECT000041").header("teamode","team").
		//body(request.toJSONString()).when().post("http://172.223.0.65:9000/v1/user/login").then().statusCode(200).log().all();
		
         //   given().headers(header).body(request.toJSONString()).when().post("http://172.223.0.65:9000/v1/user/login").then().statusCode(200).log().all();
        //   given().header("Accept","*/*").header("orgCode","PHG001").header("projectCode","PROJECT000041").header("teamcode","team")
        //    .param("password","Marutik10@").param("username","ckumar@prescienthg.com").
    	//	when().post("http://172.223.0.65:9000/v1/user/login").then().statusCode(200).log().all();
		
            
           given().header("Content-Type","application/json").
           contentType(ContentType.JSON).accept(ContentType.JSON).
           header("orgCode","PHG001").header("projectCode","PROJECT000041").header("teamCode","team").
   		body(request.toJSONString()).when().post("http://172.223.0.65:9000/v1/user/login").then().statusCode(200).log().all();
            
		

	}
	
	
	
	
	
}
