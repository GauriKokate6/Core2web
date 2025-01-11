import java.util.*;

class a1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int count=0;
		System.out.println("even numbers are: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count+=1;
				System.out.print(arr[i] + " ");
			
			}
		System.out.println();
		}
			System.out.println("count of even elements is :" +count);
		}
}

				
		
