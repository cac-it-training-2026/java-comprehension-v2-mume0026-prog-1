package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		ConsoleReader consolereader = new ConsoleReader();
		List<Member> members = new ArrayList<>();

		members.add(Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1));

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		try {
			int id = consolereader.inputNumber();
			String pass = consolereader.inputString();

			MemberManager.updatePassword(members, id, pass);
		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		MemberManager.showAllMembers(members);

	}

}
