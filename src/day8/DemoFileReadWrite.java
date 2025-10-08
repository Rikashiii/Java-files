package day8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileReadWrite {
	
	public static void writeToFile(File f) throws IOException
	{
		FileWriter fw =null;
		BufferedWriter bw=null;
		String data ="This is a char stream";
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write(data);
			bw.flush();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			fw.close();
			bw.close();
		}
	}

	public static void readFile(File f)
	{
		String data = null;
		try
		{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while((data=br.readLine())!=null)
			{
				System.out.println(data);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws IOException {
		
		File f = new File("test.txt");
		writeToFile(f);
		readFile(f);
	}

}
