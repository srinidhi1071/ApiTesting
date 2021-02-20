package bbmsapitesting;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class BaseLib {
	
	@BeforeTest
	public void setUp() {
		RestAssured.baseURI = "http://localhost:8084";
	}

}
