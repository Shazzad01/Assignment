package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static String[][] readTestData(String filePath) {
        String[][] testData = null;
        try {
            FileInputStream file = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

            int numRows = sheet.getPhysicalNumberOfRows();
            int numCols = sheet.getRow(0).getPhysicalNumberOfCells();

            testData = new String[numRows - 1][numCols]; // Assuming the first row is header

            for (int i = 1; i < numRows; i++) { // Start from row 1 (excluding header)
                Row row = sheet.getRow(i);
                for (int j = 0; j < numCols; j++) {
                    Cell cell = row.getCell(j);
                    testData[i - 1][j] = cell.getStringCellValue();
                }
            }

            workbook.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return testData;
    }
}

