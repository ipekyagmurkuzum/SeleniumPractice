//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//
////FOR XLSX
//public class ReaderXLSX {
//
//    public static void main(String[] args) throws IOException {
//        FileInputStream inputStream = new FileInputStream("src/main/resources/N11TestData.xlsx");
//        Workbook workbook = new XSSFWorkbook(inputStream);
//        Sheet sheet = workbook.getSheet("Sheet1");
//        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
//        for (int i = 0; i < rowCount + 1; i++) {
//            Row row = sheet.getRow(i);
//            //Create a loop to print cell values in a row
//            for (int j = 0; j < row.getLastCellNum(); j++) {
//                //Print Excel data in console
//                System.out.println(row.getCell(j).getStringCellValue() + "|| ");
//            }
//        }
//        inputStream.close();
//    }
//}
