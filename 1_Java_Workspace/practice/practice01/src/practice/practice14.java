package practice;

public class practice14 {
	public static void main(String[] args) {

		double valueOfSupply = 10000.0;
		System.out.println("Value of supply : " + valueOfSupply);
		double vatRate = 0.1;
		System.out.println("Value of supply : " + valueOfSupply*vatRate);
		System.out.println("Total : " + ( valueOfSupply + valueOfSupply*vatRate)); // ���ް�+�ΰ���ġ���� ���� �ǸŰ� ����
		double expenseRate = 0.3;
		System.out.println("Expense : " + ( valueOfSupply*expenseRate)); // �󸶸� �������� �˷���? �� ����� ������(ex:��ᰪ,���,�ΰǺ��)
		System.out.println("income : " + ( valueOfSupply - valueOfSupply*expenseRate)); // ���ް�-���=����
		System.out.println("Dividend 1 : " + ( valueOfSupply - valueOfSupply*0.3) * 0.5); // ���1
		System.out.println("Dividend 2 : " + ( valueOfSupply - valueOfSupply*0.3) * 0.3); // ���2
		System.out.println("Dividend 3 : " + ( valueOfSupply - valueOfSupply*0.3) * 0.2); // ���3

		
		
	} 

}