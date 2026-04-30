package q02_advanced.question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	public String inputString() throws IOException {
		System.out.println("input password>>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String newPassword = reader.readLine();

		return newPassword;
	}

	public int inputNumber() throws IOException, NumberFormatException {
		System.out.println("input id>>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String num = reader.readLine();
		int ID = Integer.parseInt(num);

		return ID;
	}
}
