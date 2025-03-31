class ArrayDemo{

static void PrintArray(int arr[]){
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}


public static void main(String[] args){
	int [] arr={2,5,4,8,7,9};
	PrintArray(arr);
}
}
