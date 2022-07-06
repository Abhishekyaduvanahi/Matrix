package Matrix;

public class TransposeOfMatrix {

	public static void main(String[] args) {

		
		int n =4;
		int m=4;
		int transpose[][] = new int[n][m];
		int matrix[][]= {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
	
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++) {
		
			transpose[i][j]=	matrix[j][i];
			}
		}


		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++) {
		
				matrix[j][i]= transpose[i][j]	;
			}
		}
		
		

		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++) {
		
				System.out.print(matrix[i][j]);	
			}
			System.out.println();
		}
		
		
		}

}
