package utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	
	
	public static Object[][] getExcelData() throws EncryptedDocumentException, IOException {
		Workbook workbook = WorkbookFactory.create(new File("C:\\Users\\Srinidhi\\Desktop\\DDT\\Book1.xlsx"));
		Sheet sheet = workbook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCol = sheet.getRow(0).getLastCellNum();
		Object[][] excelData = new Object[totalRows][totalCol];
		for(int row=1;row<=totalRows;row++) {
			for(int col=0;col<totalCol;col++) {
			excelData[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
			}
		}
		return excelData;
	}

}
