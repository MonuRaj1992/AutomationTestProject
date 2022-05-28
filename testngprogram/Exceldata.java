package com.testngprogram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Exceldata {
@Test
public void Readexceldata() throws EncryptedDocumentException, IOException {
	
	String filepath="C:\\Users\\HP\\Desktop\\Book1.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	Row rw= sh.getRow(1);
String Username=rw.getCell(1).getStringCellValue();
     String password= rw.getCell(2).getStringCellValue();
      System.out.println(Username);
      System.out.println(password);
}
@Test
public void getcountofTestcase() throws EncryptedDocumentException, IOException {
	String filepath="C:\\Users\\HP\\Desktop\\Book1.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	int rowcount=sh.getLastRowNum();
	System.out.println("Total number of Testcase="+rowcount);
}
@Test
public void createData() throws EncryptedDocumentException, IOException {
	String filepath="C:\\Users\\HP\\Desktop\\Book1.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
       Row rw=sh.getRow(3);
        Cell cell=rw.createCell(2);
        cell.setCellType(CellType.STRING);
        FileOutputStream fos=new FileOutputStream(filepath);
        cell.setCellValue("TestDemo2");
        wb.write(fos);
        wb.close();
       

}
}