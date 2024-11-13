package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//FileWriter: Cria/recria um arquivo - new FileWriter(path)
//Acrescenta ao arquivo existente - new FileWriter(path, true)

//BufferedWriter (mais rápido)

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "c:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
