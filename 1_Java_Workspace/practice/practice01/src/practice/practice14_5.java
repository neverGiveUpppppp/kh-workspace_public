package practice;

public class practice14_5 {
	public static void main(String[] args) { // String[] args�� strŸ���̶� �Ʒ� args�� double
											 // ������ ���⿡ �Ʒ��� Double.parseDouble()�� ĳ����
		// run configuration���� arguments�� ���� �̸� �����Ͽ� ���־��� �׸� �߰��صΰ�
		// application���� ����ϸ� ����
		
		double valueOfSupply = Double.parseDouble(args[0]); // 
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;

		if (income > 10000.0) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1.0;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total); // ���ް�+�ΰ���ġ���� ���� �ǸŰ� ����
		System.out.println("Expense : " + expense); // �󸶸� �������� �˷���? �� ����� ������(ex:��ᰪ,���,�ΰǺ��)
		System.out.println("income : " + income); // ���ް�-���=����
		System.out.println("Dividend 1 : " + dividend1); // ���1
		System.out.println("Dividend 2 : " + dividend2); // ���2
		System.out.println("Dividend 3 : " + dividend3); // ���3

		
		
	} 

}