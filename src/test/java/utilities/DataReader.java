package utilities;

import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {
	
	public static HashMap<String, String> storeValues = new HashMap();

	public static List<HashMap<String, String>> data(String filepath, String sheetName) {
		
		List<HashMap<String, String>> mydata = new ArrayList<>();
		
		try {
			FileInputStream fs = new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			Row HeaderRow = sheet.getRow(0);
			for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) 
				{
				Row currentRow = sheet.getRow(i);
				HashMap<String, String> currentHash = new HashMap<String, String>();
				for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) 
					{
					Cell currentCell = currentRow.getCell(j);
					switch (currentCell.getCellType()) 
						{
							case STRING:
								currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
							break;
							case NUMERIC:
						        // Convert to long to remove .0 for big numbers like Mobile/PAN
						        long numericValue = (long) currentCell.getNumericCellValue();
						        currentHash.put(HeaderRow.getCell(j).getStringCellValue(), String.valueOf(numericValue));
						        break;

						    case BOOLEAN:
						        currentHash.put(HeaderRow.getCell(j).getStringCellValue(), String.valueOf(currentCell.getBooleanCellValue()));
						        break;

						    case BLANK:
						        currentHash.put(HeaderRow.getCell(j).getStringCellValue(), "");
						        break;

						    default:
						        currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.toString());
						        break;
						}
					}
				mydata.add(currentHash);
				}
			fs.close();
			} catch (Exception e) {
			e.printStackTrace();
		}
		return mydata;
	}
}
