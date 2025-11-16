package Oct30;

import java.io.*;
import java.util.*;

public class file {
	public void filWriter(String classpath) throws IOException {
		File f = new File(classpath);
		FileWriter wobj = new FileWriter(f);
		wobj.write("from other file");
		wobj.close();
		try(Scanner scan = new Scanner(f)){
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args)  {
//		File file = new File("sample.txt");
//		try(FileWriter writer = new FileWriter(file)){
//			writer.write("Hello java");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		
		try {
			
			
//			File f = new File("newText.txt");
//			if(f.exists()) {
//				try(Scanner scan = new Scanner(f)){
//					while(scan.hasNext()) {
//						System.out.println(scan.next());
//					}
//				}
//			}
//			else {
//				System.out.println("File Not found");
//			}
//			
			
			
			//FileReader
			try(FileReader reader = new FileReader("C:\\Users\\BATHINI HEMASREE\\eclipse-workspace\\LibraryManag\\newText.txt")){
				File f = new File("newText.txt"); //every time you run it will create this again so write in function and call this.
				FileWriter write = new FileWriter(f);
				write.append("Rohan,India,424243434,ICICI00002131,20000,20000,NEFT,Kriti,India,5455535358,SBI00002301");
				write.close();
				int ch;
				while((ch=reader.read())!=-1) {
					System.out.println((char)ch);
				}
			}catch(Exception e) {
				System.out.println("No new text to fileReader");
			}
			
//		File f = new File("h1.txt");
			
//		
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
