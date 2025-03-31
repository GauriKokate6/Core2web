class ArrayDemo{

static int CountArray(int arr[]){
	int max=Integer.MIN_VALUE;
	int count=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
			max=arr[i];
		}
		
	}
	for(int i=0;i<arr.length;i++){
		if(arr[i]==max){
			count++;
		}
	}
		
	return arr.length-count;
}


public static void main(String[] args){
	int [] arr=new int[]{2,5,1,4,8,0,8,1,3,8};
	System.out.println(CountArray(arr));

}
}
