package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcelData() throws Exception{
		
		File src = new File("C:\\Users\\Vignesh\\WorkSpace\\Selenium-Own-Practice\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s1 = wb.getSheetAt(0);
		String data0 = s1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		String data1 = s1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		wb.close();
	}

}
