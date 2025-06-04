import java.util.*;

class Prefix3{

	static int[] pSum(int[] arr){

		for(int i=1;i<arr.length;i++){
			arr[i]=arr[i]+arr[i-1];
		}

		return arr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int n=sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();

		}

		int[] arr2=pSum(arr);
		for(int i=0;i<n;i++){
			System.out.println(arr2[i]);
		}
	}
}
		

