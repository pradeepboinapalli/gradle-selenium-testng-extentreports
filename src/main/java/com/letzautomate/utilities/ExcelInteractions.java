package com.letzautomate.utilities;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelInteractions {
    Workbook workbook;
    Sheet sheet;
    Row row;
    Cell cell;
    String filename;

    public boolean deleteSheet(String fileName,String sheetName){
        try {
            FileInputStream fileInputStream=new FileInputStream(filename);
            workbook=WorkbookFactory.create(fileInputStream);
            for(int sheetIndex=0;sheetIndex<workbook.getNumberOfSheets();sheetIndex++){
                if(workbook.getSheetName(sheetIndex).equalsIgnoreCase(sheetName)){
                    workbook.removeSheetAt(sheetIndex);
                    fileInputStream.close();
                    return true;
                }
            }
            System.out.println("Sheet not found..");
            return false;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (InvalidFormatException e) {
            e.printStackTrace();
            return false;
        }


    }

/*    public boolean addSheet(String fileName,String sheetName){
        try {
            FileInputStream fileInputStream=new FileInputStream(filename);
            workbook=WorkbookFactory.create(fileInputStream);
            for (int sheetIndex=0;sheetIndex<workbook.getNumberOfSheets();sheetIndex++){


            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }*/


}
