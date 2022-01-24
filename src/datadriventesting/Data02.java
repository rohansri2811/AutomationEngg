package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data02 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f = new FileInputStream("./Excel/ExcelData.xlsx");
		
		Workbook wb = WorkbookFactory.create(f);
		
		String s = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(s);
	}

}
