import java.util.*;

class a5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			if(i%2!=0){
				sum+=arr[i];
			
			}
		
		}
			System.out.println("sum of odd indexed elements is:" +sum);
		}
}

				
		
