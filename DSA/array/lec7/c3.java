class c3{

	static void printarr(int[][] arr){
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[0].length;j++){
				sum+=arr[i][j];
			
			}
			System.out.println(sum);

		}
	}
	public static void main(String[] args){
		int[][] arr=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	
	printarr(arr);
}
}
















