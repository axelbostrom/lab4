package lab4;

public class SubtractionOperation implements Operation {


	public char symbol() {
		return '-';
	}

	public int width(int cols, int rows) {
		return cols;
	}

	public int evaluate(int a, int b) {
		return b-a;
	}
	
}