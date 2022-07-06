package Matrix;

public class SnakePattern {
	
	public static void Snake(int matrix[][]) {
		
		for(int i=0 ;i<matrix.length;i++) {
			if(i%2==0) {
				for(int j=0 ;j<matrix[i].length;j++) {
					System.out.print(matrix[i][j]);
					
				}
				System.out.println();
			}
			else {
				for(int j=matrix[i].length-1;j>=0;j--) {
					System.out.print(matrix[i][j]);
					
				}
				
			}
		}
		
		
		
	}
	
	

	public static void main(String[] args) {
		
//		int R=3;
//		int C=3;
		//int matrix[][]= new int[R][C];
		
		int matrix[][]= {{1,2,3,4},{5,6,7,8}};
		
		Snake(matrix);
		
		}
		

	}


