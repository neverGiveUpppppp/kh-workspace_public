
public class practice_everyday03 {

	public static void main(String[] args) {

		// ��ü ���� ���
		// �������� ���̵� ��ȣ �Է�
		// ���� ��Ͽ� �ִ� üũ(�ݺ���)
		// �α��� �Ϸ� �޼���
		
		String[][] users_all = {
				{"choi","1111"},
				{"kim","2222"},
				{"lee","3333"}
		};
		String[][] user_current = {
				{args[0]},
				{args[1]} // id pw ���� �޾ƾ��ϳ�?		
		};
		
		
		boolean userLogin = false;
		for (int i = 0; i < users_all.length; i++) { // 2���� �迭������ �ȿ� �迭 ������ ���´�
//			System.out.println(users_all[i][0]);
//			System.out.println(users_all[i][1]);
//			System.out.println(user_current[i]); // ����� �� ��°� ����?? [Ljava.lang.String;@6504e3b2 ??
												// current�� �迭���̴� ��ü �ΰ��ε� i������ all�� �����̹Ƿ� �ε�����ȣ�� �ȸ¾Ƽ� ����
//			String[] user_current_IdPw = user_current;
//			if (user_current_IdPw[0].equals(users_all[i][0]) && // ��� �α��ν��и� �ߴµ� ���� ������?
//				user_current_IdPw[1].equals(users_all[i][1])	
//						) {
//			if (user_current[0].equals(users_all[i][0]) &&  // ��� �α��ν��и� �ߴµ� ���� ������?
//				user_current[1].equals(users_all[i][1])		
//					) {
				userLogin = true;
				break;
			};
//		};
			
		
		if (userLogin) {
			System.out.printf("�α��� ����%nȯ���մϴ�");
		} else {
			System.out.println("�α��� ����");
		}
		
	}

}