class c14{

	static void boundary(int[][] arr){
		int n=arr.length;
		int i=0;
		int j=0;
		for(;j<n-1;j++){
			System.out.print(arr[i][j]+ " ");
			
		}

		for(;i<n-1;i++){
			System.out.print(arr[i][j]+ " ");
		}

		for(;j>0;j--){
			System.out.print(arr[i][j]+ " ");
		}

		for(;i>0;i--){
			System.out.print(arr[i][j]+ " ");
		}


	}
	public static void main(String[] args){
		int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	        boundary(arr);
}
}
