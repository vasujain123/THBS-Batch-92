package p1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\bootcamp sample files\\.txt");

		String line1 = "This is First Line\n";
		String line2 = "This is Second Line\n";
		String line3 = "This is Third Line\n";
		String line4 = "This is Fourth Line";

		FileWriter writer = new FileWriter(file);

		writer.write(line1);
		writer.write(line2);
		writer.write(line3);
		writer.write(line4);

		System.out.println("Done");

		writer.close();

	}

}