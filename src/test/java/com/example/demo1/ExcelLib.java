package com.example.demo1;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelLib {
    XSSFWorkbook wb;
    XSSFSheet sheet;

    public ExcelLib () throws IOException {
        String excelPath ="C:\\Users\\BertinaAyuure\\IdeaProjects\\demo1\\src\\test\\java\\com\\example\\demo1\\Data.xlsx";
        File file = new File(excelPath);

        FileInputStream fileI= new FileInputStream(file);
         wb = new XSSFWorkbook(fileI);



    }
    public void readData(String sheetName, int row, int column){

    }
}
