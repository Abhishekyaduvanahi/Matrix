package Matrix;

public class RotateAMatrixby90 {

	public static void main(String[] args) {
		// I thought that given below will work here but its printing reverse of a row then reverse of next row...

		
		int arr[][]= {{1,2},{5,6}};
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length-1;j>=0;j--) {
				System.out.print(arr[i][j]);
		
			}
			System.out.println();
		}
		
		
		

	}

}
