package lab4;

public class MultiplicationTable extends ArithmeticTable {
	
	public MultiplicationTable(int rows, int cols) {
		
		super(rows, cols);
		//super.print();
		
	}

	public int evaluate(int x, int y) {
		return x*y;
	}
}