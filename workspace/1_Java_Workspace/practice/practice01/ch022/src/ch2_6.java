
public class ch2_6 {
	public static void main(String[] args) {

		final int score = 100;
		boolean power = true;
		
		byte b = 127; // byte ���� : -128 ~ 127
//		byte b = 128; // byte ���� �Ѿ ����
		
		int oct = 010;  // 8����, 10������ 8
		int hex = 0x10; // 16����, 10������ 16
		
//		long l = 1000_000_000; // _�� ���������� ���ü��� ���� ����
//		long l = 10_000_000_000; // int�����ʰ��� ����
		long l = 10_000_000_000L; // ���λ�L�� ��������
		
//		float f = 3.14;  // ���̻�f�ٿ��� ���� �ذᰡ��
//		double d = 3.14;
		double d = 3.14f; // ������ �÷�Ʈ���� �о �����߻�x
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		System.out.println();
		System.out.println(score);
		System.out.println(oct);
		System.out.println(hex);
	}

}
