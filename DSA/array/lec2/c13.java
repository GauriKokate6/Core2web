class Rotate{

	static int[] Rotate(int[] arr,int n,int k){
		int l=0;
		int[] arr2=new int[n];
		for(int i=k;i<n;i++){
			arr2[l]=arr[i];
			l++;
		}

		for(int i=0;i<k;i++){
			arr2[l]=arr[i];
			l++;
		}

		for(int i=0;i<n;i++){
			arr[i]=arr2[i];
		}

		return arr;
	}

	public static void main(String[] args){
		int[] arr = new int[]{1,2,3,4,5};
		int[] arr2=Rotate(arr,arr.length,3);
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
	}
}
