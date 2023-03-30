package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
   Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet("create").getRow(1).getCell(3).getStringCellValue();
	System.out.println(data);
}
}
