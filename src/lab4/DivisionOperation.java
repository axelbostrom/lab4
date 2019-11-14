package lab4;

public class DivisionOperation implements Operation {

	
	public char symbol() {
		return '/';
	}
	
	public int width(int rows, int cols) {
		return cols;
	}

	public int evaluate(int a, int b) {
		if (b == 0) {
			return 0;
		}else {
			return a/b;
		}
	}
	
}