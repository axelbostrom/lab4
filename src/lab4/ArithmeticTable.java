package lab4;

public class ArithmeticTable{

	int rows;
	int cols;
	Operation op;
	
	public ArithmeticTable(Operation op, int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.op = op;
	}
	
	public int evaluate(int x , int y) {
		return 0;
	}
	
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
			
			//Räkning, skickas till evaluate
			for (int j = 0; j <= cols; j++) {
				System.out.format(nSize , op.evaluate(i, j));
			}
			System.out.println();
		}
	}
}