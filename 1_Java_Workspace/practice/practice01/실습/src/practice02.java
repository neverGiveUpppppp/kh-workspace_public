
import org.opentutorials.iot.Elevator; 

public class practice02 {
	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // ��������. 1.0���� ���
		System.out.println(b);
		
//		int c = 1.1
//		double d = 1.1;
//		int e = (int) 1.1;
//	
		double b1=1;              // �ڵ� ĳ����
		double b2 = (double) 1; // ���� ĳ����. ��������� �ٲ��� ��
//		�� ���� ���� �ڵ�
		System.out.println(b1);
		System.out.println(b2);
		System.out.println();

//		*int to str ĳ���� �˻�
		String f = Integer.toString(1);  // �������� ���ڿ��� ��ȯ

//		.getClass() : �ش� ������ � Ÿ������ �˷���(���̽��� type()�Լ� ����)
//		ex) 
		System.out.println(f.getClass());
		
	}

}
