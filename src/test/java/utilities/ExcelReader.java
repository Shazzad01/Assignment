package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;

public class ExcelReader {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\User\\Documents\\testdata.xlsx");
             Workbook workbook = WorkbookFactory.create(fis)) {

            // Assuming your Excel file has only one sheet, you can get it like this:
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate over rows
            for (Row row : sheet) {
                // Iterate over cells
                for (Cell cell : row) {
                    // Print cell value
                    System.out.print(cell.getStringCellValue() + "\t");
                }
                System.out.println(); // Move to next row
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] readTestData() {
        return new String[0];
    }
}
