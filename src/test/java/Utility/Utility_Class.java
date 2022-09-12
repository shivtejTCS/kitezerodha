package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class {
public static String getTD(int rowindex,int colindex) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Shivtej\\Documents\\Book1.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	String data=sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
	
}
}
