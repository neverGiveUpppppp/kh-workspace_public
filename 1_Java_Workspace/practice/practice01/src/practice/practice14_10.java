package practice;

// 14.19 Class


class Accounting{
	public static double valueOfSupply; // ������ ����(�� ������ x)
	public static double vatRate;
	public static double expenseRate;
	

	public static void print() {
		System.out.println("Value of supply : " + valueOfSupply); // �������������̶� �Ʒ��͵��̶� ȥ�ڴٸ�
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal()); // ���ް�+�ΰ���ġ���� ���� �ǸŰ� ����
		System.out.println("Expense : " + getExpense()); // �󸶸� �������� �˷���? �� ����� ������(ex:��ᰪ,���,�ΰǺ��)
		System.out.println("income : " + getIncome()); // ���ް�-���=����
		System.out.println("Dividend 1 : " + getDividend1()); // ���1
		System.out.println("Dividend 2 : " + getDividend2()); // ���2
		System.out.println("Dividend 3 : " + getDividend3()); // ���3
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense(); // 
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate; // �������� �������� �����ذ�
	}

	public static double getTotal() {
		return valueOfSupply + getVAT(); // ���������� �������� ���� ����������, 
	}								// vat�� getVAT()�� �ٲٹǷν� �Ȱ��� ���� �޼�����

	public static double getVAT() {
		return valueOfSupply * vatRate; // �޼ҵ带 ����� �ڵ�
	} 
}
public class practice14_10 {
	
	public static void main(String[] args) {

		Accounting.valueOfSupply = 10000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
	}


}