package bbmsapitesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.Donar;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DonarAPITest extends BaseLib {
	
//	@Test
//	public void addBloodDonarWithBasicAuthWithStringPayload() {
//		given()
//			.auth().preemptive().basic("admin", "admin123")
//			.contentType(ContentType.JSON)
//			.baseUri("http://localhost:8084")
//			.basePath("/api/donar")
//			.body("{\r\n" + 
//					"  \"address\": \"Bangalore\",\r\n" + 
//					"  \"age\": 35,\r\n" + 
//					"  \"bloodGroup\": \"AB+\",\r\n" + 
//					"  \"emailId\": \"testNameOne@gmail.com\",\r\n" + 
//					"  \"fullName\": \"TestNameOne\",\r\n" + 
//					"  \"gender\": \"Male\",\r\n" + 
//					"  \"mobileNo\": \"9999999999\"\r\n" + 
//					"}")
//	  .when()
//	  	.post()
//	  .then()
//	  	.statusCode(201)
//		.body("fullName", equalTo("TestNameOne"))
//		.body("mobileNo", equalTo("9999999999"));
//	}
	
//	@Test
//	public void addBloodDonarWithBasicAuthAndMapPayload() {
//		Map<String,Object> payload = new HashMap<String,Object>();
//		payload.put("address", "Bangalore");
//		payload.put("age", "40");
//		payload.put("bloodGroup", "O+");
//		payload.put("emailId", "randomOne@gmail.com");
//		payload.put("fullName", "RandomOne");
//		payload.put("gender", "Male");
//		payload.put("mobileNo", "8989898989");
//		
//		given()
//			.auth().preemptive().basic("admin", "admin123")
//			.contentType(ContentType.JSON)
//			.baseUri("http://localhost:8084")
//			.basePath("/api/donar")
//			.body(payload)
//	  .when()
//	  	.post()
//	  .then()
//	  	.statusCode(201)
//		.body("fullName", equalTo("RandomOne"))
//		.body("mobileNo", equalTo("8989898989"));
//	}
	
//	@Test
//	public void addBloodDonarWithBasicAuthAndJsonFilePayload() {
//		given()
//			.auth().preemptive().basic("admin", "admin123")
//			.contentType(ContentType.JSON)
//			.baseUri("http://localhost:8084")
//			.basePath("/api/donar")
//			.body(new File("C:\\Users\\Srinidhi\\Desktop\\RestAssuredData\\PostDonar.json"))
//	  .when()
//	  	.post()
//	  .then()
//	  	.statusCode(201)
//		.body("fullName", equalTo("Akshay"))
//		.body("mobileNo", equalTo("7897897899"));
//	}
	
//	@Test
//	public void addBloodDonarWithBasicAuthAndModelPayload() {
//		Donar donarOne = new Donar();
//		donarOne.setAddress("Mysore");
//		donarOne.setAge(30);
//		donarOne.setBloodGroup("B+");
//		donarOne.setEmailId("Sharath@gmail.com");
//		donarOne.setFullName("Sharath");
//		donarOne.setGender("Male");
//		donarOne.setMobileNo("9879879877");
//		
//		given()
//			.auth().preemptive().basic("admin", "admin123")
//			.contentType(ContentType.JSON)
//			.baseUri("http://localhost:8084")
//			.basePath("/api/donar")
//			.body(donarOne)
//	  .when()
//	  	.post()
//	  .then()
//	  	.statusCode(201)
//		.body("fullName", equalTo("Sharath"))
//		.body("mobileNo", equalTo("9879879877"));
//	}
	
	@Test
	public void getSingleDonarDetails() {
		
		Donar donarObject = given()
			.contentType(ContentType.JSON)
			.baseUri("http://localhost:8084")
			.basePath("/api/donar/1")
	  .when()
	  	.get().as(Donar.class);
		Assert.assertEquals("TestNameOne", donarObject.getFullName());
		Assert.assertEquals("RandomEmail007@gmail.com", donarObject.getEmailId());
	}
	
	
	@BeforeClass
	public void setUpPath() {
		RestAssured.basePath="/api/donar";
	}
	
//	@Test
//	public void getDonarsBasedOnBloodGroup() {
//		Donar[] donarList = given()
//			.queryParam("bloodGroup", "AB+")
//		.when()
//			.get().as(Donar[].class);
//		for(Donar donar:donarList) {
//			Assert.assertEquals(donar.getBloodGroup(), "AB+");
//		}
//		
//	}
//	@Test
//	public void modifyDonarDetails() {
//			given()
//				.contentType(ContentType.JSON)
//			.when()
//				.body("{\r\n" + 
//						"        \"fullName\": \"TestNameOne\",\r\n" + 
//						"        \"mobileNo\": \"9999999999\",\r\n" + 
//						"        \"emailId\": \"testNameOne@gmail.com\",\r\n" + 
//						"        \"gender\": \"Male\",\r\n" + 
//						"        \"age\": 35,\r\n" + 
//						"        \"bloodGroup\": \"O-\",\r\n" + 
//						"        \"address\": \"Bangalore\"\r\n" + 
//						"    }")
//				.put("http://localhost:8084/api/donar/2")
//			
//			.then()
//				.statusCode(200)
//				.body("bloodGroup", equalTo("O-"));
//				
//	}
	
//	@Test
//	public void modifySpecificFields() {
//		given()
//			.contentType(ContentType.JSON)
//		.when()
//			.body("{\r\n" + 
//					"    \"emailId\": \"RandomEmail007@gmail.com\",\r\n" + 
//					"    \"address\": \"Mysore\"\r\n" + 
//					"}")
//			.patch("http://localhost:8084/api/donar/1")
//		.then().log().all();
//	}
	
//	@Test
//	public void deleteDonar() {
//		given()
//			.contentType(ContentType.JSON)
//		.when()
//			.delete("http://localhost:8084/api/donar/3")
//		.then()
//			.statusCode(200)
//			.body("message", equalTo("Donar with Id :: 3 has been deleted"));
//	}
//	
	
//	@Test
//	public void apiTestChaining() {
//		Response response = given()
//			.auth().preemptive().basic("admin","admin123")
//			.contentType(ContentType.JSON)
//			.body("{\r\n" + 
//					"  \"address\": \"Chennai\",\r\n" + 
//					"  \"age\": 40,\r\n" + 
//					"  \"bloodGroup\": \"A-\",\r\n" + 
//					"  \"emailId\": \"murali@gmail.com\",\r\n" + 
//					"  \"fullName\": \"murali\",\r\n" + 
//					"  \"gender\": \"Male\",\r\n" + 
//					"  \"mobileNo\": \"9999999999\"\r\n" + 
//					"}")
//	   .when()
//	   		.post();
//		
//		int donarId = response.jsonPath().getInt("donarId");
//		response.then()
//	   		.statusCode(201)
//	   		.body("fullName", equalTo("murali"))
//	   		.body("emailId", equalTo("murali@gmail.com"))
//	   		.body("address", equalTo("Chennai"));
//
//	   	System.out.println("New donarId is ::  "+donarId);
//	   	
//	   	given()
//	   		.contentType(ContentType.JSON)
//	   	.when()
//	   		.body("{\r\n" + 
//	   				"    \"emailId\": \"RandomEmail@gmail.com\",\r\n" + 
//	   				"    \"address\": \"Mangalore\"\r\n" + 
//	   				"}")
//	   		.patch("http://localhost:8084/api/donar/"+donarId)
//	   	.then()
//	   		.statusCode(200)
//	   		.body("emailId", equalTo("RandomEmail@gmail.com"))
//	   		.body("address", equalTo("Mangalore"));
//	   	
//	}

}
