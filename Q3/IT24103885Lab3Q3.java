import java.util.Scanner;
public class IT24103885Lab3Q3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int numOf5000=0,numOf1000=0,numOf500=0,numOf200=0,numOf100=0,numOf50=0,numOf20=0,numOf10=0,numOf05=0,numOf02=0,numOf01=0;
		int amount;
		System.out.print("enter the rupee amount : ");
		amount  = scanner.nextInt();
		numOf5000 = amount/5000;
		amount = amount%5000;
		numOf1000 = amount/1000;
		amount = amount%1000;
		numOf500 = amount/500;
		amount = amount%500;
		numOf200 = amount/200;
		amount = amount%200;
		numOf100 = amount/100;
		amount = amount%100;
		numOf50 = amount/50;
		amount = amount%50;
		numOf20 = amount/20;
		amount = amount%20;
		numOf10 = amount/10;
		amount = amount%10;
		numOf05 = amount/5;
		amount = amount%5;
		numOf02 = amount/2;
		amount = amount%2;
		numOf01 = amount/1;
		amount = amount%1;

		System.out.println("5000 notes : " + numOf5000);
		System.out.println("1000 notes : " + numOf1000);
		System.out.println("500 notes : " + numOf500);
		System.out.println("200 notes : " + numOf200);
		System.out.println("100 notes : " + numOf100);
		System.out.println("50 notes : " + numOf50);
		System.out.println("20 notes : " + numOf20);
		System.out.println("10 notes : " + numOf10);
		System.out.println("05 coins : " + numOf05);
		System.out.println("02 coins : " + numOf02);
		System.out.println("01 coins : " + numOf01);
		
	}
}