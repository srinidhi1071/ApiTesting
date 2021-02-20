package bbmsapitesting;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;
import utils.DatabaseUtil;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.sql.SQLException;
import java.util.Map;
public class DataBaseTesting {
	
	@Test
	public void testPostDonar() throws SQLException {
		Response response = given()
			.auth().preemptive().basic("admin", "admin123")
			.baseUri("http://localhost:8084")
			.basePath("/api/donar")
			.contentType(ContentType.JSON)
			.body("{\r\n" + 
					"  \"address\": \"Bangalore\",\r\n" + 
					"  \"age\": 35,\r\n" + 
					"  \"bloodGroup\": \"AB+\",\r\n" + 
					"  \"emailId\": \"Rahul@gmail.com\",\r\n" + 
					"  \"fullName\": \"Rahul\",\r\n" + 
					"  \"gender\": \"Male\",\r\n" + 
					"  \"mobileNo\": \"9999999999\"\r\n" + 
					"}")
		.when()
			.post();
		int donarId = response.jsonPath().getInt("donarId");
		String queryString = "select * from bbms.tbldonars where donar_id="+donarId;
		Map dbResultMap = DatabaseUtil.getDataFromDB(queryString);
		Assert.assertEquals("Rahul", dbResultMap.get("full_name"));
	}

}
