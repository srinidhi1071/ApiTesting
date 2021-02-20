package bbmsapitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ContactUsAPITest extends BaseLib {
	
	@Test
	public void ContactUsPOSTTest() {
		given()
			.basePath("/api/contactus")
			.headers("Content-Type", ContentType.JSON)
			.body("{\r\n" + 
					"  \"email\": \"testTwo@gmail.com\",\r\n" + 
					"  \"fullName\": \"Test three\",\r\n" + 
					"  \"message\": \"Some Message Random\",\r\n" + 
					"  \"mobileNo\": 7778889991\r\n" + 
					"}")
	   .when()
	   		.post()
	   .then()
	   		.statusCode(200)
			.time(lessThan(5000L))
			.body("fullName", equalTo("Test three"));
	}
}
