package lab4;

public class DivisionOperation implements Operation {

	
	public char symbol() {
		return '/';
	}
	
	public int width(int cols, int rows) {
		return cols;
	}

	public int evaluate(int a, int b) {
		if (a == 0) {
			return 0;
		} else {
			return (b/a);
		}
	}
	
}