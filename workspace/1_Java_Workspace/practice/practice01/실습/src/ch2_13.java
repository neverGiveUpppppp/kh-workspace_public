
public class ch2_13 {

	public static void main(String[] args) {

		
		System.out.printf("[%5d]%n", 1234567); // ���þ� ���� : ��ü�ڸ���
		System.out.printf("[%-5d]%n", 10); // - : ��������
		System.out.printf("[%05d]%n", 10); // ���� ���� ��� ä��� 0
		System.out.printf("<%05d>%n", 10); // ����ȭ ������ %g // ���ڸ�6�ε� �ݿø��Ǽ� 7
		
		double d = 1.23456789;			 // �� 10�ڸ�
		System.out.printf("%14.10f", d); // �� �����ĭ�� �ڿ� 0 2���ؼ� ��14�ڸ�
		System.out.println();
		System.out.printf("%14.6f", d); // ���̴� �͸� ���ڸ�8�̰� ��������� ���� ����� 789���� �� ����Ǿ�����
		System.out.println();
		System.out.printf("%.6f", d); // �Ҽ��� 6�ڸ�
		System.out.println();
		System.out.println();
		
		System.out.printf("%14.10f%n", d); // �� �����ĭ�� �ڿ� 0 2���ؼ� ��14�ڸ�
		System.out.printf("%14.6f%n", d); // ���̴� �͸� ���ڸ�8�̰� ��������� ���� ����� 789���� �� ����Ǿ�����
		System.out.printf("%.6f%n", d); // �Ҽ��� 6�ڸ�
		
		
	}

}
