package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

public class DatabaseUtil {
	
	
	public static Map getDataFromDB(String queryString) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","root");
		ResultSet result = connection.createStatement().executeQuery(queryString);
		result.first();
		ResultSetMetaData resultMetaData = result.getMetaData();
		LinkedHashMap map = new LinkedHashMap();
		for(int i=1;i<=resultMetaData.getColumnCount();i++) {
			map.put(resultMetaData.getColumnName(i), result.getString(i));
		}
		return map;
	}

}
