class c8{

	static void printarr(int[][] arr){
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[0].length;j++){
				if(i+j==arr.length-1){
					System.out.println(arr[i][j]);
				}
			
			}
			

		}
		
	}
	public static void main(String[] args){
		int[][] arr=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	
	printarr(arr);
}
}
















