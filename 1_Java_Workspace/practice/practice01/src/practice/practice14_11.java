package practice;

// 14.11 Instance

class Accountingg{
	public double valueOfSupply; // ������ ����(�� ������ x)
	public double vatRate;
	public double expenseRate;
	

	public void print() {
		System.out.println("Value of supply : " + valueOfSupply); // �������������̶� �Ʒ��͵��̶� ȥ�ڴٸ�
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal()); // ���ް�+�ΰ���ġ���� ���� �ǸŰ� ����
		System.out.println("Expense : " + getExpense()); // �󸶸� �������� �˷���? �� ����� ������(ex:��ᰪ,���,�ΰǺ��)
		System.out.println("income : " + getIncome()); // ���ް�-���=����
		System.out.println("Dividend 1 : " + getDividend1()); // ���1
		System.out.println("Dividend 2 : " + getDividend2()); // ���2
		System.out.println("Dividend 3 : " + getDividend3()); // ���3
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return valueOfSupply - getExpense(); // 
	}

	public double getExpense() {
		return valueOfSupply * expenseRate; // �������� �������� �����ذ�
	}

	public double getTotal() {
		return valueOfSupply + getVAT(); // ���������� �������� ���� ����������, 
	}								// vat�� getVAT()�� �ٲٹǷν� �Ȱ��� ���� �޼�����

	public double getVAT() {
		return valueOfSupply * vatRate; // �޼ҵ带 ����� �ڵ�
	} 
}



class Accountingg1{
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


class Accountingg2{
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

public class practice14_11 {
	
	public static void main(String[] args) {

//		Accountingg.valueOfSupply = 10000.0;
//		Accountingg.vatRate = 0.1;
//		Accountingg.expenseRate = 0.3;
//		Accountingg.print();
		
		// ���� Ŭ������ ���� ���� �ϳ��� ���� ��Ų �� 
		// but, ����ǰ�� ���� ������ Ŭ������ ���� ����� �Ź� �� ����������ϴ� ���ŷο���...
		// �׷��� Instance�� ��� : new Ŭ������();
//		Accountingg1.valueOfSupply = 10000.0;
//		Accountingg1.vatRate = 0.1;
//		Accountingg1.expenseRate = 0.3;
//		Accountingg1.print();
//
//		Accountingg2.valueOfSupply = 20000.0;
//		Accountingg2.vatRate = 0.5;
//		Accountingg2.expenseRate = 0.2;
//		Accountingg2.print();
		
		
		// Instance : Ŭ���� �̸� �տ� new�� �ٿ��� ������� ���𰡰� �ν��Ͻ�
		// �ν��Ͻ��� ������ ����� Ŭ�������� public �տ� static�� ���̸� �ȵȴ�. �����ؾ���
		Accountingg a1 = new Accountingg(); // a1���� �� Accountingg�� �ǹ̴� 
		       // a1������ �����δ� Accountingg Ŭ������ �������� ��� �� �� �ִٴ� �ǹ�
		a1.valueOfSupply = 20000.0;
		a1.vatRate = 0.5;
		a1.expenseRate = 0.2;
		a1.print();
		
		Accountingg a2 = new Accountingg(); 
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.5;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print(); // a1.print();�� �� �ᵵ �� �۵��Ѵٴ� ���� Ȯ���ϱ� ���� �ߺ��ڵ�
		
	}


}