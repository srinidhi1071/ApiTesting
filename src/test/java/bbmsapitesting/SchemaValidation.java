package bbmsapitesting;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
public class SchemaValidation {
	
	@Test
	public void studentSchemaValidation() {
		given()
			.baseUri("http://localhost:8084")
			.basePath("/student/list")
		.when()
			.get()
		.then()
			.body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\Srinidhi\\Desktop\\DDT\\studentSchema.json")));
	}

}
