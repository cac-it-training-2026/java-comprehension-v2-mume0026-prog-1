package q01_basic.question05;

public class MemberManager {
	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	static void showAllMembers(AbstMember[] members) {
		System.out.println("---SHOW ALL MEMBERS---");
		for (AbstMember member : members) {
			member.showMember();
		}
	}
}
