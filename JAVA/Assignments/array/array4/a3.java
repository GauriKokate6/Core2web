import java.util.*;

class a3{
	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();

		if(size<2){
			System.out.println("size should be more than 1");
			return;
		}

		int arr[] = new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
                 int largest=arr[0];
		 int sec=arr[0];

		for(int i=0;i<arr.length;i++){

			if(arr[i]>largest){
				sec=largest;
				largest=arr[i];
			}

			else if(arr[i]>sec && arr[i]!=largest){
				sec=arr[i];
			}

		}

		System.out.println("second largest element is : " + sec);
	}
}



