package day9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoByteStream {
	public static void readBytes(File f)
	{
		try(BufferedInputStream in = new BufferedInputStream
				(new FileInputStream(f)))
		{
			byte [] data = new byte[in.available()];
			while(in.read(data)!=-1)
			{
				String s = new String(data);
				System.out.println(s);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void writeBytes(File f)
	{
		String s = "This is a byte stream";
		try(BufferedOutputStream out = new BufferedOutputStream
				(new FileOutputStream(f))) //ARM
		/*
		 * Closing of the streams will be done automatically
		 */
		{
			byte [] data = s.getBytes();
			out.write(data);
			out.flush();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		File f = new File("test1.txt");
		writeBytes(f);
		readBytes(f);

	}

}
