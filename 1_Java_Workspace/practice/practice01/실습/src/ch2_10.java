
public class ch2_10 {

	public static void main(String[] args) {

		int x = 4, y = 2;
		int tmp;
		
		// ������ intŸ���̹Ƿ� Ÿ�Ի����ѵ�
		tmp = x; // 1. x���� �ӽú��� tmp�� ����
		x = y;   // 2. y���� x���� ����
		y = tmp; // 3. x���� �ӽ������� tmp�� ���� y���� ����

		
		System.out.println(x); // 
		System.out.println(y); // 
		System.out.println();
		System.out.println("x="+x); // ���ڿ�+���� : ���ڿ� �ڿ� ���ڸ� ���̶�� ��
		System.out.println("y="+y); // 
			
		
		
		
		
	}

}
