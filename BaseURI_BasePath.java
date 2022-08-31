
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class BaseURI_BasePath {

	
	@Test
	public void Request1() {
		RequestSpecification request = RestAssured.given();
		// Setting Base URI
		//request.baseUri("https://restful-booker.herokuapp.com");
		request.baseUri("http://172.223.0.65:9000/v1");
		// Setting Base Path
		request.basePath("user/login");

		Response response = request.get();

		System.out.println(response.asString());
	}
	
	@Test
	public void Request2() {
		RequestSpecification request = RestAssured.given();
		// Setting Base URI
		request.baseUri("https://restful-booker.herokuapp.com");
		// Setting Base Path
		request.basePath("/booking");

		Response response = request.get();

		System.out.println(response.asString());
	}
	
	
	
}
