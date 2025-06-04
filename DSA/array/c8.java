class ArrayDemo{
        static void addEle(int arr[]){
		int N=arr.length;
		
		if(N%2==0){
			int j=arr.length-1;
			int[] arr1=new int[N/2];
			for(int i=0;i<N/2;i++){
				arr1[i]=arr[i]+arr[j];
				j--;
			}
	      for(int i=0;i<arr1.length;i++){
		      System.out.println(arr1[i]);
	      }

		}
				
		if(N%2==1){
			int j=arr.length-1;
			int[] arr1=new int[(N+1)/2];
			for(int i=0;i<N/2;i++){
				arr1[i]=arr[i]+arr[j];
				j--;
			}
			arr1[arr1.length-1]=arr[N/2];
	      for(int i=0;i<arr1.length;i++){
		      System.out.println(arr1[i]);
	      }
		}

	      //for(int i=0;i<arr1.length;i++){
		//      System.out.println(arr1[i]);
	      //}

	}

		

	public static void main(String[] args){
		int[] arr=new int[]{1,2,3,5,7,7};
		addEle(arr);
	}
}

