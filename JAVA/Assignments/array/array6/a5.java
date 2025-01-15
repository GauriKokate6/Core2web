import java.util.*;

class a5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array1:");
		int size1=sc.nextInt();
		System.out.println("enter size of array2:");
		int size2=sc.nextInt();
		
		int[] arr1=new int[size1];
		int[] arr2=new int[size2];
		System.out.println("enter array1 elements:");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
                System.out.println("enter array2 elements:");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
                int s=size1+size2;
		int[] arr=new int[s];
		for(int i=0;i<arr1.length;i++){
			arr[i]=arr1[i];
		}
		   
		for(int i=0;i<arr2.length;i++){
			arr[i+arr1.length]=arr2[i];
		}
		System.out.println("array 1 elements are:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
