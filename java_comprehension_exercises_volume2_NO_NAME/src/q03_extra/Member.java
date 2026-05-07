package q03_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Member {
	private int id;
	private String password;
	private String name;
	private Date birthday;
	private int rank;
	private List<Coupon> coupons;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * 
	 */
	public Member() {
	}

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param birthday
	 * @param rank
	 * @param coupons
	 */
	public Member(int id, String password, String name, Date birthday, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.rank = rank;

	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + birthday + ", rank="
				+ rank
				+ ", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
	}

	public static Member getInstance(int id, String password, String name, String birthdayString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date birthday = null;

		try {
			birthday = sdf.parse(birthdayString);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Random random = new Random();
		int rank = random.nextInt(3) + 1;

		Member member = new Member(id, password, name, birthday, rank);

		Coupon coupon1 = Coupon.getInstance(1, 0.5, "最初の特典");
		Coupon coupon2 = Coupon.getInstance(2, 0.25, "今月の特典");

		member.coupons.add(coupon1);
		member.coupons.add(coupon2);

		return member;
	}
}
