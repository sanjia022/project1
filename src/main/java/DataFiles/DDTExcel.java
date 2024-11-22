package DataFiles;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTExcel {

	public String getDatafromexcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\RC-PC\\eclipse-workspace\\SeleniumProject1\\DataFetching.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String value = w1.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
	//	String pwd = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();1,0
	}
}
