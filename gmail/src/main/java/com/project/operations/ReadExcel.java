package com.project.operations;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.swing.text.html.HTMLDocument;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream(new File("ExcelFile.xls"));
            HSSFWorkbook hssfWorkbook=new HSSFWorkbook(fileInputStream);
            HSSFSheet sheet=hssfWorkbook.getSheetAt(0);
            Iterator rowIterator=sheet.iterator();
            while (rowIterator.hasNext())
            {
                Row row=(Row) rowIterator.next();
//                System.out.println("Row="+row.getRowNum());
               
                Iterator cellIterator=row.cellIterator();
                while (cellIterator.hasNext())
                {
                    Cell cell=(Cell) cellIterator.next();
                    System.out.print(cell.getStringCellValue() + " ");
                }
                System.out.println("");
            }

            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}