package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcelFile(String sheetName, int rowIndex, int cellIndex) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./testdata/testscripts1.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	public int getRowCount(String sheetName) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./testdata/testscripts1.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowCount;
	}
	
	

	public String writeBackToExcelFile(String sheetName, int rowIndex, int cellIndex, String data) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./testdata/testscripts1.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("./testdata/testscripts1.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
