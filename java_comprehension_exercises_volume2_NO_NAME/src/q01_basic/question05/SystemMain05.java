package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		NonMember nonmember1 = new NonMember("Sato Kensuke");
		members[0] = nonmember1;
		Member member1 = new Member(1, "pPasswOrd", "Miura Manabu", 28, 2);
		members[1] = member1;

		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM---");
		nonmember1.buyItem();
		member1.buyItem();
	}

}
