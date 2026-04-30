package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		MemberStorage memberstorage = new MemberStorage();
		LoginService loginService = new LoginService(memberstorage);
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		ConsoleReader consolereader = new ConsoleReader();
		Member member = null;

		while (!isLogin) {
			try {
				int id = consolereader.inputNumber();
				String pass = consolereader.inputString();

				member = loginService.doLogin(id, pass);

				if (member == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
				} else {
					System.out.println("ログインに成功しました");
					System.out.println("ログインユーザ情報を表示します。");
					isLogin = true;
				}

			} catch (NumberFormatException e) {
				System.out.println("不正な入力です");
				e.printStackTrace();
				return;
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}

		}

		System.out.println(member);

	}

}
