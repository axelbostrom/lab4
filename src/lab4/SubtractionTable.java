package lab4;

public class SubtractionTable extends ArithmeticTable {
	
	public SubtractionTable(int rows, int cols) {
		
		super(rows, cols);
		//super.print();
		
	}

	public int evaluate(int x, int y) {
		return x-y;
	}
}