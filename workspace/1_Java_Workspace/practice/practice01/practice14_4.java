package practice;
import java.io.PrintWriter;

public class practice14_4 {
	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = (valueOfSupply - expense) * 0.5;
		double dividend2 = (valueOfSupply - expense) * 0.3;
		double dividend3 = (valueOfSupply - expense) * 0.2;

		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Value of supply : " + vat);
		System.out.println("Total : " + total); // ���ް�+�ΰ���ġ���� ���� �ǸŰ� ����
		System.out.println("Expense : " + expense); // �󸶸� �������� �˷���? �� ����� ������(ex:��ᰪ,���,�ΰǺ��)
		System.out.println("income : " + income); // ���ް�-���=����
		System.out.println("Dividend 1 : " + dividend1); // ���1
		System.out.println("Dividend 2 : " + dividend2); // ���2
		System.out.println("Dividend 3 : " + dividend3); // ���3

		
		
	} 

}