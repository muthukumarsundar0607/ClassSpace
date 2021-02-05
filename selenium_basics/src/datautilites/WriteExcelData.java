package datautilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\workspace\\Classs_Space\\selenium_basics\\src\\MyExcellReader.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);

		XSSFSheet sheet = book.getSheetAt(1);
		
		/***************************************************/
		
		
		int rowNumber = sheet.getLastRowNum();
		System.out.println(rowNumber);
		int coloumnNumber = sheet.getRow(0).getLastCellNum();
		System.out.println(coloumnNumber);
		
		/***************************************************/
		
		for (int i = 1; i <= rowNumber; i++) {

			for (int j = 0; j < coloumnNumber; j++) {
				
				Cell cellValue = sheet.getRow(i).getCell(j);
				cellValue.setCellValue("Muthukumar-Write ");
				
				
				
				
			}
				
				
			}
		
		fis.close();
		FileOutputStream fileoutstream = new FileOutputStream(file);
		book.write(fileoutstream);
		fileoutstream.close();
		

		
		
		
	

	}

}
