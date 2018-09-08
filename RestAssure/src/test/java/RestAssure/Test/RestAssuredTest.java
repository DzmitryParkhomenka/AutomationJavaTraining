package RestAssure.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;

public class RestAssuredTest {
	
	@BeforeTest
	public void initTest() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	}
	
	@Test
	public void checkStatusCode() {
		Response response = RestAssured.when()
				.get("/users")
				.andReturn();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void checkResponseHeader() {
		Response response = RestAssured.when()
			.get("/users")
			.andReturn();
		String contentTypeHeader = response.getHeader("Content-Type");
		Assert.assertEquals(contentTypeHeader, "application/json; charset=utf-8");
	}
	
	@Test
	public void checkResponseBody() {
		Response response = RestAssured.when()
				.get("/users")
				.andReturn();
		ResponseBody<?> responseBody = response.getBody();
		Post[] post = responseBody.as(Post[].class);
		Assert.assertEquals(post.length, 10);
	}
}
