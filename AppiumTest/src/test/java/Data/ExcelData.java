package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {
	
	public int getcell(int row, int cell) throws IOException {
	//Path of the excel file
	FileInputStream fs = new FileInputStream("C:\\Users\\Takalani.Nenzhelele\\eclipse-workspace\\AppiumTest\\Data\\MyData.xlsx");
	//Creating a workbook
	XSSFWorkbook workbook = new XSSFWorkbook(fs);
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	int number = (int)sheet.getRow(row).getCell(cell).getNumericCellValue();
	
	return number;

	}
} 	
