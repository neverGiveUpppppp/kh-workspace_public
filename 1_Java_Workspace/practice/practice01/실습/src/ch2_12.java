
public class ch2_12 {

	public static void main(String[] args) {


		
		System.out.println(10.0/3); //
		
		
		System.out.printf("%d%n", 15); // 10����(decimal number)
		System.out.printf("%o%n", 15); // 8����(octal)
		System.out.printf("%x%n", 15); // 16����(hexadecimal)

		System.out.println();
		
//		System.out.printf("%#d%n", 15); // 10������ ���λ� ��� #���̸� ����
		System.out.printf("%#o%n", 15); // ���λ� ���̰� ���� �� ������ �� #�߰�
		System.out.printf("%#x%n", 15); // ���λ� ���̰� ���� �� ������ �� #�߰�
		System.out.printf("%s", Integer.toBinaryString(15)); // 10������ 2������ ����ϴ� �����ڴ� ����x
										// ���� �޼ҵ� ����ؾ߸���
		System.out.println();
		System.out.println();
		
		float f = 123.456789f; // ������� 7���� ����(123.4567/7�ڸ�). ������� ������ 8�ڸ����� ����
		double ff = 123.456789; // double�� ���е� 15�ڸ�����
		System.out.printf("%f%n", f);
		System.out.printf("%f%n", ff);
		System.out.printf("%e%n", ff); // �������� ������ %e
		System.out.printf("%g%n", ff); // ����ȭ ������ %g // ���ڸ�6�ε� �ݿø��Ǽ� 7
		
		
	}

}
