import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Read_Write_File {
	static String[][] mas = new String[5][3];
	static Scanner sc;

	public static void main(String[] args) {
		openFile();
		readFile();
		out();
	}

	private static void openFile() {
		try {
			sc = new Scanner(new File("File//1.txt"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Файл не найден");
		}
	}

	private static void readFile() {
		while (sc.hasNext()) {
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = sc.next();
				}
			}
		}
	}

	private static void out() {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}

}
