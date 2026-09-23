package testcases;
import java.util.*;
import java.io.*;
public class Program_ReadFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\eclipse-workspace2\\gsit_may26_excel\\src\\test\\java\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));

	}

}
