class c15{

	static void boundary(int[][] arr){
		int n=arr.length;
		int i=0;
		int j=0;
		while(n>1){
		for(int x=0;x<n-1;x++){
			System.out.print(arr[i][j]+ " ");
			j++;
			
		}

		for(int x=0;x<n-1;x++){
			System.out.print(arr[i][j]+ " ");
			i++;
		}

		for(int x=0;x<n-1;x++){
			System.out.print(arr[i][j]+ " ");
			j--;
		}

		for(int x=0;x<n-1;x++){
			System.out.print(arr[i][j]+ " ");
			i--;
		}

		n-=2;
		i++;
		j++;


	}
	if(n==1){
		System.out.println(arr[i][j]);
	}

	}
	public static void main(String[] args){
		int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	        boundary(arr);
}
}
