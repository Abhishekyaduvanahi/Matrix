package Matrix;

public class Matrix3 {
	
	public static void display(int arr[][]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		// Passing matrix as an argument......
		int arr[][]= {{1,3,4,5,6},{6,7,8,9,10,4}};
		display(arr);

	}

}
