class ArrayDemo{

	static void swapDemo(int arr[]){
		int k=arr.length-1;
		
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
			k--;
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args){
		int[] arr=new int[]{1,2,3,4,5,6,7};
		swapDemo(arr);
	}
}

