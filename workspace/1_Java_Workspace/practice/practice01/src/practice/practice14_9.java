package practice;


public class practice14_9 {
	public static double valueOfSupply; // ������ ����(�� ������ x)
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {

		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		// ���� valueOfSupply���� �Ʒ� getVAT() �ȿ� valueOfSupply������ ����
		// �Ʒ� getVAT() �ȿ� valueOfSupply���� ���ؼ� 
		// �ǾƷ� private static..�ȿ� getVAT() �ȿ� valueOfSupply���� ��
//		double vat = getVAT(); //������� �޼ҵ带 ȣ��,�����ϴ� �ڵ�
//		double total = getTotal();
//		double expense = getExpense();
//		double income = getIncome();
//		double dividend1 = getDividend1();
//		double dividend2 = getDividend2();
//		double dividend3 = getDividend3(); 
		// ���� �ٷ� �Ʒ� print()�޼ҵ�� ���� �����ϴ� �ڵ�� ����

		print();
		// ������ �ʿ��ϸ� ���⿡ �ٷ� getIncome(); �Ἥ �ҷ����� ��
	}

	private static void print() {
		System.out.println("Value of supply : " + valueOfSupply); // �������������̶� �Ʒ��͵��̶� ȥ�ڴٸ�
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal()); // ���ް�+�ΰ���ġ���� ���� �ǸŰ� ����
		System.out.println("Expense : " + getExpense()); // �󸶸� �������� �˷���? �� ����� ������(ex:��ᰪ,���,�ΰǺ��)
		System.out.println("income : " + getIncome()); // ���ް�-���=����
		System.out.println("Dividend 1 : " + getDividend1()); // ���1
		System.out.println("Dividend 2 : " + getDividend2()); // ���2
		System.out.println("Dividend 3 : " + getDividend3()); // ���3
	}

	private static double getDividend1() {
		return getIncome() * 0.5;
	}
	private static double getDividend2() {
		return getIncome() * 0.3;
	}
	private static double getDividend3() {
		return getIncome() * 0.2;
	}

	private static double getIncome() {
		return valueOfSupply - getExpense(); // 
	}

	private static double getExpense() {
		return valueOfSupply * expenseRate; // �������� �������� �����ذ�
	}

	private static double getTotal() {
		return valueOfSupply + getVAT(); // ���������� �������� ���� ����������, 
	}								// vat�� getVAT()�� �ٲٹǷν� �Ȱ��� ���� �޼�����

	private static double getVAT() {
		return valueOfSupply * vatRate; // �޼ҵ带 ����� �ڵ�
		// ���� valueOfSupply * vatRate;���� ���� �޾� ������ �Ȱ� return�ڵ�� ����
		// �� ���� ù getVAT()�� ���ư��� �Ǿ� double vat�� 1000.0�� �Ǵ� ����
		// 1������ �ڵ忴�ٸ� �̰� �ϳ��� ���̰� �� ��!
	} 

}