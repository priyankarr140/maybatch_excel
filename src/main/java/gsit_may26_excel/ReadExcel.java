package gsit_may26_excel;
import java.io.*;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\Priyanka Arora\\Desktop\\Book1.xlsx");
				Workbook book=new XSSFWorkbook(file);
				Sheet sheet = book.getSheetAt(0);
				Iterator<Row>rows=sheet.iterator();
				while(rows.hasNext())
				{
					Row row=rows.next();
					Iterator<Cell>cols=row.cellIterator();
					while(cols.hasNext())
					{
						Cell value=cols.next();
						if(value.getCellType()==CellType.NUMERIC)
						{				
						   System.out.print((int)value.getNumericCellValue()+" ");					
			            }
			           else
			            {
			                System.out.print(value+" ");	
			            }			
					}
					System.out.println();
				}
				Row newRow=sheet.createRow(4);
				newRow.createCell(0).setCellValue(104);
				newRow.createCell(1).setCellValue("java");
				
				FileOutputStream file2=new FileOutputStream("C:\\Users\\Priyanka Arora\\Desktop\\Book1.xlsx");
				book.write(file2);

				
	}

}
