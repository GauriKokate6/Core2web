class c11{
	static void printArr(int[][] arr){
		int n=arr[0].length;
		int m=arr.length;
		for(int j=n-1;j>=0;j--){
			int i=0;
			int y=j;
			while(i<m && y>=0){
				System.out.print(arr[i][y]+ " ");
				i++;
				y--;
			}
			System.out.println();
		}
                    

	}
	public static void main(String[] args){
		int[][] arr=new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30}};
		printArr(arr);
	}
}
