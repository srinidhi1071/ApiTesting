package bbmsapitesting;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AuthenticationAPITest {
	
//	@Test
//	public void testGoogleMapsDistanceApi() {
//			given()
//				.baseUri("https://maps.googleapis.com")
//				.basePath("/maps/api/distancematrix/json")
//				.queryParam("origins", "hyderabad")
//				.queryParam("destinations", "bangalore")
//				.queryParam("key", "AIzaSyA9AXLd8z3faf9Q79Cb9xrNUHyEy6E1oQ4")
//			.when()
//				.get()
//			.then()
//				.body("origin_addresses[0]", containsStringIgnoringCase("hyderabad"))
//				.body("destination_addresses[0]", containsStringIgnoringCase("Bengaluru"))
//				.body("rows[0].elements[0].distance.text", lessThanOrEqualTo("600 km"));
//	}
	
//	@Test
//	public void testGithubCreateRepoForUser() {
//		given()
//			.auth()
//				.oauth2("9ee0df5695bbad82674cb499dda033a985159938")
//			.baseUri("https://api.github.com")
//			.basePath("/user/repos")
//			.contentType(ContentType.JSON)
//			.body("{\r\n" + 
//					"    \"name\":\"GitHubApiTestRepoOne\"\r\n" + 
//					"}")
//		.when()
//			.post()
//		.then()
//			.body("name",equalTo( "GitHubApiTestRepoOne"));
//	}
	
//	@Test
//	public void testTwitterPostStatusApi() {
//		given()
//			.auth().oauth("TqUoXARVjeO6kOwo0k6dgjp0d", "yaYqc9DaE16sME2D4gGEe1JdSA8aPf8tgZeXdcptRWxSd3sG0V",
//								"1350992723805929476-gWbgeHlvz637fSoMdhYjY2MbwoGcXM", "svJhnPMcRyFsjs5BsN4tg7Pi9SVyvQBFhOk2MhUStGI7s")
//			.baseUri("https://api.twitter.com")
//			.basePath("/1.1/statuses/update.json")
//			.queryParam("status", "Hello World")
//	   .when()
//	   		.post()
//	   .then()
//	   		.body("text", equalTo("Hello World"));
//			
//	}

}
