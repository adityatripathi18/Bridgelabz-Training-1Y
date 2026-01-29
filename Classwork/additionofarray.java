class Array{
	public static void main(String [] args){
		int arr1 [][] = {{ 1,2 } , { 1,2}};
		int arr2 [][] = {{ 2,1 } , { 2,1}};
		int rows = arr1.length;
		int col = arr1[0].length;
		for (int i = 0; i<rows; i++)
		{
			for (int j = 0; j<col; j++)
			{
				System.out.print("addition " + (arr1 [i][j] + arr2 [i][j]) + " " );
			}
			System.out.println();
		}
	}
}