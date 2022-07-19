package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Read_excelfile {
public static void main(String[] args) throws IOException {
	
	//File-->FIS-->WB-->Sheet-->Row-->Cell-->FOS
	File f= new File("C:\\Users\\sakth\\OneDrive\\Desktop\\Maven class.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb = new XSSFWorkbook();
	Sheet cs = wb.createSheet("Salary Details");
	Row cr = cs.createRow(0);
	Cell cc = cr.createCell(0);
	cc.setCellValue("Employer Details");
	int addMergedRegion = cs.addMergedRegion(CellRangeAddress.valueOf("A1:D1"));

	wb.getSheet("Salary Details").createRow(1);
	wb.getSheet("Salary Details").createRow(2);
	wb.getSheet("Salary Details").createRow(3);
	wb.getSheet("Salary Details").createRow(4);
	wb.getSheet("Salary Details").createRow(5);
	wb.getSheet("Salary Details").createRow(6);
	
	wb.getSheet("Salary Details").getRow(1).createCell(0).setCellValue("Employer Name");
	wb.getSheet("Salary Details").getRow(2).createCell(0).setCellValue("Vasanth");
	wb.getSheet("Salary Details").getRow(3).createCell(0).setCellValue("Shankar");
	wb.getSheet("Salary Details").getRow(4).createCell(0).setCellValue("Lokesh");
	wb.getSheet("Salary Details").getRow(5).createCell(0).setCellValue("Dinesh");
	wb.getSheet("Salary Details").getRow(6).createCell(0).setCellValue("Nandhini");
	
	wb.getSheet("Salary Details").getRow(1).createCell(1).setCellValue("Employer ID");
	wb.getSheet("Salary Details").getRow(2).createCell(1).setCellValue("DLF-Vas-S68");
	wb.getSheet("Salary Details").getRow(3).createCell(1).setCellValue("DLF-Shan-S84");
	wb.getSheet("Salary Details").getRow(4).createCell(1).setCellValue("DLF-Lok-S112");
	wb.getSheet("Salary Details").getRow(5).createCell(1).setCellValue("DLF-Din-S113");
	wb.getSheet("Salary Details").getRow(6).createCell(1).setCellValue("DLF-nand-L56");
	
	wb.getSheet("Salary Details").getRow(1).createCell(2).setCellValue("Gross Pay");
	wb.getSheet("Salary Details").getRow(2).createCell(2).setCellValue("5,00,000");
	wb.getSheet("Salary Details").getRow(3).createCell(2).setCellValue("4,50,000");
	wb.getSheet("Salary Details").getRow(4).createCell(2).setCellValue("4,50,000");
	wb.getSheet("Salary Details").getRow(5).createCell(2).setCellValue("4,80,000");
	wb.getSheet("Salary Details").getRow(6).createCell(2).setCellValue("8,00,000");
	
	wb.getSheet("Salary Details").getRow(1).createCell(3).setCellValue("Monthly Salary");
	wb.getSheet("Salary Details").getRow(2).createCell(3).setCellValue("41,000");
	wb.getSheet("Salary Details").getRow(3).createCell(3).setCellValue("37,500");
	wb.getSheet("Salary Details").getRow(4).createCell(3).setCellValue("37,500");
	wb.getSheet("Salary Details").getRow(5).createCell(3).setCellValue("40,000");
	wb.getSheet("Salary Details").getRow(6).createCell(3).setCellValue("66,000");
	
	wb.getSheet("Salary Details").getRow(1).createCell(4).setCellValue("Other Benifits");
	wb.getSheet("Salary Details").getRow(2).createCell(4).setCellValue("10,000");
	wb.getSheet("Salary Details").getRow(3).createCell(4).setCellValue("8,500");
	wb.getSheet("Salary Details").getRow(4).createCell(4).setCellValue("8,500");
	wb.getSheet("Salary Details").getRow(5).createCell(4).setCellValue("9,000");
	wb.getSheet("Salary Details").getRow(6).createCell(4).setCellValue("15,000");
	
	cs.setColumnWidth(0,4000);
	cs.setColumnWidth(1,3500);
	cs.setColumnWidth(2,2800);
	cs.setColumnWidth(3,3800);
	cs.setColumnWidth(4,3500);
	wb.getSheet("Salary Details").getRow(0).setHeight((short)600);
	wb.getSheet("Salary Details").getRow(1).setHeight((short)500);
	wb.getSheet("Salary Details").getRow(2).setHeight((short)400);	
	wb.getSheet("Salary Details").getRow(3).setHeight((short)400);
	wb.getSheet("Salary Details").getRow(4).setHeight((short)400);
	wb.getSheet("Salary Details").getRow(5).setHeight((short)400);
	wb.getSheet("Salary Details").getRow(6).setHeight((short)400);
	
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	System.out.println("Salary details of 5 employers inserted");	
	System.out.println();
	System.out.println("------------****************------------");
	System.out.println();
	
	Workbook wb1 = new XSSFWorkbook(fis);
	Sheet sheetAt = wb1.getSheetAt(0);
	Row row1 = sheetAt.getRow(0);
	Cell cell1 = row1.getCell(0);
	CellType cellType1 = cell1.getCellType();	
	/*IF-Else-if condition*/
//	if (cellType1.equals(CellType.STRING)) {
//		String stringCellValue = cell.getStringCellValue();
//		System.out.println("String Value : "+stringCellValue);		
//	}
//	else if (cellType1.equals(CellType.NUMERIC)) {
//		double numericCellValue = cell.getNumericCellValue();
//		System.out.println("Numeric Value : "+numericCellValue);		
//	}	
	
	/*Switch Condition*/
	switch (cellType1) {
	case STRING:
		cellType1.equals(CellType.STRING);
		String stringCellValue = cell1.getStringCellValue();
		System.out.println("String Value : "+stringCellValue);			
		break;		
	case NUMERIC:
		cellType1.equals(CellType.NUMERIC);
		double NumericCellValue = cell1.getNumericCellValue();
		System.out.println("Numeric Value : "+NumericCellValue);			
		break;		
	default:
		System.out.println("0");
		break;
	}	
	int size = sheetAt.getPhysicalNumberOfRows();
	System.out.println("Number of rows available : "+size);
	for (int i = 1; i < size; i++) {
		Row row2 = sheetAt.getRow(i);
		int cell_count = row2.getPhysicalNumberOfCells();	
		System.out.println("cell count : "+cell_count);
		for (int j = 0; j < cell_count; j++) {
			Cell cell2 = row2.getCell(j);
//			String stringCellValue = cell3.getStringCellValue();
//			System.out.println(stringCellValue);			
			/*Using if-else-if condition*/
			if (cellType1.equals(CellType.STRING)) {
				String stringCellValue = cell2.getStringCellValue();
				System.out.println("String Value : "+stringCellValue);		
			}
			else if (cellType1.equals(CellType.NUMERIC)) {
				double numericCellValue = cell2.getNumericCellValue();
				System.out.println("Numeric Value : "+numericCellValue);
			}		
		}
		System.out.println();
	}
	System.out.println("**** Data fetched from the given file ****");
}
}
