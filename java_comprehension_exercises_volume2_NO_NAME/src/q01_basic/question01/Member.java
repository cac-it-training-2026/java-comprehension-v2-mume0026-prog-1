package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	String name;
	int age;
	int rank;

	//	void showMember(String name, int age, int rank) {
	//		this.name = name;
	//		this.age = age;
	//		this.rank = rank;
	//
	//		System.out.println("***MEMBER DATA***");
	//		System.out.println("name:" + name);
	//		System.out.println("age:" + age);
	//		System.out.println("rank:" + rank);
	//		System.out.println("*********************");
	//	}

	void showMember() {

		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*********************");
	}

}
