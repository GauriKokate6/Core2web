import java.util.*;

class a5{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		int [] arr =new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("array in reverse order is :");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}
