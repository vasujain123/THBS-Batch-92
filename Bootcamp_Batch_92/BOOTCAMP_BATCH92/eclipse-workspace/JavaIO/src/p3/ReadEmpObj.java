package p3;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadEmpObj {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\bootcamp sample files\\data.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee obj = (Employee) ois.readObject();

		System.out.println(obj);

		ois.close();

	}

}