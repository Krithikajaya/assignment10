package assignment10excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		
	
	XSSFWorkbook y=new XSSFWorkbook("./Assignment10/details.xlsx");
	XSSFSheet sheetAt = y.getSheetAt(0);
	int RowNum = sheetAt.getLastRowNum();
	int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
	System.out.println(RowNum);
	System.out.println(physicalNumberOfRows);
    short cell = sheetAt.getRow(1).getLastCellNum();
    System.out.println(cell);
    String getdata = sheetAt.getRow(5).getCell(3).getStringCellValue();
    System.out.println(getdata);
    
    for(int i=1;i<=RowNum;i++) {
    	for(int j=0;j<cell;j++) {
    		String data = sheetAt.getRow(i).getCell(j).getStringCellValue();
    	    System.out.println(data);
    	}
    }
    y.close();
}
}