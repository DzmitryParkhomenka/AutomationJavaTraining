package RestAssure.Test;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestTemplTest {
		
	@Test
	public void checkStatusCode() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Post[]> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", Post[].class);
		int actStatusCode = response.getStatusCode().value();
		Assert.assertEquals(actStatusCode, 200);
	}
	
	@Test
	public void checkResponseHeader() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Post[]> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", Post[].class);
		HttpHeaders httpHeaders = response.getHeaders();
		String contentType = httpHeaders.getContentType().toString();
		Assert.assertEquals(contentType, "application/json;charset=utf-8");
	}
	
	@Test
	public void checkResponseBody() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Post[]> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", Post[].class);
		Post[] post = response.getBody();
		Assert.assertEquals(post.length, 10);
	}
}
