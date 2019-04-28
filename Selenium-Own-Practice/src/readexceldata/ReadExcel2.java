package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel2 {
	@Test
	public void readExcelData() throws Exception {
		
		File src = new File("C:\\Users\\Vignesh\\WorkSpace\\Selenium-Own-Practice\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s1 = wb.getSheetAt(0);
		int rowCount = s1.getLastRowNum();
		int colCount = 1;
		//Always it will save row count as index. So if there are 10 rows then rowCount will be 9
		System.out.println("Total row is "+rowCount);
		
		for (int i = 0; i <= rowCount; i++) {
			for (int j = 0; j <= colCount ; j++) {
				String data=s1.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		wb.close();
	}
}
