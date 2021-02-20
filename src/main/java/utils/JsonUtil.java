package utils;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Student;

public class JsonUtil {
	
	public static Object[][] getJsonData() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Student[] studentsList = mapper.readValue(new File("C:\\Users\\Srinidhi\\Desktop\\DDT\\TestData.json"), Student[].class);
		Object[][] obj = new Object[studentsList.length][1];
		for(int i=0;i<studentsList.length;i++) {
			obj[i][0] = studentsList[i];
		}
		return obj;
	}

}
