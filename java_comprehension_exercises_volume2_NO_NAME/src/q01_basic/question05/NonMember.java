package q01_basic.question05;

public class NonMember extends AbstMember {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public NonMember(String name) {
		this.name = name;
	}

	@Override
	public void buyItem() {
		System.out.println(name + "purchased the item at fixed price");
	}

	@Override
	public void showMember() {
		System.out.println(name + "is a non-mamber");
	}

}
