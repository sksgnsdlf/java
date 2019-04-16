package co.micol.contruct;

public class ForEach {
	int [][] num = new int[5][5];
	
	public void inputArray() {
		int n=1;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = n++;
			}
		}
		
	}
	public String toString() {
		for(int[] n : num) {
			for(int i : n)
				System.out.print(i + " ");
		}
		return null;
	}
}
