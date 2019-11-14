package lab4;

public class MultiplikationOperation implements Operation {

	
	public char symbol() {
		return '*';
	}

	public int width(int rows, int cols) {
		return cols;
	}

	
	public int evaluate(int a, int b) {
		return a*b;
	}
	
}
  