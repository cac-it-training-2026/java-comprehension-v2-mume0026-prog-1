package q03_extra;

import java.util.List;

import q02_advanced.question03.Member;

public class MemberManager {

	private MemberManager() {
	}

	public static void ShowCreateUser(List<Member> members, int id) {

		for (Member member : members) {
			if (member.getId() == id) {
				member.showMember();

				return;
			}
		}
		System.out.println("該当ユーザーが存在しません。");

	}
}
