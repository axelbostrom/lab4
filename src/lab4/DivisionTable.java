package lab4;

public class DivisionTable extends ArithmeticTable {
	
	public DivisionTable(int rows, int cols) {
		
		super(rows, cols);
		//super.print();
		
	}

	public int evaluate(int x, int y) {
		if (y == 0) {
			return 0;
		}
		return x/y;
	}
}