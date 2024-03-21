package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static Object[][] readTestData(String filePath, String sheetName) {
        Object[][] testData = null;
        try {
            FileInputStream file = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            int rowCount = sheet.getLastRowNum();
            int colCount = sheet.getRow(0).getLastCellNum();
            testData = new Object[rowCount][colCount];
            for (int i = 0; i < rowCount; i++) {
                XSSFRow row = sheet.getRow(i + 1);
                for (int j = 0; j < colCount; j++) {
                    testData[i][j] = row.getCell(j).toString();
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
