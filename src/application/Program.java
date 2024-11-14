package application;

<<<<<<< HEAD
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
=======
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//FileWriter: Cria/recria um arquivo - new FileWriter(path)
//Acrescenta ao arquivo existente - new FileWriter(path, true)

//BufferedWriter (mais rápido)
>>>>>>> 051eb568620e778666f9541f795d7f9d4358d39c

public class Program {

	public static void main(String[] args) {
<<<<<<< HEAD
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
=======
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "c:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
>>>>>>> 051eb568620e778666f9541f795d7f9d4358d39c
		}

	}

}
