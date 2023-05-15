package com.example.demo1;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excel {
    public static WebDriver driver;
    @Test
    public void readExcel() throws IOException {
        String excelPath ="C:\\Users\\BertinaAyuure\\IdeaProjects\\demo1\\src\\test\\java\\com\\example\\demo1\\Data.xlsx";
        String fileName= "Data";
        String sheetName="Test";
//Create the object of File Class to get the Excel path
        File file = new File(excelPath);
        //To read the file
        FileInputStream fileI= new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fileI);

        XSSFSheet sheet =wb.getSheet(sheetName);

        int totalRowCount= sheet.getLastRowNum();
        System.out.println(totalRowCount);

       String dat= sheet.getRow(0).getCell(1).getStringCellValue();
        System.out.println(dat);

        for(int i =0; i<totalRowCount; i++){
            Row row=sheet.getRow(i);
            for(int j=0; j<row.getLastCellNum(); j++){
             String d=  sheet.getRow(i).getCell(j).getStringCellValue();
                System.out.print(d+" ");

            }
            System.out.println();
        }
        wb.close();

    }

}
