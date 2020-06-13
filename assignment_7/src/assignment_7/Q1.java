package assignment_7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1 {

	public static void main(String[] args) throws IOException {
		//Random object
		Random num = new Random();
		
		// Create a workbook
		XSSFWorkbook workBook = new XSSFWorkbook();
		
		//Create sheets on the workbook
		XSSFSheet sheet1 = workBook.createSheet("Q1");
		
		
		
		//Create cells and put random numbers in the first column of Exercise.xlsx
		for(int i =0; i<500; i++) {
			sheet1.createRow(i).createCell(0).setCellValue(num.nextInt(1000));
		}
				
		// File Output .
		String path = "C:\\JAVA\\workplace\\Exercice.xlsx";
		File f = new File(path);
		FileOutputStream fo = new FileOutputStream(f);
		
		//Writing on the workbook, save and then close.
		workBook.write(fo);
		workBook.close();
	}

}
