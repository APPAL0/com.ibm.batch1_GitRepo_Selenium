package smokeTest;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		//XSSFSheet sheet = workbook.getSheet("sample");
		XSSFSheet sheet = workbook.getSheet("regression");
//		workbook.getSheetAt(0);
		
		
		
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		
		
		
		int rowCount = sheet.getLastRowNum();
		
		
		System.out.println("Row count are: " + (rowCount + 1));
		System.out.println("column Count are: " + columnCount);
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			
//			for (int column = 0; column < columnCount; column++) {
//				
//				String firstName = sheet.getRow(i).getCell(column).toString();
//				
//				System.out.println("FirstName: " + firstName);
//				
//			}
			
			
			
			
			String firstName = sheet.getRow(i).getCell(0).toString();
			String address = sheet.getRow(i).getCell(1).toString();
			String commnet = sheet.getRow(i).getCell(4).toString();
			System.out.println("--------------------------------------------");
			System.out.println("member details are: " + firstName + " : " + address);
			System.out.println("comment: " + commnet);
			
		}
		
		
		
		
		
		

	}

}
