package assignment_7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Q2 {

	public static void main(String[] args) throws IOException {
		
		//File Handling
		String path = "C:\\JAVA\\workplace\\Exercice.xlsx";
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		
		//Workbook handling
		Workbook workBook = WorkbookFactory.create(fi);
		Sheet sheet1 = workBook.getSheet("Q1");
		
		for(int i=0; i<500; i++) {
			System.out.println( sheet1.getRow(i).getCell(0));
		}
		fi.close();

	}

}
