class ArrayDemo{
        static int secLar(int arr[]){
		int largest=Integer.MIN_VALUE;
		int seclar=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				seclar=largest;
				largest=arr[i];
			}
		}
		return seclar;
				
	}

		

	public static void main(String[] args){
		int[] arr=new int[]{1,2,3,4,5,5,5,5,5,5,7,7};
		System.out.println(secLar(arr));
	}
}

