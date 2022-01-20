package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\bootcamp sample files\\v.txt");

		FileReader reader = new FileReader(file);
		
		BufferedReader br = new BufferedReader(reader);
		
		String line = null;
		
	while((line =  br.readLine()) != null)
	{
		
		System.out.println(line);
	}

	reader.close();

	}

}