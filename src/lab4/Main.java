package lab4;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ange ett räknesätt: ");
		String räknesätt = scan.nextLine();
		

		System.out.println("Ange ett tal: ");
		int tal1 = scan.nextInt(); //Rader
		
		System.out.println("Ange ett ytterligare tal: ");
		int tal2 = scan.nextInt(); //Kolumner
		ArithmeticTable table = null;
		
		
		switch (räknesätt.charAt(0)) {
		
			case '*':
				//table = new MultiplicationTable(tal1,tal2);
				Operation multi = new MultiplikationOperation();
				table = new ArithmeticTable(multi,tal1,tal2);
				break;
			
			case '+':;
				//table = new AdditionTable(tal1,tal2);
				Operation add = new AdditionsOperation();
				table = new ArithmeticTable(add,tal1,tal2);
				break;
				
			case '-':
				//table = new SubtractionTable(tal1,tal2);
				Operation sub = new DivisionOperation();
				table = new ArithmeticTable(sub,tal1,tal2);
				break;
				
			case '/':
				//table = new DivisionTable(tal1,tal2);
				Operation div = new DivisionOperation();
				table = new ArithmeticTable(div,tal1,tal2);
				break;
		}
		
		table.print();
	}
}