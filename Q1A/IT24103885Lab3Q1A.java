import java.util.Scanner;
public class IT24103885Lab3Q1A{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double priceOfKilo;
		double numOfKilo;
		double total;
		System.out.print("ente rthe price of 1kg of rice : ");
		priceOfKilo = Integer.valueOf(scanner.nextLine());
		System.out.print("ente the num of kilo you want to buy: ");
		numOfKilo = Integer.valueOf(scanner.nextLine());
		total = priceOfKilo*numOfKilo;
		System.out.print("the total amount is: " + total);
	}	
}