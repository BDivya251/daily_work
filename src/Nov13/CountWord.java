package Nov13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class CountWord {
	public static void functionalApproach() throws IOException{
		//with functional programming
		Path path = Paths.get("C:\\\\Users\\\\BATHINI HEMASREE\\\\countW.txt");
		int count1=(int) Files.lines(path)
				.map(String::toUpperCase)
				.flatMap((String line)->Arrays.stream(line.split("\\W+")))
				.filter(word->word.equals("INDIA"))
				.count();
		System.out.println(count1);
	}
	public static void normalApproach() throws IOException{
		File f = new File("C:\\Users\\BATHINI HEMASREE\\countW.txt");
		FileReader read =new FileReader(f);
		Scanner scan = new Scanner(f);
		BufferedReader bufferReader = new BufferedReader(new FileReader(f));
		int c = read.read();
		String s;
		int count=0;
		while((scan.hasNext())) {
			s=scan.next();
			s=s.toUpperCase();
			String[] words=s.split("\\W+");
			for(String word:words) {
			
				if(word.equals("INDIA")) {
					count++;
				}
			}
		}
		System.out.println(count);
		count=0;
		while((s=bufferReader.readLine())!=null) {
			s=s.toUpperCase();
			String[] words=s.split("\\W+");
			for(String word:words) {
			
				if(word.equals("INDIA")) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) throws IOException {
		
		CountWord.functionalApproach();
		CountWord.normalApproach();
		
	}
}
