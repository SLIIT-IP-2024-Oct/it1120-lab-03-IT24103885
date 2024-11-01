import java.util.Scanner;

public class IT24103885Lab3Q2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double salary;
		double numOfOTHrs;
		double OTRate;
		double total;
		System.out.print("enter the monthly salary : ");
		salary = scanner.nextDouble();
		System.out.print("enter the num of OT hours: ");
		numOfOTHrs = scanner.nextDouble();
		System.out.print("enter the OT hourly rate: ");
		OTRate = scanner.nextDouble();
		total = salary+(numOfOTHrs*OTRate);
		System.out.println("the total salary including OT is : " + total);
	}
}