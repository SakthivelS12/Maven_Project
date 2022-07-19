package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_excelFile {
public static void main(String[] args) throws IOException {
	//File-->FIS-->WB-->Sheet-->Row-->-->Cell-->FOS
	File f= new File("C:\\Users\\sakth\\OneDrive\\Desktop\\Maven class.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	Row row1 = sheetAt.getRow(2);
	Cell cell = row1.getCell(0);
	CellType cellType1 = cell.getCellType();	
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
		String stringCellValue = cell.getStringCellValue();
		System.out.println("String Value : "+stringCellValue);			
		break;		
	case NUMERIC:
		cellType1.equals(CellType.NUMERIC);
		double NumericCellValue = cell.getNumericCellValue();
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
//			String stringCellValue = cell2.getStringCellValue();
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