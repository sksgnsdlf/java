package co.micol.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPro {

	public void textFileRead() throws FileNotFoundException {
		File file = new File("config/test.txt"); //앞서했던 Path와 같음
		int singleCh = 0;
		try {
			FileReader fr = new FileReader(file);
			while ((singleCh = fr.read()) != -1) {
				System.out.print((char) singleCh);
			}
			fr.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
