package practice;

// �ݺ��� Loop
public class practice14_8 {
	public static void main(String[] args) { // ���� String[] args�� ���ڿ��� �̷���� �迭�̶� �ǹ�

		double valueOfSupply = 10000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		

		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total : " + total); // ���ް�+�ΰ���ġ���� ���� �ǸŰ� ����
		System.out.println("Expense : " + expense); // �󸶸� �������� �˷���? �� ����� ������(ex:��ᰪ,���,�ΰǺ��)
		System.out.println("income : " + income); // ���ް�-���=����
		
		double[] dividendRates = new double[3]; // double[] : ���������� �̷���� �迭�̶� ����
		dividendRates[0] = 0.5;		    // new double[3] : ������������ ���� ���� �� �ִ� ���� ����
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		// println()�� �ݺ������� �ذ�
		int i = 0; // ���� �ʱ�ȭ �� �ݺ����� ���
		while(i < dividendRates.length) { // dividend�� ��(�����ڼ�)��ŭ �ݺ��ؾ���
			System.out.println("Dividend 1 : " + (income * dividendRates[i])); // dividend1�� dividendRates[i]�� ����
			i = i + 1;
		// arguments�� �Է°� �Է�	
		}

		
		
	} 

}