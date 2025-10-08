package day9;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoObjectStream {
	
	public static void main(String[] args) {
		File f = new File("Accounts.txt");
		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account(243456, "ppp", 200000));
		accounts.add(new Account(9798686, "sss", 300000));
		try {
			FileOutputStream fout = new FileOutputStream(f);
			try(ObjectOutputStream out = new ObjectOutputStream(fout))
			{
				for(Account acc : accounts)
				{
					out.writeObject(acc);
				}
			}
		}		
		catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fin = new FileInputStream(f);
			try(ObjectInputStream in = new ObjectInputStream(fin))
			{
				while(true)
				{
					if(fin.available() >0)
					{
						Account acc= (Account)in.readObject();
						System.out.println(acc);
					}
					else
						break;
				}
			}
//			catch (EOFException e) {
//				System.out.println("Finished reading data");
//			} 
			catch (ClassNotFoundException e) {
					e.printStackTrace();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
