package keywordDriven;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	
static XSSFWorkbook wb;
static XSSFSheet sheet;

public static void setexcel(String path, int sheetnum)
{

try {
	File src = new File(path);
	FileInputStream fis = new FileInputStream(src);
	wb = new XSSFWorkbook(fis);
	sheet = wb.getSheetAt(sheetnum);
	} catch (Exception e) 
{
    System.out.println(e.getMessage());
 
}	
}

public static String getdata(int rownum, int cellnum)
{
	String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
	return data;
}


public static String getData(int sheetNumber, int row, int column) {
	
	sheet = wb.getSheetAt(sheetNumber);
	
	String data = sheet.getRow(row).getCell(column).getStringCellValue();
	
	return data;
	
}


public static int getRowCount(int sheetIndex) {
	
	int row = wb.getSheetAt(sheetIndex).getLastRowNum();
	
	row = row + 1;
	
	return row;
	
}

}

