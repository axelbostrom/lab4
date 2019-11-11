package lab4;

public class AdditionTable extends ArithmeticTable {;
	
	public AdditionTable(int rows, int cols) {
		
		super(rows, cols);
		//super.print();
		
	}

	public int evaluate(int x, int y) {
		return x+y;
	}
}