package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	
	@Test
	public void readExcelData() throws Exception {
		int colNumber = 5;
		File src = new File("C:\\Users\\Vignesh\\WorkSpace\\Selenium-Own-Practice\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s1 = wb.getSheetAt(0);
		s1.getRow(0).createCell(colNumber).setCellValue("PASS");
		s1.getRow(1).createCell(colNumber).setCellValue("FAIL");
		s1.getRow(2).createCell(colNumber).setCellValue("PASS");
		FileOutputStream fos = new FileOutputStream(src);
		wb.write(fos);
		wb.close();
	}

}
