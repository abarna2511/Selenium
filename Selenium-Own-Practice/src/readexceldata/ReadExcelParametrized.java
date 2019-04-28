package readexceldata;

import org.testng.annotations.Test;
import library.ExcelDataConfig;

public class ReadExcelParametrized {
	
	@Test
	public void readExcelData(){
		
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\Vignesh\\WorkSpace\\Selenium-Own-Practice\\ExcelData\\TestData.xlsx");
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));
		System.out.println(excel.getData(0, 1, 0));
		System.out.println(excel.getData(0, 1, 1));
		
		
	}
}
