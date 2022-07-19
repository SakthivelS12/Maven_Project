package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_excelFile {
public static void main(String[] args) throws IOException {
	
	//File-->FIS-->WB-->Sheet-->Row-->Cell-->FOS
	File f= new File("C:\\Users\\sakth\\OneDrive\\Desktop\\Maven class.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb = new XSSFWorkbook();
	Sheet cs = wb.createSheet("Salary Details");
	Row cr = cs.createRow(0);
	Cell cc = cr.createCell(0);
	cc.setCellValue("Employer Name");
	cs.addMergedRegion(CellRangeAddress.valueOf("A1:D1"));
	
	wb.getSheet("Salary Details").createRow(1);
	wb.getSheet("Salary Details").createRow(2);
	wb.getSheet("Salary Details").createRow(3);
	wb.getSheet("Salary Details").createRow(4);
	wb.getSheet("Salary Details").createRow(5);
	wb.getSheet("Salary Details").createRow(6);
	
	wb.getSheet("Salary Details").getRow(1).createCell(0).setCellValue("Employer ID");
	wb.getSheet("Salary Details").getRow(2).createCell(0).setCellValue("Vasanth");
	wb.getSheet("Salary Details").getRow(3).createCell(0).setCellValue("Shankar");
	wb.getSheet("Salary Details").getRow(4).createCell(0).setCellValue("Lokesh");
	wb.getSheet("Salary Details").getRow(5).createCell(0).setCellValue("Dinesh");
	wb.getSheet("Salary Details").getRow(6).createCell(0).setCellValue("Nandhini");
	
	wb.getSheet("Salary Details").getRow(1).createCell(1).setCellValue("Gross Pay");
	wb.getSheet("Salary Details").getRow(2).createCell(1).setCellValue("5,00,000");
	wb.getSheet("Salary Details").getRow(3).createCell(1).setCellValue("4,50,000");
	wb.getSheet("Salary Details").getRow(4).createCell(1).setCellValue("4,50,000");
	wb.getSheet("Salary Details").getRow(5).createCell(1).setCellValue("4,80,000");
	wb.getSheet("Salary Details").getRow(6).createCell(1).setCellValue("8,00,000");
	
	wb.getSheet("Salary Details").getRow(1).createCell(2).setCellValue("Monthly Salary");
	wb.getSheet("Salary Details").getRow(2).createCell(2).setCellValue("41,000");
	wb.getSheet("Salary Details").getRow(3).createCell(2).setCellValue("37,500");
	wb.getSheet("Salary Details").getRow(4).createCell(2).setCellValue("37,500");
	wb.getSheet("Salary Details").getRow(5).createCell(2).setCellValue("40,000");
	wb.getSheet("Salary Details").getRow(6).createCell(2).setCellValue("66,000");
	
	wb.getSheet("Salary Details").getRow(1).createCell(3).setCellValue("Other Benifits");
	wb.getSheet("Salary Details").getRow(2).createCell(3).setCellValue("10,000");
	wb.getSheet("Salary Details").getRow(3).createCell(3).setCellValue("8,500");
	wb.getSheet("Salary Details").getRow(4).createCell(3).setCellValue("8,500");
	wb.getSheet("Salary Details").getRow(5).createCell(3).setCellValue("9,000");
	wb.getSheet("Salary Details").getRow(6).createCell(3).setCellValue("15,000");
	
	cs.setColumnWidth(0,3000);
	cs.setColumnWidth(1,2800);
	cs.setColumnWidth(2,3800);
	cs.setColumnWidth(3,3500);
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
}
}
