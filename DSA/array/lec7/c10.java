class c10{

	static void diag(int[][] arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			int k=0;
			for(int j=0;j<arr[0].length;j++){
				if(i+j==n-1-k){
					System.out.print(arr[i][j]+ " ");
				
				}
			}
			k++;
			System.out.println();
		}


	}
	public static void main(String[] args){
		int[][] arr = new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
		diag(arr);
	}
}
