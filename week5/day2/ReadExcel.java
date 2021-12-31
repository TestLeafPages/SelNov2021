package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {

		// set the path of the excel workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");

		// get into the sheet
		XSSFSheet ws = wb.getSheetAt(0);

		// get no of rows from the excel
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);

		int rows = ws.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		// get Column Count
		XSSFRow header = ws.getRow(0);
		int columnCount = header.getLastCellNum();
		System.out.println(columnCount);
		
		String[][] data = new String[rowCount][columnCount];
		
		// Get the data from second row and first column
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				// Retrieve the data from the cell
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
				data[i-1][j] = cellValue;
			}
		}

		// Close workbook
		wb.close();
		/*
		 * String[][] data = new String[2][3];
	
		data[0][0] = "Testleaf"; //index starts with 0
		data[0][1] = "Hari";
		data[0][2] = "R";
		
		data[1][0] = "Qeagle"; 
		data[1][1] = "Babu";
		data[1][2] = "M";
		
		return data;
		 */
		return data;
	}
}
