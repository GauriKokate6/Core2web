class ArrayDemo{
	static void reverseNum(int arr[]){
		//int k=arr.length-1;
		int[] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arr2[i]=arr[arr.length-i-1];
			
		}
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+ " ");
		}
	}

	public static void main(String[] args){
		int[] arr=new int[]{0,5,6,9,8,2};
		reverseNum(arr);
	
	}
}

