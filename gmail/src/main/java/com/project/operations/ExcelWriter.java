package com.project.operations;

import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWriter {
	public static void main(String[] args) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Information");
         
        Object[][] data = {
                {"Name1", "Address1", "79"},
                {"Name2", "Address2", "36"},
                {"Name3", "Address3", "42"},
                {"Name4", "Address4", "35"},
        };
 
        int rowCount = 0;
         
        for (Object[] info : data) {
            Row row = sheet.createRow(rowCount++);
             
            int columnCount = 0;
             
            for (Object field : info) {
                Cell cell = row.createCell(columnCount++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
             
        }
         
         
        try (FileOutputStream outputStream = new FileOutputStream("ExcelFile.xls")) {
            workbook.write(outputStream);
        }
        System.out.println("Excel file has been created");
    }
 
}
