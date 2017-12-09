package Practice;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Hashmap {

		public static void main(String[] args) throws BiffException,IOException{
		// TODO Auto-generated method stub

		String filepath1="D:\\selenium backup\\Seleniumjar.xls";
		File f= new File(filepath1);
		Workbook wrk1=Workbook.getWorkbook(f);
		Sheet sheet1=wrk1.getSheet(0);
		Cell colArow1=sheet1.getCell(0,0);
		String str_colArow1= colArow1.getContents();
		System.out.println(str_colArow1);
	}

}









