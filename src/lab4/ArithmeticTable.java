package lab4;

public abstract class ArithmeticTable{

	int rows;
	int cols;
	
	public ArithmeticTable(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
	}
	
	public abstract int evaluate(int x, int y);
	
	public void print() {
		
		int nbrSize = (String.valueOf(cols*rows).length())+2;
		String nSize = "%" + nbrSize + "d";
		
		//Första raden, header
		System.out.format("   * |");
		for (int i = 0; i <= cols; i++) {
			System.out.format(nSize ,  i);
		}
		System.out.println();
		System.out.print("-----+");
		for (int k = 0; k <= nbrSize * cols + nbrSize; k++) {
			System.out.format("-");
			
		}
		System.out.println();
		
		//Printar vänster kolumn
		for (int i = 0; i <= rows; i++) {
			System.out.format("%4d |", i);
			
			for (int j = 0; j <= cols; j++) {
				System.out.format(nSize ,  evaluate(i, j));
			}
			System.out.println();
				
		}
	}
}