import java.util.Scanner;
public class IT24103885Lab3Q1B{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int priceOfKilo;
		int numOfKilo;
		double total;
		double discount;
		double totalAfterDiscount;
		System.out.print("ente rthe price of 1kg of rice : ");
		priceOfKilo = Integer.valueOf(scanner.nextLine());
		System.out.print("ente the num of kilo you want to buy: ");
		numOfKilo = Integer.valueOf(scanner.nextLine());
		total = priceOfKilo*numOfKilo;
		discount = total*0.10;
		totalAfterDiscount = total-discount ;
		System.out.print("the amount with 10% discount is: " + totalAfterDiscount);
	}	
}