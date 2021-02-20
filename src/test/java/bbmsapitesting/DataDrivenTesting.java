package bbmsapitesting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.restassured.http.ContentType;
import model.Student;
import utils.ExcelUtil;
import utils.JsonUtil;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DataDrivenTesting {
	
//	@Test(dataProvider = "myDataProvider")
//	public void tc_01(String firstName,String lastName,String email,String programme,String courses) {
////		HashMap<String, Object> payload = new HashMap<String, Object>();
////		payload.put("firstName", firstName);
////		payload.put("lastName", lastName);
////		payload.put("email",email);
////		payload.put("programme",programme);
////		payload.put("courses", courses);
//		String[] courseList = courses.trim().split(",");
//		
//		Student student = new Student(firstName, lastName, email, programme, courseList);
////		Student student = new Student();
////		student.setFirstName(firstName);
////		student.setLastName(lastName);
//		
//		given()
//			.baseUri("http://localhost:8084")
//			.basePath("/student")
//			.contentType(ContentType.JSON)
//			.body(student)
//		.when()
//			.post()
//		.then()
//			.statusCode(201);
//	} 
//	
//	@Test(dataProvider = "myJsonDataProvider") 
//	public void tc_02(Student student) throws EncryptedDocumentException, IOException {
//		given()
//		.baseUri("http://localhost:8084")
//		.basePath("/student")
//		.contentType(ContentType.JSON)
//		.body(student)
//	.when()
//		.post()
//	.then()
//		.statusCode(201);
//} 
		
	
//	
//	@DataProvider(name="myDataProvider")
//	public Object[][] myDataProvider() throws EncryptedDocumentException, IOException{
//		Object[][] data = ExcelUtil.getExcelData();
//		return data;
//	}
	
//	@DataProvider(name="myJsonDataProvider")
//	public Object[][] myJsonDataProvider() throws JsonParseException, JsonMappingException, IOException{
//		return JsonUtil.getJsonData();
//	}
	
	
	
	

}
